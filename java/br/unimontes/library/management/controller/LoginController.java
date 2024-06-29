/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.dao.exception.DAOException;
import br.unimontes.library.management.model.entity.LoginModel;
import br.unimontes.library.management.model.services.LoginService;
import br.unimontes.library.management.view.LoginView;
import br.unimontes.library.management.view.ScreenEmployeeView;
import br.unimontes.library.management.view.ScreenUserView;
import br.unimontes.library.management.view.SignupUserView;
/**
 *
 * @author marce
 */
public class LoginController {
    private LoginModel login;
    private LoginView loginView;
    private LoginService loginService = new LoginService();
    private ScreenUserView suv = new ScreenUserView();
    private ScreenEmployeeView sev = new ScreenEmployeeView();
    private SignupUserView signupuv = new SignupUserView();
    
    public LoginController(LoginView loginView, LoginModel login) {
        this.login = login;
        this.loginView = loginView;
        

        //Tela tela = new Tela(); tela.setVisible(true); this.setVisible(false);
        
        this.loginView.getbSubmitLogin().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int returned = 3;
                login.setEmail(loginView.getInputEmailLogin().getText());
                login.setPassword(loginView.getInputPasswordLogin().getText());               
                try{
                    returned = loginService.login(login);
                }catch(DAOException DAOex){
                    returned = 3;
                }
                switch(returned){
                    case 0:
                        loginView.dispose();
                        sev.setVisible(true);
                        break;
                    case 1:
                        loginView.dispose();
                        suv.setVisible(true);
                        break;
                    case 2:   
                        loginView.gettInforLogin().setText("Usuário ou senha incorreto");
                        break;
                    case 3:
                        loginView.gettInforLogin().setText("Erro ao acessar");
                        break;

                }
               
            }
        });

        this.loginView.getbSignupLogin().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               signupuv.setVisible(true);
            }
        });

    }
}
