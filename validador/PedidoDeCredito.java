import java.time.LocalDate;

public class PedidoDeCredito {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private LocalDate dataAberturaConta;
    private String CPF;
    private boolean contaSalario;
    private double salarioMensal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(LocalDate dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public boolean isContaSalario() {
        return contaSalario;
    }

    public void setContaSalario(boolean contaSalario) {
        this.contaSalario = contaSalario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

}
