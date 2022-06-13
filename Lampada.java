public class Lampada {

    int voltagem;
    int potencia;
    String cor;
    int luminosidade;
    boolean statusAcesa;

    public Lampada(int voltagem, int potencia, String cor, int luminosidade, boolean statusAcesa) {
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.cor = cor;
        this.luminosidade = luminosidade;
        this.statusAcesa = statusAcesa;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(int luminosidade) {
        this.luminosidade = luminosidade;
    }

    public boolean isStatusAcesa() {
        return statusAcesa;
    }

    public void setStatusAcesa(boolean statusAcesa) {
        this.statusAcesa = statusAcesa;
    }

    void acender(){
        statusAcesa = true;
        System.out.println("A lampada acendeu");
    }

    void apagar(){
        statusAcesa = false;
        System.out.println("A lâmpada apagou");
    }

    void aquecer(){
        System.out.println("Aqueceu");
    }

    void iluminar(){
        System.out.println("Iluminou");
    }
}