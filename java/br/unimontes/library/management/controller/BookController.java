/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.BookModel;
import br.unimontes.library.management.model.services.BookService;
import br.unimontes.library.management.view.RegisterBookView;

/**
 *
 * @author marce
 */
public class BookController {

    private BookModel book;
    private RegisterBookView bookView;
    private BookService bookService = new BookService();

    public BookController(RegisterBookView bookView, BookModel book) {
        this.book = book;
        this.bookView = bookView;

        this.bookView.getbSubmitBook().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book.setTitle(bookView.getiNameSignupBook().getText());
                book.setISBN(bookView.getiIsbnSignupBook().getText());
                book.setPages(strToInt(bookView.getiPagesSignupBook().getText()));
                book.getAuthor().setName(bookView.getiAuthorSignupBook().getText());
                book.getPublisher().setCnpj(bookView.getiPublisherSignupBook().getText());
                try{
                bookService.register(book);
                }catch(DAOException DAOex){
                    System.out.println("Error " + DAOex);
                }
            }
        });

        this.bookView.getbBackBook().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookView.dispose();
            }
        });

    }

    //Convert input into int
    public static int strToInt(String valor) {
        try {
            return Integer.valueOf(valor);
        } catch (NumberFormatException e) {  
            return 0;
        }
    }

}
