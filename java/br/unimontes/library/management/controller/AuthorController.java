/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.entity.AuthorModel;
import br.unimontes.library.management.view.RegisterAuthorView;
import br.unimontes.library.management.model.services.AuthorService;

/**
 *
 * @author marce
 */
public class AuthorController {
    
    private AuthorModel author;
    private RegisterAuthorView authorView;
    private AuthorService authorService = new AuthorService();
    
    public void authorController(AuthorModel author, RegisterAuthorView authorView){
        this.author = author;
        this.authorView = authorView;

        this.bookView.getbSubmitBook().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book.setTitle(bookView.getiNameSignupBook().getText());
                book.setISBN(bookView.getiIsbnSignupBook().getText());
                book.setPages(bookView.getiPagesSignupBook().getText());
                book.setPublisher(bookView.getiPublisherSignupBook().getText());
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
}
