/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.model.services;
import java.sql.Connection;

import java.sql.DriverManager;

import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.JasperCompileManager;

import net.sf.jasperreports.view.JasperViewer;
import br.unimontes.library.management.model.dao.DBSingleton;
import java.sql.SQLException;

/**
 *
 * @author marce
 */
public class ReportService {
    Connection conn = null;
    private Connection RSConnect() throws SQLException{
        return DBSingleton.getInstance().getConnection();
    }
    
    public void reportPublisher(){
       
            try (conn=RSConnceet()) {
                String reportPath = "C:\Temp\reportPublisher.jrxml";
                JasperReport jr = JasperCompileManager.compileReport(reportPath);
                JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                JasperViewer.viewReport(jp);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
}
