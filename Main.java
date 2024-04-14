import java.util.ArrayList;

public class Main {
    /*
    Main que faz o instanciamento(se é que essa palavra existe) de alguns objetos usando as classes
    desenvolvidas.
     */
    public static void main(String args[]) {
            Jogador Pedro, Paulo;
            Peca Roxa, Vermelha;
            CartaSorte SilvioSantos;
            Tabuleiro tabuleiro;
            Propriedade Pasto;
            Servicospublicos CPFL;
            Terreno Soja;
            Estacao Esmeralda;
            ArrayList<Integer> jogadores_primeira_rodada = new ArrayList<>();
            ArrayList<Integer> algumas_propriedades = new ArrayList<>();
            Pedro = new Jogador("Pedro", "123.456.789.-09", "pedro12@gmail.com", "Foto bonita!");
            Paulo = new Jogador("Paulo", "111.222.333-99", "emailtotalmenteverdadeiro@@g.mail.com.", "Foto quase bonita");
            Roxa = new Peca("Roxa", 1);
            Vermelha = new Peca("Vermelha", 1);
            SilvioSantos = new CartaSorte(10,
            "Vai chover dinheiro! Ao revelar essa carta, todos os jogadores que não foram à falência ganham R$299.999,00.",
            1, 100, 299999.00f, "Receba R$299.999,00 e não saia da sua casa", 0, "Irrestrita");
            tabuleiro = new Tabuleiro(jogadores_primeira_rodada, algumas_propriedades);
            System.out.println(Pedro.toString() + "\n");
            System.out.println(Paulo.toString() + "\n");
            System.out.println("O CPF do " + Paulo.getNome() + " é válido? " + Validacao.validarCpf(Paulo) + "\n");
            System.out.println("Será que o Email do " + Pedro.getNome() + " é verdadeiro? " + Validacao.validarEmail(Pedro) + "\n");
            System.out.println("A descrição da carta da sorte de id " + SilvioSantos.getId() + " é: " + SilvioSantos.getDescricao() + "\n");
            System.out.println("A peça do jogador Pedro é da cor " + Roxa.getCor() + ".\n");
            System.out.println("A peca do jogador Paulo está na posição: " + Vermelha.getPosicao() + ".");
            tabuleiro = new Tabuleiro(jogadores_primeira_rodada, algumas_propriedades);
            for (int i = 0; i < 10; i++) {
                tabuleiro.addJogador(i);
            }
            for (int i = 0; i < 20; i++) {
                tabuleiro.addPropriedade(i);
            }
            System.out.println("Esse jogador foi removido? " + tabuleiro.removeJogador(11) + "\n");
            System.out.println("Essa propriedade foi removida? " + tabuleiro.removePropriedade(3) + "\n");
            Pasto = new Propriedade(0, "Pasto", "Ninguém", 1000, 50);
            System.out.println("O preço do aluguel da propriedade " + Pasto.getNome() + " é: " + Pasto.calcularAluguel() + "\n");
            CPFL = new Servicospublicos(6, 11, "Compania de Energia", "Estado", 10000, 360); // Conta de Luz tá cara!
            System.out.println("O jogador " + Pedro.getNome() + " caiu no serviço " + CPFL.getNome() + " e pagou " + CPFL.calcularAluguel() + "!\n");
            Esmeralda = new Estacao(16, "Metrô", "Estado", 90000, 50);
            System.out.println("O preço atual da estação " + Esmeralda.getNome() + " é de " + Esmeralda.calcularAluguel() + "\n");
            Soja = new Terreno(29, "Latifúndio", "Alguém", 1000000, 10000, 3, 100000, 0, false);
            System.out.println("O jogador " + Paulo.getNome() + " quis comprar o terreno " + Soja.getNome() + ". Ele conseguiu? " + Soja.ComprarCasa(Paulo.getDinheiro()) + "\n");
    }
}
