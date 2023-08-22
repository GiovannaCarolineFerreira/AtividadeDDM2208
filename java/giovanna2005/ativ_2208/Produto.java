package giovanna2005.ativ_2208;

public class Produto {//Feito por: Giovanna SC3017109
    private String nome;
    private String marca;
    private String quantidade;
    private String comprado;

    public Produto(String nome, String marca, String quantidade) {
        this.nome = nome;
        this.marca = marca;
        this.quantidade = quantidade;
        this.comprado = "";
    }

    public String getNome() {
        return this.nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getQuantidade() {
        return this.quantidade;
    }

    public String getComprado() {
        return this.comprado;
    }

    public void setComprado(String comprado) {
        this.comprado = comprado;
    }
}