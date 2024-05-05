/*
	Classe que define todas as instâncias e métodos
	para a Carta da Sorte.
*/
public class CartaSorte extends Carta {
	private int movimento;
	private int efeito;
	private float valor;
	private String acao;
	private int tempo;
	private String restricao;
	
	
	//  Construtor:
	public CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, int tempo, String restricao, Jogador dono) {
	super(id, descricao, dono);
	this.movimento = movimento;
	this.efeito = efeito;
	this.valor = valor;
	this.acao = acao;
	this.tempo = tempo;
	this.restricao = restricao;
	}
	
	
	// Getters e Setters:
	public int getMovimento() {
		return movimento;
	}
	public void setMovimento(int novo_movimento) {
		this.movimento = novo_movimento;
	}
	
	public int getEfeito() {
		return efeito;
	}
	public void setEfeito(int novo_efeito) {
		this.efeito = novo_efeito;
	}
	
	public float getValor() {
		return valor;
	}
	public void setValor(float novo_valor) {
		this.valor = novo_valor;
	}
	
	public String getAcao() {
		return acao;
	}
	public void setAcao(String nova_acao) {
		this.acao = nova_acao;
	}
	
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int novo_tempo) {
		this.tempo = novo_tempo;
	}
	
	public String getRestricao() {
		return restricao;
	}
	public void setRestricao(String nova_restricao) {
		this.restricao = nova_restricao;
	}
}
//