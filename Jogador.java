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


    // Construtor:
    public Jogador(String nome, String cpf, String email, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
        this.dinheiro = dinheiroinicial;
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
    // Não adicionei o getter porque o enunciado pede pro ID ser settado automaticamente
    //Imagino que ele não deve ser alterado

    // Método toString para um formato básico de impressão da classe Jogador.
    public String toString() {
        return "Jogador de nome " + getNome() + ", de CPF " + getCpf() + " e email " + getEmail() + ".";
    }
}
