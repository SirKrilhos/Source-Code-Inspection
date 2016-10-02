/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author 31517900
 */
public class TicketMachineTeste {
   
    
    @Test 
    public void TicketMachine(){
        TicketMachine tm = new TicketMachine(5);
        assertEquals(5, tm.getValor()); 
    }
    
    @Test
    public void inserir() throws PapelMoedaInvalidaException{
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(20);
        assertEquals(20,tm.getSaldo());
        
    }
    
    @Test
    public void imprimir() throws PapelMoedaInvalidaException, SaldoInsuficienteException{
      TicketMachine tm = new TicketMachine(5);
      tm.inserir(20);
      tm.imprimir();
      assertEquals("R$20",tm.imprimir());
       
      
    }
    
    public TicketMachineTeste() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
}
