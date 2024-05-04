public class Servicospublicos extends Propriedade{
    private int dados;

    //Construtor;
    public Servicospublicos(int dados, int id, String descricao, Jogador dono, String nome, String proprietario, int preco, int aluguel) {
        super(id, descricao, dono, nome, proprietario, preco, aluguel);
        this.dados = dados;
    }

    //Getter e Setter
    public int getDados() {
        return dados;
    }

    public void setDados(int novos_dados) {
        this.dados = novos_dados;
    }

    public int calcularAluguel() {
        return (getDados() * getAluguel());
    }
}
