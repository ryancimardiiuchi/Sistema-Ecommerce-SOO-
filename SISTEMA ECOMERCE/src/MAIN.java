
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setContentPane(new Interface()); // AQUI você chama seu JPanel
        
        frame.pack();
        frame.setLocationRelativeTo(null); // centraliza
        frame.setVisible(true);
        
        Usuario u1 = new Usuario("Rodrigo", "123456F", "rodrigodogray@gmail.com", "0000", 49798467, "rua dos macacos bairro kong");
        Vendedor v1 = new Vendedor(LocalDate.of(2010, 10, 10), u1.getNome(), u1.getCpf(), u1.getEmail(), u1.getSenha(), u1.getTelefone(), u1.getEndereco());
        Cliente c1 = new Cliente(LocalDate.MAX, "Rodrigo", "190300F", "rodpaim@gmail.com", "1010", 29369023, "rua pedro alvares cabral");
        Administrador a1 = new Administrador(LocalDate.now(), "Felipe Gabriel", "166666FR", "gabrielfelipe@gmail.com", "gabrielabobora123", 5678999, "rua cabeça de vento");
        Pedido p1 = new Pedido(LocalDate.of(2007, Month.MARCH, 10), "A caminho");
        Avaliacao av1 = new Avaliacao(c1, p1);
        Produto pr = new Produto("Roupa Camisa Preta", 100, 2, "camisa preta tamanh GGGGG", LocalDate.now());
        Roupa r1 = new Roupa("GG", "Preta", "Regata", 100, 4, "Regata preta da nike", LocalDate.now());
        Livro l1 = new Livro("adidas", 100, "branca de neve", 257, 4, "conta historia de uma menina que ficou numa casa com 7 anões", LocalDate.now());
        Eletronico e1 = new Eletronico(127, 12, "Microondas", 3000, 10, "Microondas branco de 127 voltagens marca eletrolucks", LocalDate.now());
        
        p1.adicionarProduto(pr);
        p1.adicionarProduto(r1);
        p1.adicionarProduto(l1);
        p1.adicionarProduto(e1);
        p1.adicionarProduto(pr);
        System.out.println("");
        p1.listarProdutos(pr);
        p1.coisarPedido();
        System.out.println(p1.pagamento.getValor());
        p1.confirmarCompra();
        av1.avaliar();
    }

}
