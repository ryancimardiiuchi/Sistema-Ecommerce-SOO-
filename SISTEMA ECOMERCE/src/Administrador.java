
import java.time.LocalDate;


public class Administrador extends Usuario {
     public LocalDate dataAdmissao;

    public Administrador(LocalDate dataAdmissao, String nome, String cpf, String email, String senha, int telefone, String endereco) {
        super(nome, cpf, email, senha, telefone, endereco);
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
   
  

    @Override
    void mostrarFicha() {
        super.mostrarFicha();
        System.out.println(dataAdmissao+" data de admissao" );
    }

  
    

    


}
