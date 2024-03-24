public class Main {
    /*
    Main que faz o instanciamento(se é que essa palavra existe) de alguns objetos usando as classes
    desenvolvidas.
     */
    public static void main(String args[]) {
            Jogador Pedro, Paulo;
            Peca Roxa, Vermelha;
            CartaSorte SilvioSantos;
            Pedro = new Jogador("Pedro", "123.456.789.-09", "pedro12@gmail.com", "Foto bonita!");
            Paulo = new Jogador("Paulo", "111.222.333-99", "emailtotalmenteverdadeiro@@g.mail.com.", "Foto quase bonita");
            Roxa = new Peca("Roxa", 1);
            Vermelha = new Peca("Vermelha", 1);
            SilvioSantos = new CartaSorte(10,
            "Vai chover dinheiro! Ao revelar essa carta, todos os jogadores que não foram à falência ganham R$299.999,00.",
            1, 100, 299999.00f, "Receba R$299.999,00 e não saia da sua casa", 0, "Irrestrita");
            System.out.println(Pedro.toString() + "\n");
            System.out.println(Paulo.toString() + "\n");
            System.out.println("O CPF do " + Paulo.getNome() + " é válido? " + Paulo.validarCpf() + "\n");
            System.out.println("Será que o Email do " + Pedro.getNome() + " é verdadeiro? " + Pedro.validarEmail() + "\n");
            System.out.println("A descrição da carta da sorte de id " + SilvioSantos.getId() + " é: " + SilvioSantos.getDescricao() + "\n");
            System.out.println("A peça do jogador Pedro é da cor " + Roxa.getCor() + ".\n");
            System.out.println("A peca do jogador Paulo está na posição: " + Vermelha.getPosicao() + ".");
    }
}
