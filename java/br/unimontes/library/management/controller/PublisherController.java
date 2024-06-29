/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.entity.BookModel;
import br.unimontes.library.management.model.entity.PublisherModel;
import br.unimontes.library.management.model.services.PublisherService;
import br.unimontes.library.management.view.RegisterPublisherView;

/**
 *
 * @author marce
 */
public class PublisherController {
    private PublisherModel publisher;
    private RegisterPublisherView publisherView;
    private PublisherService bookService = new PublisherService();

    public PublisherController(PublisherView publisherView, PublisherModel ps) {
        this.publisher = publisher;
        this.publisherView = publisherView;

        this.publisherView.getbSubmitBook().addActionListener(new java.awt.event.ActionListener() {
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

        this.publisherView.getbBackPublisher().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               publisherView.dispose();
            }
        });

    }
}
