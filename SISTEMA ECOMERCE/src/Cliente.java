
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alunolages
 */
public class Cliente extends Usuario{
     public LocalDate dataCadastro;

    public Cliente(LocalDate dataCadastro, String nome, String cpf, String email, String senha, int telefone, String endereco) {
        super(nome, cpf, email, senha, telefone, endereco);
        this.dataCadastro = dataCadastro;
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

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
     
    
   @Override
    void mostrarFicha() {
        super.mostrarFicha();
        System.out.println(dataCadastro+" data de Cadastro" );
    }
     
}
