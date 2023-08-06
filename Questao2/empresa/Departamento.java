package empresa;

import empresa.funcionarios.Gerente;
import empresa.funcionarios.Funcionario;
import java.util.ArrayList;

public class Departamento {
    private ArrayList<Funcionario> funcionarios;
    private Gerente gerente;
    private ArrayList<Projeto> projetos;

    public Departamento(ArrayList<Funcionario> funcionarios, Gerente gerente, ArrayList<Projeto> projetos) {
        this.funcionarios = funcionarios;
        this.gerente = gerente;
        this.projetos = projetos;
    }
    
    //Métodos para remover e adicionar funcionários
    public void removerFuncionario(Funcionario f) {
        this.funcionarios.remove(f);
    }    
    
    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }
    
    //Getters e setters
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }
}
