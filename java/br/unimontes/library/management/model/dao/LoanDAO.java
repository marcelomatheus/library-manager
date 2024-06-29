/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.LoanModel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author marce
 */
public class LoanDAO implements Dao<LoanModel>{
    
    private Connection conn;

    public LoanDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }
    
    @Override
    public int save(LoanModel entity) throws DAOException {
         int row = 0;
        
        try {           
            String iQuery = "INSERT INTO loan(l_bookId, l_dateLoan, l_dateDevolution, e_status) VALUES (?,?,?,?)";       
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setInt(1, entity.getBook().getId());
            st.setString(2,entity.getDateLoan());
            st.setString(3,entity.getDateDevolution());
            st.setInt(4, entity.getStatus());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if(ex.getSQLState().equals("23505")){
                System.out.println("no update");
                return update(entity);
            }
            else throw new DAOException("Error in to do loan. SQLSTATE: "+ex.getSQLState());
        }
        
        return row;
    }

    @Override
    public int update(LoanModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(LoanModel entitity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoanModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public LoanModel findOne(LoanModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
