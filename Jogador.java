import java.util.ArrayList;


/*
    Classe que define todas as instâncias e métodos de um 
    Jogador de Monopoly.
 */
public class Jogador {
    private static int nextid = 1;
    private static int dinheiroinicial = 100000;
    private String nome;
    private String cpf;
    private String email;
    private String foto;
    private int dinheiro;
    private int id;
    private ArrayList<Carta> cartas;
    private Peca peca;


    // Construtor:
    public Jogador(String nome, String cpf, String email, String foto, Peca peca) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        this.dinheiro = dinheiroinicial;
        this.cartas = new ArrayList<Carta>();
        this.peca = peca;
        this.id = nextid;
        nextid++;
    }


    // Getter e Setters:
    public String getNome() {
        return nome;
    }
    public void setNome(String novo_nome) {
        this.nome = novo_nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String novo_Cpf) {
        this.cpf = novo_Cpf;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String novo_Email) {
        this.email = novo_Email;
    }

    public String getFoto() {
        return foto;
    }
    public void setFoto(String nova_foto) {
        this.foto = nova_foto;
    }

    public int getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(int novo_dinheiro) {
        this.dinheiro = novo_dinheiro;
    }

    public int getId() {
        return id;
    }

    public Peca getPeca() {
        return peca;
    }
    public void setPeca(Peca nova_peca) {
        this.peca = nova_peca;
    }
    // Não adicionei o setter porque o enunciado pede pro ID ser settado automaticamente
    //Imagino que ele não deve ser alterado

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void addCarta(Carta nova_carta) {
        cartas.add(nova_carta);
        nova_carta.setDono(this);
    }

    public boolean removeCarta(Carta carta_removida) {
        int size = cartas.size();
        for (int i = 0; i < size; i++) {
            if (cartas.get(i) == carta_removida) {
                cartas.remove(i);
                return true;
            }
        }
        return false;
    }
    // Método toString para um formato básico de impressão da classe Jogador.
    public String toString() {
        return "Jogador de nome " + getNome() + ", de CPF " + getCpf() + " e email " + getEmail() + ".";
    }
}
//