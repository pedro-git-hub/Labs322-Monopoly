/*
	Classe que define todas as instâncias e métodos
	para a Carta da Sorte.
*/
public class CartaSorte {
	private int id;
	private String descricao;
	private int movimento;
	private int efeito;
	private float valor;
	private String acao;
	private int tempo;
	private String restricao;
	
	
	//  Construtor:
	public CartaSorte(int id, String descricao, int movimento, int efeito, float valor, String acao, int tempo, String restricao) {
	this.id = id;
	this.descricao = descricao;
	this.movimento = movimento;
	this.efeito = efeito;
	this.valor = valor;
	this.acao = acao;
	this.tempo = tempo;
	this.restricao = restricao;
	}
	
	
	// Getters e Setters:
	public int getId() {
		return id;
	}
	public void setId(int novo_id) {
		this.id = novo_id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String nova_descricao){
		this.descricao = nova_descricao;
	}
	
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