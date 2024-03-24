/*
    Classe que define todas as instâncias e métodos para uma peça.
*/
public class Peca {
	private String cor;
	private int posicao;
	
	
	//  Construtor:
	public Peca(String cor, int posicao) {
		this.cor = cor;
		this.posicao = posicao;
	}
	
	
	// Getter e Setters:
	public String getCor() {
		return cor;
	}
	public void setCor(String nova_cor) {
		this.cor = nova_cor;
	}
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int nova_posicao) {
		this.posicao = nova_posicao;
	} 
}