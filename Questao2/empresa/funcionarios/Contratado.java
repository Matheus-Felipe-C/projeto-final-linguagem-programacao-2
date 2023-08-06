package empresa.funcionarios;

import empresa.Departamento;
import empresa.Projeto;
import empresa.Tarefa;
import java.util.ArrayList;

public class Contratado extends Funcionario {

    public Contratado(String nome, Departamento departamento, Projeto projeto, ArrayList<Tarefa> tarefas) {
        super(nome, departamento, projeto, tarefas);
    }

    public Contratado(String nome, Departamento departamento, Projeto projeto) {
        super(nome, departamento, projeto);
    }

}
