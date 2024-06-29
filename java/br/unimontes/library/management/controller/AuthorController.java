/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
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
    
    public void AuthorController(AuthorModel author, RegisterAuthorView authorView){
        this.author = author;
        this.authorView = authorView;

        this.authorView.getbSubmitAuthor().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                author.setName(authorView.getiNameAuthorSinup().getText());
                try{
                authorService.register(author);
                }catch(DAOException DAOex){
                    System.out.println("Error" + DAOex);
                }
            }
        });

        this.authorView.getbBackAuthor().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               authorView.dispose();
            }
        });
    }
   
    
   
}

