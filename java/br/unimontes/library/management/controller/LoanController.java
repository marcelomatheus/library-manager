/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.LoanModel;
import br.unimontes.library.management.model.services.LoanService;
import br.unimontes.library.management.view.ScreenUserView;

/**
 *
 * @author marce
 */
public class LoanController {
    private LoanModel loan;
    private ScreenUserView loanView;
    private LoanService loanService = new LoanService();

    public LoanController(ScreenUserView loanView, LoanModel loan) {
        this.loan = loan;
        this.loanView = loanView;

        this.loanView.getbBookLoan().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan.getBook().setISBN(loanView.getiIsbnLoan1().getText());
                loan.getUser().setCpf(loanView.getiCpfLoan().getText());               
                try{
                loanService.loan(loan);
                
                }catch(DAOException exDAO){
                    System.out.println("Error "+exDAO);
                }
            }
        });

        this.loanView.getbReturnBookUser().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               loanView.dispose();
            }
        });

    }
}
