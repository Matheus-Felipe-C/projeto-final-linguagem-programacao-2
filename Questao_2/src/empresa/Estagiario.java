package empresa;

public class Estagiario extends Funcionario implements Temporario {
    private int tempoContrato; //Tempo do contrato em meses
    private double valorPorHora; //Valor do salário por hora trabalhada
    private Funcionario mentor;

    public Estagiario(String nome, String departamento) {
        super(nome, departamento);
    }

    //Modifica a data do contrato
    @Override
    public void renovarContrato(int meses) {
        this.tempoContrato = meses;
    }

    //Cancela o contrato
    @Override
    public void cancelarContrato() {
        this.tempoContrato = 0;
    }

    //Modifica o valor da hora trabalhada
    @Override
    public void modificaValorContrato(double v) {
        this.valorPorHora = v;
    }

    @Override
    public int getTempoContrato() {
        return this.tempoContrato;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public Funcionario getMentor() {
        return mentor;
    }

    public void setMentor(Funcionario mentor) {
        this.mentor = mentor;
    }
    
    
    
}
