package empresa.funcionarios;

import empresa.Departamento;
import empresa.Projeto;
import empresa.Tarefa;
import java.util.ArrayList;

public class Gerente extends Funcionario {

    public Gerente(String nome, Departamento departamento, Projeto projeto, ArrayList<Tarefa> tarefas) {
        super(nome, departamento, projeto, tarefas);
    }

    public Gerente(String nome, Departamento departamento, Projeto projeto) {
        super(nome, departamento, projeto);
    }
    
    public void demitir(Funcionario f) {
        getDepartamento().removerFuncionario(f);
    }
}
