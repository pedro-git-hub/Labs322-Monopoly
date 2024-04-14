import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Integer> jogadores;
    private ArrayList<Integer> propriedades;

    //Construtor
    public Tabuleiro(ArrayList<Integer> jogadores, ArrayList<Integer> propriedades) {
        this.jogadores = new ArrayList<Integer>();
        this.propriedades = new ArrayList<Integer>();
    }


    //Adição e Remoção de jogadores e propriedades(representados nesse lab(LAB2) comom inteiros)
    public boolean addJogador(int novo_jogador) {
        jogadores.add(novo_jogador);
        return true;
    }
    public boolean removeJogador(int jogador_removido) {
        int size = jogadores.size();
        for (int i = 0; i < size; i++) {
            if (jogadores.get(i) == jogador_removido) {
                jogadores.remove(i);
                return true;
            }
        }
        return false;
    }
    public boolean addPropriedade(int nova_propriedade) {
        propriedades.add(nova_propriedade);
        return true;
    }
    public boolean removePropriedade(int propriedade_removida) {
        int size = propriedades.size();
        for (int i = 0; i < size; i++) {
            if (propriedades.get(i) == propriedade_removida) {
                propriedades.remove(i);
                return true;
            }
        }
        return false;
    }
}
