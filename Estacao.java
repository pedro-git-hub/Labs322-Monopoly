public class Estacao extends Propriedade {


    //Construtor;
    public Estacao(int id, String descricao, Jogador dono, String nome, String proprietario, int preco, int aluguel) {
        super(id, descricao, dono, nome, proprietario, preco, aluguel);
    }

    public int calcularAluguel() {
        return (getAluguel());
    }
}
//