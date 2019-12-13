public class Cliente extends Pessoa {

    private int codigo;

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Código do cliente: " + codigo);
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
