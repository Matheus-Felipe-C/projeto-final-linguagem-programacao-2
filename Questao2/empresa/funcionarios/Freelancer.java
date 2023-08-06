package empresa.funcionarios;

import empresa.Departamento;
import empresa.Projeto;
import empresa.Tarefa;
import java.util.ArrayList;

public class Freelancer extends Funcionario implements Temporario {
    private int tempoContrato; //Tempo do contrato em meses
    private double valorPorHora; //Valor ganho por hora trabalhada
    
    
    public Freelancer(String nome, Departamento departamento, Projeto projeto, ArrayList<Tarefa> tarefas) {
        super(nome, departamento, projeto, tarefas);
    }

    public Freelancer(String nome, Departamento departamento, Projeto projeto) {
        super(nome, departamento, projeto);
    }

     //Modifica a data do contrato
    @Override
    public void renovarContrato(int meses) {
        this.tempoContrato = meses;
    }

    //Cancela o contrato
    @Override
    public void cancelarContrato() {
        this.tempoContrato = 0;
    }

    //Modifica o valor da hora trabalhada
    @Override
    public void modificaValorContrato(double v) {
        this.valorPorHora = v;
    }

    @Override
    public int getTempoContrato() {
        return this.tempoContrato;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
