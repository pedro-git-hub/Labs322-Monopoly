/*
 Classe que define as cartas do jogo Monopoly.
 */
public class Carta {
    private int id;
    private String descricao;
    private Jogador dono;


    // Construtor
    public Carta(int id, String descricao, Jogador dono) {
        this.id = id;
        this.descricao = descricao;
        this.dono = dono;
    }


    // Getters e Setters
    public int getId() {
        return id;
    }
    public void setId(int novo_id) {
        this.id = novo_id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String nova_descricao) {
        this.descricao = nova_descricao;
    }

    public Jogador getDono() {
        return dono;        
    }
    public void setDono(Jogador novo_dono) {
        this.dono = novo_dono;
    }
}
