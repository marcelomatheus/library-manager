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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


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
        Statement st = null;
	BookModel book = new BookModel();
	try {
		st = (Statement) conn.createStatement();
		ResultSet rs = null;
		rs = st.executeQuery("SELECT * FROM Book b, Publisher p, Author a WHERE b_isbn='"+entity.getISBN()+"'");
		while (rs.next()) {
                        book.setId(rs.getInt("b_id"));
                        book.setISBN(rs.getString("b_isbn"));
			book.setTitle(rs.getString("b_title"));
                        book.getAuthor().setName(rs.getString("a_name"));
                        book.getPublisher().setCnpj((rs.getString("p_cnpj")));
                        book.setAvailable(rs.getBoolean("b_status"));
                        book.setPages(rs.getInt("b_pages"));
                  
		}
		
		rs.close();
                return book;
               
	} catch (SQLException e) {
		return null;
	}
    }
    
}
