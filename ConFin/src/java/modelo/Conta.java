
package modelo;


public class Conta {
   private int conta_numero;
   private String descricao;
   private String data;
   private double valor;
   private String tipo;
   private String situacao;
   private int pes_codigo;

    //método construtor
    public Conta(int conta_numero, String descricao, String data, double valor, String tipo, String situacao, int pes_codigo) {
        this.conta_numero = conta_numero;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.situacao = situacao;
        this.pes_codigo = pes_codigo;
    }

   
   
    public int getConta_numero() {
        return conta_numero;
    }

    public void setConta_numero(int conta_numero) {
        this.conta_numero = conta_numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getPes_codigo() {
        return pes_codigo;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }
   
   
   
}
