package empresa;

import empresa.funcionarios.Funcionario;
import java.util.ArrayList;

public class Projeto {
    private ArrayList<Tarefa> tarefas;
    private Departamento departamento;
    private ArrayList<Funcionario> funcionarios;
    private String prazo;

    public Projeto(ArrayList<Tarefa> tarefas, Departamento departamento, ArrayList<Funcionario> funcionarios, String prazo) {
        this.tarefas = tarefas;
        this.departamento = departamento;
        this.funcionarios = funcionarios;
        this.prazo = prazo;
    }
    
    //Getters e setters

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
    
}
