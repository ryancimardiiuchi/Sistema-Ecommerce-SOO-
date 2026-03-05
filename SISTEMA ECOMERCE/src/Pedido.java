
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    public static Scanner ler = new Scanner(System.in);
    private int numero = (int) Math.random();
    LocalDate data;
    String status;
    float valorTotal;
    ArrayList<Produto> produtos = new ArrayList<>();
    Cliente cliente;
    Pagamento pagamento = new Pagamento();

    public Pedido(LocalDate data, String status) {
        this.data = data;
        this.status = status;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Seu produto foi cadastrado.");
    }

    void listarProdutos(Produto produto) {
        for (Produto p : produtos) {
            System.out.println("Produtos cadastrados: " + p.getNome());
        }
    }

    void coisarPedido() {
        float soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getValor();
            System.out.println(produto.getValor());
            System.out.println(soma);
        }

        pagamento.setValor(soma);
        setValorTotal(soma);
        pagamento.setConfimacao(false);
    }

    void confirmarCompra() {
        String metodo = "";
        System.out.println("deseja finalizar sua compra true ou false??");
        boolean opc = Boolean.parseBoolean(ler.nextLine());
        if (opc == true) {
            System.out.println("vai pagar como ?");
            metodo = ler.nextLine();
            pagamento.setTipo(metodo);
            pagamento.pagar();
        } else {
            System.out.println("para finalizar é necessario pagar, mâo de vaca ");
        }

    }

}
