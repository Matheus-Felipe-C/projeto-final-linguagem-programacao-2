package empresa.funcionarios;

import empresa.Departamento;
import empresa.DificuldadeIncompativelException;
import empresa.Projeto;
import empresa.Tarefa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Estagiario extends Funcionario implements Temporario {
    private int tempoContrato; //Tempo do contrato em meses
    private double valorPorHora; //Valor do salário por hora trabalhada
    private Funcionario mentor;

    public Estagiario(String nome, Departamento departamento, Projeto projeto) {
        super(nome, departamento, projeto);
    }
    
    @Override
    public void adicionarTarefa(ArrayList<Tarefa> tarefas) {
        try {
            ArrayList<Tarefa> safe = new ArrayList<>(); //Lista de tarefas que podem ser adicionadas
            
            for (Tarefa t : tarefas) {
                verificaDificuldade(t);
                safe.add(t);
                super.adicionarTarefa(safe);
                safe.remove(t);
            }
        } catch(DificuldadeIncompativelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void verificaDificuldade(Tarefa t) throws DificuldadeIncompativelException {
        if (!t.getDificuldade().equalsIgnoreCase("facil")) {
            throw new DificuldadeIncompativelException();
        }
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

    public Funcionario getMentor() {
        return mentor;
    }

    public void setMentor(Funcionario mentor) {
        this.mentor = mentor;
    }
    
    
    
}
