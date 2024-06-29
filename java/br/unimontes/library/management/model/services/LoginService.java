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
    
    //return 0 == access succefull employee, 1 == access successful user, 2 == acess failed
    public int login(String email, String password, int typeLogin) throws DAOException{
        EmployeeModel emp = new EmployeeModel();
        UserModel user = new UserModel();        
        if(typeLogin == 0){
            emp.setEmail(email);
            emp.setPassword(password);
            if(validateEmployee(emp)){
                return 0;
            }
        }else if(typeLogin == 1){
            user.setEmail(email);
            user.setPassword(password);
           if(validateUser(user)){
                return 1;
            }
        }
        return 2;
    }
    
}
