package empresa.funcionarios;

import empresa.Departamento;
import empresa.Projeto;
import empresa.Tarefa;
import java.util.ArrayList;

public abstract class Funcionario {
    private String nome;
    private Departamento departamento;
    private Projeto projeto;
    private ArrayList<Tarefa> tarefas;

    public Funcionario(String nome, Departamento departamento, Projeto projeto, ArrayList<Tarefa> tarefas) {
        this.nome = nome;
        this.departamento = departamento;
        this.projeto = projeto;
        this.tarefas = tarefas;
    }

    public Funcionario(String nome, Departamento departamento, Projeto projeto) {
        this.nome = nome;
        this.departamento = departamento;
        this.projeto = projeto;
        this.tarefas = new ArrayList<>();
    }
    
    //Adiciona novas tarefas
    public void adicionarTarefa(ArrayList<Tarefa> tarefas) {
        for (Tarefa t : tarefas) {
            this.tarefas.add(t);
        }
    }
    
    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }
}
