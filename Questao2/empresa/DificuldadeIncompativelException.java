package empresa;

public class DificuldadeIncompativelException extends Exception{

    public DificuldadeIncompativelException() {
        super("Dificuldade incompatível com o nível do funcionario");
    }
    
}
