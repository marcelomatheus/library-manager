/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.dao;

import br.unimontes.library.management.model.dao.exception.DAOException;
import java.util.List;

/**
 *
 * @author marce
 */

public interface Dao<T> {
    int save(T entity) throws DAOException;

    int update(T entity) throws DAOException;

    int delete(T entitity) throws DAOException;

    List<T> findAll() throws DAOException;

    T findOne(T entity) throws DAOException;
}

