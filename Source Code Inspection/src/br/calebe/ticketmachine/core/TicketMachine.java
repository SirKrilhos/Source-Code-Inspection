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
    protected double saldo; // Saldo nem sempre vai ser inteiro
    protected int[] papelMoeda = {2, 5, 10, 20, 50, 100};

    public TicketMachine(int valor) {
        this.valor = valor;
        this.saldo = 0.0; //Saldo virou double 0 = 0.0
    }

    public void inserir(int quantia) throws PapelMoedaInvalidaException {
        System.out.println("Aguarde alguns instantes"); // Adicionado essa linha
        boolean achou = false;
        for (int i = 0; i < papelMoeda.length; i++) { //Sem necessidade de && !achou
            if (papelMoeda[i] == quantia) { // Trocado papelMoeda[1] para [i]
                achou = true;
                this.saldo += quantia; // Essa parte precisa estar dentro desse método.
                System.out.println("Nota Válida"); // Adicionado essa linha
            }
        }
        if (!achou) {
            throw new PapelMoedaInvalidaException();
        }
        
        
    }

    public double getSaldo() {  // Saldo nem sempre vai ser inteiro
        return saldo;
    }

    public Iterator<Double> getTroco() { // Mudar troco pra double 
        return null;
    }

    public String imprimir() throws SaldoInsuficienteException {
        if (saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        String result = "*****************\n";
        result += "*** R$ " + saldo + ",00 ****\n";
        result += "*****************\n";
        return result;
    }
}
