/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;


import br.unimontes.library.management.model.dao.EmployeeDAO;
import br.unimontes.library.management.model.dao.UserDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.EmployeeModel;
import br.unimontes.library.management.model.entity.LoginModel;
import br.unimontes.library.management.model.entity.UserModel;

/**
 *
 * @author marce
 */
public class LoginService {

    private UserDAO userDAO;
    private EmployeeDAO employeeDAO;
    
    private boolean validateUser(UserModel userSubmit) throws DAOException {
        UserModel userModelDAO = userDAO.findOne(userSubmit);
        if (userModelDAO.getEmail() == userSubmit.getEmail() && userModelDAO.getPassword() == userSubmit.getPassword()) {
            return true;
        }
        else{
            return false;
        }
    }
    
    private boolean validateEmployee(EmployeeModel empSubmit) throws DAOException {
        EmployeeModel empModelDAO = employeeDAO.findOne(empSubmit);
        if (empModelDAO.getEmail() == empSubmit.getEmail() && empModelDAO.getPassword() == empSubmit.getPassword()) {
            return true;
        }
        else{
            return false;
        }
    }
    
    //return 0 == access succefull employee, 1 == access successful user, 2 == access failed
    public int login(LoginModel login) throws DAOException{
        EmployeeModel emp = new EmployeeModel();
        UserModel user = new UserModel();        
        if(login.getTypeLogin() == 0){
            emp.setEmail(login.getEmail());
            emp.setPassword(login.getPassword());
            if(validateEmployee(emp)){
                return 0;
            }
        }else if(login.getTypeLogin() == 1){
            user.setEmail(login.getEmail());
            user.setPassword(login.getPassword());
           if(validateUser(user)){
                return 1;
            }
        }
        return 2;
    }
    
}
