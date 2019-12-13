public class Funcionario extends Pessoa {


    private String nome;
    private float salario;
    private float percentualDoImposto = 0.03F;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Salário: US$" + salario);
        System.out.println("Valor do imposto: " + calcularImposto());
    }

    public float calcularImposto() {
        float valorDoImposto = salario * percentualDoImposto;
        return valorDoImposto;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

}


