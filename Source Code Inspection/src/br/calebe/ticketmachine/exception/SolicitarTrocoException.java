/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.exception;

/**
 *
 * @author 31517900
 */
public class SolicitarTrocoException {
    
    public String SolicitarTrocoException(int saldo){
       
        String exception = "Error";
        
         if(saldo == 0){
             exception = "Insira um valor para poder solicitar o troco";
         }
         
         return exception;
    }
    
}
