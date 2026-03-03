
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


public class Avaliacao {
    Scanner ler = new Scanner(System.in);
    ArrayList<Integer> nota = new ArrayList<>();
    ArrayList<String> comentario = new ArrayList<>();
    Cliente cliente;
    Pedido pedido;

    public Avaliacao(Cliente cliente, Pedido pedido) {
        this.cliente = cliente;
        this.pedido = pedido;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

  
    
    void avaliar(){
        LocalDate dataPrazo
            = pedido.getData().plusDays(14);
        LocalDate hoje = LocalDate.now();
            if (!hoje.isBefore(dataPrazo)) {
                for(int i = 0;i<=pedido.produtos.size() ;i++){
                    System.out.println("digite sua nota para o produto: " +pedido.produtos.get(i).getNome()); 
                    nota.add(Integer.parseInt(ler.nextLine())); 
                    System.out.println("digite seu comentario para o produto: " +pedido.produtos.get(i).getNome());
                    comentario.add(ler.nextLine());
                    
                }
                
                
        } else {
            System.out.println("Ainda não chegou.");
        }
       }
        
}
