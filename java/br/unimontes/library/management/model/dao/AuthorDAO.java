/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.AuthorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author marce
 */
public class AuthorDAO implements Dao<AuthorModel>{
    private Connection conn;
    public AuthorDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }

    @Override
    public int save(AuthorModel entity) throws DAOException {
       int row = 0;
        
        try {           
            String iQuery = "INSERT INTO book(a_cpf, a_name) VALUES (?,?)";       
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entity.getCpf());
            st.setString(2, entity.getName());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entity);
            }
            else throw new DAOException("Error for signup author. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return row;
    }

    @Override
    public int update(AuthorModel entity) throws DAOException {
        return 0;
    }

    @Override
    public int delete(AuthorModel entitity) throws DAOException {
       return 0;
    }

    @Override
    public List<AuthorModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AuthorModel findOne(AuthorModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
