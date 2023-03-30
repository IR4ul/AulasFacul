public abstract class Produto {
    private String nome;
    private String marca;
    private double preco;
    private double peso;

    Produto(String nome, String marca, double preco, double peso) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.peso = peso;

    };

    @Override
    public String toString() {
        return "Eu tenho um(a)" + nome + " ,da marca " + marca + " que custa " + preco + " e pesa " + peso + "]";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
