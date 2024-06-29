/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
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
    private PublisherService publisherService = new PublisherService();

    public PublisherController(RegisterPublisherView publisherView, PublisherModel publisher) {
        this.publisher = publisher;
        this.publisherView = publisherView;

        this.publisherView.getbSubmitPublisher().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher.setCnpj(publisherView.getiCnpjPublisherSignup().getText());
                publisher.setName(publisherView.getiNamePublisherSignup().getText());
               
                try{
                publisherService.register(publisher);
                }catch(DAOException DAOex){
                    System.out.println("Error "+DAOex);
                }
            }
        });

        this.publisherView.getbBackPublisher().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               publisherView.dispose();
            }
        });

    }
}
