
import br.unimontes.library.management.controller.BookController;
import br.unimontes.library.management.model.BookModel;
import br.unimontes.library.management.view.BookView;

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
        BookModel bookModel = new BookModel();
        BookView bookView = new BookView();
        BookController bookController = new BookController(bookModel, bookView);
        bookView.setVisible(true);
    }
}
