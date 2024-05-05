import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    Main que faz o instanciamento(se é que essa palavra existe) de alguns objetos usando as classes
    desenvolvidas.
     */
    public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seja bem vindo ao jogo Monopoly!\n");
            System.out.println("Informe o número de jogadores presentes: \n");
            ArrayList<Jogador> jogadores = new ArrayList<>();
            ArrayList<Propriedade> propriedades = new ArrayList<>();
            Tabuleiro tabuleiro = new Tabuleiro(jogadores, propriedades);
            int n_jogadores = scanner.nextInt();
            scanner.nextLine(); // Consome o espaço vazio para nao atrapalhar no loop for
            System.out.println("Agora, forneça os atributos de cada jogador.\n");
            for (int i = 0; i < n_jogadores; i++) {
                System.out.println("Forneça o nome: \n");
                String nome = scanner.nextLine();
                System.out.println("Forneça o CPF: \n");
                String cpf = scanner.nextLine();
                System.out.println("Forneça o email: \n");
                String email = scanner.nextLine();
                System.out.println("Forneça a foto do jogador: \n");
                String foto = scanner.nextLine();
                System.out.println("Agora, vamos crie a peça para esse jogador!(Sua peça começará no início)\n");
                System.out.println("Escolha cor da da peça: \n");
                String cor = scanner.nextLine();
                Peca peca = new Peca(cor, 0);
                Jogador jogador = new Jogador(nome, cpf, email, foto, peca);
                tabuleiro.addJogador(jogador);
            }
            System.out.println("Os jogadores começam com algumas cartas!\n");
            System.out.println("As cartas serão atribuídas aos jogadores.\n");
            for (int j = 0; j < tabuleiro.getJogadores().size(); j++) {
                while (true) {
                    System.out.println("Qual é o id da carta? (Se acabarma as cartas desse jogador digite '0').\n");
                    int id_da_carta = scanner.nextInt();
                    scanner.nextLine();
                    if (id_da_carta == 0) {
                        break;
                    }
                    System.out.println("Qual é a descrição da carta?\n");
                    String descricao_da_carta = scanner.nextLine();
                    Carta carta = new Carta(id_da_carta, descricao_da_carta, tabuleiro.getJogadores().get(j));
                    tabuleiro.getJogadores().get(j).addCarta(carta);
                }
            }
            System.out.println("Ótimo. Agora, há algo que você gostaria de saber sobre os jogadores? \n");
            while (true) {
                System.out.println("Você pode solicitar para ver a posição de um jogador ou sua coleção de cartas. (Caso não queira nada digite 'fim')\n");
                String comando = scanner.nextLine();
                if (comando.equals("fim")) {
                    break;
                } else if (comando.equals("posicao")) {
                    System.out.println("Qual é o nome do jogador?\n");
                    String nome_do_jogador = scanner.nextLine();
                    for (int i = 0; i < tabuleiro.getJogadores().size(); i++) {
                        if (nome_do_jogador.equals(tabuleiro.getJogadores().get(i).getNome())) {
                            System.out.println("O jogador " + nome_do_jogador + " está na posição: \n" +
                            tabuleiro.getJogadores().get(i).getPeca().getPosicao() + ".\n");
                            break;
                        }
                    }
                } else if (comando.equals("colecao")) {
                    System.out.println("Qual é o nome do jogador?\n");
                    String nome_do_jogador = scanner.nextLine();
                    for (int i = 0; i < tabuleiro.getJogadores().size(); i++) {
                        if (nome_do_jogador.equals(tabuleiro.getJogadores().get(i).getNome())) {
                            System.out.println("A coleção do jogador " + nome_do_jogador + " é: \n");
                            System.out.println("*******************\n");
                            for (int j = 0; j < tabuleiro.getJogadores().get(i).getCartas().size(); j++) {
                                System.out.println(tabuleiro.getJogadores().get(i).getCartas().get(j).getId() + "\n");
                            }
                            System.out.println("*******************\n");
                            break;
                        }
                    }
                } else {
                    System.out.println("Comando inválido.\n");
                }
            }
        scanner.close();
    }
}
