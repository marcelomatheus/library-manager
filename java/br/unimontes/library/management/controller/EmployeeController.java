/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.EmployeeModel;
import br.unimontes.library.management.model.services.EmployeeService;
import br.unimontes.library.management.view.SignupEmployeeView;

/**
 *
 * @author marce
 */
public class EmployeeController {

    private EmployeeModel emp;
    private SignupEmployeeView empView;
    private EmployeeService empService = new EmployeeService();

    public EmployeeController(SignupEmployeeView empView, EmployeeModel emp) {
        this.emp = emp;
        this.empView = empView;

        this.empView.getbSubmitEmpSignup().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emp.setCpf(empView.getiCpfEmpSignup().getText());
                emp.setName(empView.getiNameEmpSignup().getText());
                emp.setEmail(empView.getiEmailEmpSignup().getText());
                emp.setPassword(empView.getiPasswordEmpSignup().getText());
                try {
                    empService.register(emp);
                } catch (DAOException DAOex) {
                    System.out.println("Error "+DAOex);
                }
            }
        });

        this.empView.getbBackEmpSignup().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empView.dispose();
            }
        });
        
        
    }
}
