
package modelo;


public class Pessoa {
   private int pes_codigo;
   private String nome;
   private int idade;
   private String email;
   private int cid_codigo;

    //método construtor
    public Pessoa(int pes_codigo, int idade, String email, int cid_codigo) {
        this.pes_codigo = pes_codigo;
        this.idade = idade;
        this.email = email;
        this.cid_codigo = cid_codigo;
    }
   
   

    public int getPes_codigo() {
        return pes_codigo;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(int cid_codigo) {
        this.cid_codigo = cid_codigo;
    }
   
   
}
