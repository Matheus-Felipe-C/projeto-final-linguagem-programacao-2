package gui;

//Classe que chama todas as interfaces gráficas
public class GUI {
    
    //Todos os menus são estáticos para poderem ser chamados em qualquer GUI
    private static MenuInicial menu;
    private static CadastroFuncionario cadastro;
    private static ListarFuncionarios lista;
    
    public static void mostrarMenu() {
        menu.setVisible(true);
    }
    
    public static void mostrarCadastro() {
        cadastro.setVisible(true);
    }
    
    public static void mostrarLista() {
        lista.setVisible(true);
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
