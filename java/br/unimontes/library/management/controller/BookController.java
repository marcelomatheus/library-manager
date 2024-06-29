/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

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
                book.setPages(bookView.getiPagesSignupBook().getText());
                book.setPublisher(bookView.getiPublisherSignupBook().getText())
                book.setAuthor(bookView.getiAuthorSignupBook().getText());
                book.setAvailable(true);
                bookService.register(book);
            }
        });

        this.bookView.getbBackBook().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               bookView.dispose();
            }
        });

    }
   
}
