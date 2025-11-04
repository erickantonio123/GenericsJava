public class product implements Comparable<product>{
    private String nome;
    private Double preco;

    public product(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public String toString(){
        return "Product [nome=" + nome + ", preco=" + preco + "]";
    }

    @Override
    public int compareTo(product other) {
        return preco.compareTo(other.getPreco());
    }   
}
