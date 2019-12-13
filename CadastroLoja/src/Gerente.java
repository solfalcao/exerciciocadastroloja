public class Gerente extends Funcionario {

    private String nome;
    private String area;
    private float imposto = Float.parseFloat("5");

    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Área do gerente: " + area);
    }

    @Override
    public float calcularImposto() {
        float valorDoImposto = getSalario() * imposto;
        return valorDoImposto;
    }

    public String getArea() {
        return area;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
