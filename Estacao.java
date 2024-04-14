public class Estacao extends Propriedade {


    //Construtor;
    public Estacao(int id, String nome, String proprietario, int preco, int aluguel) {
        super(id, nome, proprietario, preco, aluguel);
    }

    public int calcularAluguel() {
        return (getAluguel());
    }
}
