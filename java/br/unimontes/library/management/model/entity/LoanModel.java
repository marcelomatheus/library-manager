/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.entity;
import java.util.Date;

/**
 *
 * @author marce
 */
public class LoanModel {
    private int idLoan;
    private BookModel book;
    private UserModel user;
    private String dateLoan;
    private String dateDevolution;
    private int status; //0 for borrowed, 1 for late and 2 returned

    public int getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(int idLoan) {
        this.idLoan = idLoan;
    }

    public BookModel getBook() {
        return book;
    }

    public void setBook(BookModel book) {
        this.book = book;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getDateLoan() {
        return dateLoan;
    }

    public void setDateLoan(String dateLoan) {
        this.dateLoan = dateLoan;
    }

    public String getDateDevolution() {
        return dateDevolution;
    }

    public void setDateDevolution(String dateDevolution) {
        this.dateDevolution = dateDevolution;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
