/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;
import java.sql.Connection;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.view.JasperViewer;
import br.unimontes.library.management.model.dao.DBSingleton;


/**
 *
 * @author marce
 */
public class ReportService {
     
    //Generate report book for publisher
    public void reportPublisher(){
       
            try (Connection conn = DBSingleton.getInstance().getConnection()) {
                String reportPath = "C:\\Temp\\reportPublisher.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                JasperViewer.viewReport(jp);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //Generate report book for author
    public void reportAuthor(){
       
            try (Connection conn = DBSingleton.getInstance().getConnection()) {
                String reportPath = "C:\\Temp\\reportAuthor.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
                JasperViewer.viewReport(jp);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
