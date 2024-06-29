/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.EmployeeDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.EmployeeModel;

/**
 *
 * @author marce
 */
public class EmployeeService {
    private EmployeeDAO empDAO;

    public void register(EmployeeModel emp) throws DAOException {
        empDAO.save(emp);
    }
}
