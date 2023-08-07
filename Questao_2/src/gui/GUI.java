package gui;

import empresa.Contratado;
import empresa.Estagiario;
import empresa.Freelancer;
import empresa.Funcionario;
import empresa.Gerente;
import java.util.ArrayList;

//Classe que chama todas as interfaces gráficas
public class GUI {
    
    //Todos os menus são estáticos para poderem ser chamados em qualquer GUI
    private static MenuInicial menu;
    private static CadastroFuncionario cadastro;
    private static ListarFuncionarios lista;
    
    //Objetos para adicionar as informações
    private static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();   
    
    //Metodo para criar um novo funcionario e adicionar na lista
    public static void criarFuncionario(String nome, String departamento, String funcao) 
            throws IllegalArgumentException {
        
        Funcionario f;
        switch (funcao) {
            case "Estagiario" -> f = new Estagiario(nome, departamento);
            case "Freelancer" -> f = new Freelancer(nome, departamento);
            case "Contratado" -> f = new Contratado(nome, departamento);
            case "Gerente" -> f = new Gerente(nome, departamento);
            default -> throw new IllegalArgumentException("Opcao inválida");
        }
        
        listaFuncionarios.add(f);
        lista.adicionaNaLista(f);
    }
    
    //Metodos pra mostrar os menus
    public static void mostrarMenu() {
        menu.setVisible(true);
    }
    
    public static void mostrarCadastro() {
        cadastro.setVisible(true);
    }
    
    public static void mostrarLista() {
        lista.setVisible(true);
    }
    
    //Retorna os funcionarios para o ListarFuncionarios.java
    public static ArrayList<Funcionario> getListaFuncionario() {
        return listaFuncionarios;
    }
    
    //A classe Main só serve pra rodar o projeto quando builda kekw
    public static void main(String[] args) {
        
        //Código padrão do JFrame pra rodar os atributos estáticos
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu = new MenuInicial();
                cadastro = new CadastroFuncionario();
                lista = new ListarFuncionarios();
                
                menu.setVisible(true);
            }
        });
    }
}
