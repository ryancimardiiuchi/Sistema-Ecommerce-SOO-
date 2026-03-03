                /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class Pagamento {
    private int idTransacao;
    protected float valor;
    protected boolean confimacao;
    protected String tipo;

    public Pagamento() {
    }
    

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isConfimacao() {
        return confimacao;
    }

    public void setConfimacao(boolean confimacao) {
        this.confimacao = confimacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    void pagar(){
        System.out.println("Debitamos" +valor+" da sua conta "+" atraves do metodo"+tipo);
    }
}
