import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Jogador> jogadores;
    private ArrayList<Propriedade> propriedades;

    //Construtor
    public Tabuleiro(ArrayList<Jogador> jogadores, ArrayList<Propriedade> propriedades) {
        this.jogadores = new ArrayList<Jogador>();
        this.propriedades = new ArrayList<Propriedade>();
    }


    //Adição e Remoção de jogadores e propriedades(representados nesse lab(LAB2) comom inteiros)
    public boolean addJogador(Jogador novo_jogador) {
        jogadores.add(novo_jogador);
        return true;
    }
    public boolean removeJogador(Jogador jogador_removido) {
        int size = jogadores.size();
        for (int i = 0; i < size; i++) {
            if (jogadores.get(i) == jogador_removido) {
                jogadores.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean addPropriedade(Propriedade nova_propriedade) {
        propriedades.add(nova_propriedade);
        return true;
    }
    public boolean removePropriedade(Propriedade propriedade_removida) {
        int size = propriedades.size();
        for (int i = 0; i < size; i++) {
            if (propriedades.get(i) == propriedade_removida) {
                propriedades.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Jogador> getJogadores() {
        return jogadores;
    }
    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }
}
