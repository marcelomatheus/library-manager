
import br.unimontes.library.management.model.entity.*;
import br.unimontes.library.management.controller.*;
import br.unimontes.library.management.view.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marce
 */
public class Library1 {
    public static void main(String[] args) {
        //init book process
        BookModel bookModel = new BookModel();
        RegisterBookView bookView = new RegisterBookView();
        BookController bookController = new BookController(bookView,bookModel);
        
        //init author process
        AuthorModel authorModel = new AuthorModel();
        RegisterAuthorView authorView = new RegisterAuthorView();
        AuthorController authorController = new AuthorController(authorModel, authorView);
               
        //init publisher process
        PublisherModel publisherModel = new PublisherModel();
        RegisterPublisherView publisherView = new RegisterPublisherView();
        PublisherController publisherController = new PublisherController(publisherView,publisherModel);
        
        //init user process
        UserModel userModel = new UserModel();
        SignupUserView userView = new SignupUserView();
        UserController userController = new UserController(userView,userModel);
        
        //init loan process
        LoanModel loanModel = new LoanModel();
        ScreenUserView sUserView = new ScreenUserView();
        LoanController loanController = new LoanController(sUserView,loanModel);
       
        
        //init employee process
        EmployeeModel empModel = new EmployeeModel();
        SignupEmployeeView sEmpView = new SignupEmployeeView();
        EmployeeController empController = new EmployeeController(sEmpView,empModel);
        
        
        //init login process
        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView,loginModel);
        loginView.setVisible(true);
        
    }
}
