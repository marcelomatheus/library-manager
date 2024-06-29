/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.BookDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.BookModel;

/**
 *
 * @author marce
 */
public class BookService {

    private BookDAO bookDAO;

    public void register(BookModel book) throws DAOException {
        bookDAO.save(book);
    }
}
