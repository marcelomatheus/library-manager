/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.UserDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.UserModel;

/**
 *
 * @author marce
 */
public class UserService {
    private UserDAO userDAO;

    public void register(UserModel user) throws DAOException {
        userDAO.save(user);
    }
}
