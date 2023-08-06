package empresa.funcionarios;

public interface Temporario {
    public void renovarContrato(int meses);
    public void cancelarContrato();
    public void modificaValorContrato(double v);
    public int getTempoContrato();
    
}
