/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.UserModel;
import br.unimontes.library.management.model.services.UserService;
import br.unimontes.library.management.view.SignupUserView;

/**
 *
 * @author marce
 */
public class UserController {
    private UserModel user;
    private SignupUserView userView;
    private UserService userService = new UserService();

    public UserController(SignupUserView userView, UserModel user) {
        this.user = user;
        this.userView = userView;

        this.userView. getbSubmitSignup().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user.setCpf(userView.getiCpfUserSignup().getText());
                user.setName(userView.getiNameUserSignup().getText());
                user.setEmail(userView.getiEmailUserSignup().getText());
                user.setPassword(userView.getiPasswordUserSignup().getText());
                try{
                userService.register(user);
                }catch(DAOException DAOex){
                    System.out.println("Error "+DAOex);
                }
            }
        });

        this.userView.getbBackSignup().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               userView.dispose();
            }
        });

    }
}
