/*
    Classe que define todas as instâncias e métodos de um 
    Jogador de Monopoly.
 */
public class Jogador {
    private String nome;
    private String cpf;
    private String email;
    private String foto;


    // Construtor:
    public Jogador(String nome, String cpf, String email, String foto) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.foto = foto;
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

    public String toString() {
        return "Jogador de nome " + getNome() + ", de CPF " + getCpf() + " e email " + getEmail() + ".";
    }

    public boolean validarCpf() {
        String mirror_cpf;
        mirror_cpf = this.cpf.replaceAll("\\D","");
        char former = '0', latter = '0'; // Servirão para verificar se só há números repetidos
        int n_chars, multiplicador = 10, int_atual, soma1 = 0, soma2 = 0; // Ver documentação do método
        int verif1 = 0, verif2 = 0; // Variáveis para os dígitos verificadores encontrados
        n_chars = mirror_cpf.length();
        if (n_chars != 11) {
            return false;
        }
        for (int i = 0; i < (n_chars - 1); i++) {
            former = mirror_cpf.charAt(i);
            latter = mirror_cpf.charAt(i + 1);
            if (former != latter) {
                break;
            } 
        }
        if (former == latter) {
            return false;
        }
        for (int j = 0; j < 9; j++) {
            int_atual = (int)mirror_cpf.charAt(j);
            soma1 += int_atual * multiplicador;
            multiplicador--;
        }

        if (soma1 % 11 < 2) {
            verif1 = 0;
        } else if (soma1 % 11 > 2) {
            verif1 = 11 - (soma1 % 11);
        }

        multiplicador = 11;
        for (int k = 0; k < 10; k++) {
            int_atual = (int)mirror_cpf.charAt(k);
            soma2 += int_atual*multiplicador;
            multiplicador--;
        }

        if (soma2 % 11 < 2) {
            verif2 = 0;
        } else if (soma2 % 11 > 2) {
            verif2 = 11 - (soma2 % 11);
        }

        if ((verif1 == (int)mirror_cpf.charAt(9)) &&  (verif2 == (int)mirror_cpf.charAt(10))) {
            return true;
        } else {
            return false;
        }
    }

    
}
