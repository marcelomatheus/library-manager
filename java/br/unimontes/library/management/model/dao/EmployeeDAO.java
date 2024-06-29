/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.EmployeeModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author marce
 */
public class EmployeeDAO implements Dao<EmployeeModel>{

    private Connection conn;

    public EmployeeDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }
    
    @Override
    public int save(EmployeeModel entity) throws DAOException {
        int row = 0;
        
        try {           
            String iQuery = "INSERT INTO employee(e_cpf, e_name, e_email, e_password) VALUES (?,?,?,?)";       
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entity.getCpf());
            st.setString(2, entity.getName());
            st.setString(3, entity.getEmail());
            st.setString(4, entity.getPassword());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entity);
            }
            else throw new DAOException("Error for signup employee. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return row;
    }

    @Override
    public int update(EmployeeModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(EmployeeModel entitity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EmployeeModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeModel findOne(EmployeeModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
