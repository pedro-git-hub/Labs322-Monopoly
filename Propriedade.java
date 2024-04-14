public class Propriedade {
    private int id;
    private String nome;
    private String proprietario;
    private int preco;
    private int aluguel;


    //Construtor
    public Propriedade(int id, String nome, String proprietario, int preco, int aluguel) {
        this.id = id;
        this.nome = nome;
        this.proprietario = proprietario;
        this.preco = preco;
        this.aluguel = aluguel;
    }

    // Getter e Setters:
    public String getNome() {
        return nome;
    }
    public void setNome(String novo_nome) {
        this.nome = novo_nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int novo_id) {
        this.id = novo_id;
    }

    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String novo_propriotario) {
        this.proprietario = novo_propriotario;
    }

    public int getPreco() {
        return preco;
    }
    public void setPreco(int nova_preco) {
        this.preco = nova_preco;
    }

    public int getAluguel() {
        return aluguel;
    }
    public void setAluguel(int novo_aluguel) {
        this.aluguel = novo_aluguel;
    }
    
    public int calcularAluguel() {
        return aluguel;
    }
}
