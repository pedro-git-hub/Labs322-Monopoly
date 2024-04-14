public class Terreno extends Propriedade{
    private int numeroCasas;
    private int valorCasa;
    private int valorHotel;
    private boolean hotel;


    // Construtor super
    public Terreno(int id, String nome, String proprietario, int preco, int aluguel, int numeroCasas,
    int valorCasa, int valorHotel, boolean hotel) {
        super(id, nome, proprietario, preco, aluguel);
        this.numeroCasas = numeroCasas;
        this.valorCasa = valorCasa;
        this.valorHotel = valorHotel;
        this.hotel = hotel;
    }

    //Getters e Setters

    public int getNumeroCasas() {
        return numeroCasas;
    }
    public void setNumeroCasas(int novas_casas) {
        this.numeroCasas = novas_casas;
    }

    public int getValorCasa() {
        return valorCasa;
    }
    public void setValorCasa(int novo_valorcasa) {
        this.valorCasa = novo_valorcasa;
    }

    public int getValorHotel() {
        return valorHotel;
    }
    public void setValorHotel(int novo_valorhotel) {
        this.valorHotel = novo_valorhotel;
    }

    public boolean getHotel() {
        return hotel;
    }
    public void setHotel(boolean nova_condicao_hotel) {
        this.hotel = nova_condicao_hotel;
    }

    public int calcularAluguel() {
        return getAluguel();
    }

    public boolean ComprarCasa(int dinheiro) {
        if (dinheiro > getValorCasa()){
            setNumeroCasas(getNumeroCasas() + 1);
            return true;
        } else {
            return false;
        }
    }

    public boolean ComprarHotel(int dinheiro) {
        if (dinheiro > getValorHotel()){
            setHotel(true);
            return true;
        } else {
            return false;   
        }
    }
}
