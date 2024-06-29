/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.PublisherModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author marce
 */
public class PublisherDAO implements Dao<PublisherModel>{

    private Connection conn;

    public PublisherDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }
    @Override
    public int save(PublisherModel entity) throws DAOException {
        int row = 0;
        
        try {           
            String iQuery = "INSERT INTO publisher(p_cnpj, p_name) VALUES (?,?)";       
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entity.getCnpj());
            st.setString(2,entity.getName());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entity);
            }
            else throw new DAOException("Error for signup publisher. SQLSTATE: "+ex.getSQLState());
        }
        
        return row;
    }

    @Override
    public int update(PublisherModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(PublisherModel entitity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PublisherModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PublisherModel findOne(PublisherModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
