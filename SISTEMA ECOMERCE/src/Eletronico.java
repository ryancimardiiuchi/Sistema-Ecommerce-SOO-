
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class Eletronico extends Produto{
    int voltagem;
    int garantiaMes;

    public Eletronico(int voltagem, int garantiaMes,  String nome, float valor, int estoque, String descricao, LocalDate dataCadastro) {
        super( nome, valor, estoque, descricao, dataCadastro);
        this.voltagem = voltagem;
        this.garantiaMes = garantiaMes;
    }
    
    

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getGarantiaMes() {
        return garantiaMes;
    }

    public void setGarantiaMes(int garantiaMes) {
        this.garantiaMes = garantiaMes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Voltagem " +voltagem+" E "+" Garantia Em Meses "+garantiaMes);
    }

    
    
    
    
    
}
