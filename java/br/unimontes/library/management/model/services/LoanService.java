/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;

import br.unimontes.library.management.model.dao.BookDAO;
import br.unimontes.library.management.model.dao.LoanDAO;
import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.BookModel;
import br.unimontes.library.management.model.entity.LoanModel;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author marce
 */
public class LoanService {
    private LoanDAO loanDAO;
    private BookDAO bookDAO;
    
    //check if book is available
    private boolean availableBook(BookModel book){
        try{
            BookModel bookModelDAO = bookDAO.findOne(book);
            return bookModelDAO.isAvailable();
        }catch(Exception ex){
            return false;
        }
    }
    
    private String dateLoan(){
        LocalDate localdateNow = LocalDate.now();
        Date dateNow = Date.valueOf(localdateNow);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String dateLoan = dateFormat.format(dateNow);
        return dateLoan;
    }
    
    //define 7 days for devolution of book 
    private String dateDevolution(){
        LocalDate localdate = LocalDate.now().plusDays(7);
        Date dateDevolution = Date.valueOf(localdate);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateFormat.format(dateDevolution);
        return date;
    }
    
    public void loan(LoanModel loanModel) throws DAOException{
        
        if(availableBook(loanModel.getBook())){
            loanModel.setDateLoan(dateLoan());
            loanModel.setDateDevolution(dateDevolution());
            loanModel.getBook().setAvailable(false);
            loanDAO.save(loanModel);
        }
    }
    
  
}
