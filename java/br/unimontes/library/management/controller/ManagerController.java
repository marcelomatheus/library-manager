/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.view.RegisterAuthorView;
import br.unimontes.library.management.view.RegisterBookView;
import br.unimontes.library.management.view.RegisterPublisherView;
import br.unimontes.library.management.view.ScreenEmployeeView;
import br.unimontes.library.management.view.SignupEmployeeView;
import br.unimontes.library.management.model.services.ReportService;

/**
 *
 * @author marce
 */
public class ManagerController {
    private RegisterAuthorView authorView = new RegisterAuthorView();
    private RegisterBookView bookView = new RegisterBookView();
    private SignupEmployeeView empView = new SignupEmployeeView();
    private ScreenEmployeeView sEmpView = new ScreenEmployeeView();
    private RegisterPublisherView publisherView = new RegisterPublisherView();
    private ReportService reportService = new ReportService();

    public ManagerController(ScreenEmployeeView sEmpView) {
        this.sEmpView = sEmpView;

        this.sEmpView.getbSignupEmployee().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empView.setVisible(true);
            }
        });
        
        this.sEmpView.getbPublisherRegisterEmp().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherView.setVisible(true);
            }
        });
        
        this.sEmpView.getbBookRegisterEmp().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookView.setVisible(true);
            }
        });
        this.sEmpView.getbBackEmployee().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sEmpView.dispose();
            }
        });
        //
        this.sEmpView.getbAuthorRegisterEmp().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorView.setVisible(true);
            }
        });
        
        
        this.sEmpView.getbReportPublisher().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               empView.setVisible(true);
            }
        });

    }
}
