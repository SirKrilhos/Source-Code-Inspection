package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Iterator;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class TicketMachine {

    protected int valor;
    protected int saldo;
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0;
    }
//&& !achou
    public double inserir(int quantia) throws PapelMoedaInvalidaException {
        System.out.println("Aguarde alguns instantes"); // Adicionado essa linha
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length ; i++) { 
            if (papelMoeda[i] == quantia) { // Trocado papelMoeda[1] para [i]
                achou = true;
                this.saldo += quantia; // Essa parte precisa estar dentro desse método.
                System.out.println("Nota Válida"); // Adicionado essa linha
            }
            
        }
        if (achou == false) {
            throw new PapelMoedaInvalidaException();
        }
        
        return this.saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getValor() { // Adicionado esse método
        return valor;
    }

     
    public Iterator<Integer> getTroco() {
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
//      Toda estrutura abaixo foi comentada para efeito de teste do método
//        String result = "*****************\n";
//        result += "*** R$ " + saldo + ",00 ****\n";
//        result += "*****************\n";
          String result = "R$"+saldo; 
        return result;
    }
}
