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
    public void TicketMachine() {
        TicketMachine tm = new TicketMachine(5);
        assertEquals(5, tm.getValor());
    }

    @Test
    public void inserir() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(20);
        assertEquals(20, tm.getSaldo());
        tm.inserir(5); // Já temos 20 de saldo , vamos adicionar mais 5, mas só funciona com uma nota válida
        assertEquals(25, tm.getSaldo());

//        O teste abaixo não passaria e geraria erro
//        tm.inserir(3);
//        assertEquals(28,tm.getSaldo());
    }

    @Test
    public void imprimir() throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        TicketMachine tm = new TicketMachine(5);
        tm.inserir(20);
        tm.inserir(50);
        System.out.println(tm.imprimir());
        assertEquals("R$70", tm.imprimir());
    }

    @Test
    //Esse método representa um exemplo da exception SaldoInsuficiente onde o valor inserido é menor que o valor do bilhete
    public void SaldoInsuficiente() throws PapelMoedaInvalidaException, SaldoInsuficienteException {
        TicketMachine tm = new TicketMachine(10);
        tm.inserir(5);
        System.out.println(tm.imprimir());
        assertEquals("R$5", tm.imprimir());

    }
    
    @Test 
    public void NotaInvalida() throws PapelMoedaInvalidaException{
        TicketMachine tm = new TicketMachine(10);
        assertEquals(3,tm.inserir(3),2);
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
