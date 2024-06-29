/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.UserModel;
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
public class UserDAO implements Dao<UserModel> {

    private Connection conn;

    public UserDAO() throws SQLException {
        conn = DBSingleton.getInstance().getConnection();
    }

    @Override
    public int save(UserModel entity) throws DAOException {
        int row = 0;

        try {
            String iQuery = "INSERT INTO user(u_cpf, u_name, u_email, u_senha) VALUES (?,?,?,?)";
            PreparedStatement st = conn.prepareStatement(iQuery);
            st.setString(1, entity.getCpf());
            st.setString(2, entity.getName());
            st.setString(3, entity.getEmail());
            st.setString(4, entity.getPassword());
            row = st.executeUpdate();
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("23505")) {
                System.out.println("no update");
                return update(entity);
            } else {
                throw new DAOException("Error for signup book. SQLSTATE: " + ex.getSQLState());
            }
        }

        return row;
    }

    @Override
    public int update(UserModel entity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(UserModel entitity) throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserModel> findAll() throws DAOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserModel findOne(UserModel entity) throws DAOException {
        Statement st = null;
	UserModel user = new UserModel();
	try {
		st = (Statement) conn.createStatement();
		ResultSet rs = null;
		rs = st.executeQuery("SELECT * FROM Employee WHERE email='"+entity.getEmail()+"'");
		while (rs.next()) {
                        user.setIdUser(rs.getInt("u_id"));
                        user.setCpf(rs.getString("u_cpf"));
			user.setName(rs.getString("u_name"));
                        user.setEmail(rs.getString("u_email"));
                        user.setPassword(rs.getString("u_password"));
                    }
		
		rs.close();
                return user;
               
	} catch (SQLException e) {
		return null;
	}
    }
    }


