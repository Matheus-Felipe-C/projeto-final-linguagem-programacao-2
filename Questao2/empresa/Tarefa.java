package empresa;

import empresa.funcionarios.Funcionario;

public class Tarefa {
    private Projeto projeto;
    private Funcionario responsavel;
    private String dificuldade;
    private String prazo;

    public Tarefa(Projeto projeto, Funcionario responsavel, String dificuldade, String prazo) {
        this.projeto = projeto;
        this.responsavel = responsavel;
        this.dificuldade = dificuldade;
        this.prazo = prazo;
    }

    public Tarefa(Projeto projeto, Funcionario responsavel, String dificuldade) {
        this.projeto = projeto;
        this.responsavel = responsavel;
        this.dificuldade = dificuldade;
        this.prazo = "Sem prazo";
    }

    //Getters e setters
    
    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Funcionario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }
    
    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }
    
    
}
