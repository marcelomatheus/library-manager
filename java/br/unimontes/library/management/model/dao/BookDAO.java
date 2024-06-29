/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.BookModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marce
 */
public class BookDAO implements Dao<BookModel>{
    private Connection conn;

    public BookDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }
    
    
    @Override
    public int save(BookModel entity) throws DAOException {
         int row = 0;
        
        try {           
            String iQuery = "INSERT INTO book(b_isbn, b_pages, b_publisher, b_author, b_status) VALUES (?,?,?,?,?)";       
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entity.getISBN());
            st.setInt(2, entity.getPages());
            st.setInt(3, entity.getPublisher().getIdPublisher());
            st.setInt(4, entity.getAuthor().getIdAuthor());
            st.setBoolean(5, entity.isAvailable());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entity);
            }
            else throw new DAOException("Error for signup book. SQLSTATE: "+ex.getSQLState());
        }
        
        
        return row;
    }

    @Override
    public int update(BookModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(BookModel entitity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BookModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BookModel findOne(BookModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
