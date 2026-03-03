
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class Vendedor extends Usuario {
    LocalDate dataAdmissao;

    public Vendedor(LocalDate dataAdmissao, String nome, String cpf, String email, String senha, int telefone, String endereco) {
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
    
    
   
    
    void vender(){
        System.out.println("Vendendo...");
    }

    @Override
    void mostrarFicha() {
        super.mostrarFicha();
        System.out.println(dataAdmissao+" data de admissao" );
    }

  
    

    
}
