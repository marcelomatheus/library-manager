/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.AuthorDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.AuthorModel;

/**
 *
 * @author marce
 */
public class AuthorService {
    private AuthorDAO authorDAO;

    public void register(AuthorModel author) throws DAOException {
        authorDAO.save(author);
    }
}
