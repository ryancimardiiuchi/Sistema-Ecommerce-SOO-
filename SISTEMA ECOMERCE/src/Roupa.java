
import java.time.LocalDate;

public class Roupa extends Produto {

    String tamanho;
    String cor;

    public Roupa(String tamanho, String cor, String nome, float valor, int estoque, String descricao, LocalDate dataCadastro) {
        super(nome, valor, estoque, descricao, dataCadastro);
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Tamanho " + tamanho + " E " + " Cor " + cor);
    }

}
