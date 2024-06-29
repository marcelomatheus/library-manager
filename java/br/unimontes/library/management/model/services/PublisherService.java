/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.PublisherDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.PublisherModel;

/**
 *
 * @author marce
 */
public class PublisherService {
    private PublisherDAO pbDAO;

    public void register(PublisherModel pb) throws DAOException {
        pbDAO.save(pb);
    }
}
