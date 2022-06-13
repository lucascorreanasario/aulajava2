public class LampadaNatal extends Lampada{

    double tempoLigada;
    double tempoPisca;

    public LampadaNatal(int voltagem, int potencia, String cor, int luminosidade, boolean statusAcesa) {
        super(voltagem, potencia, cor, luminosidade, statusAcesa);
    }

    public double getTempoLigada() {
        return tempoLigada;
    }

    public void setTempoLigada(double tempoLigada) {
        this.tempoLigada = tempoLigada;
    }

    public double getTempoPisca() {
        return tempoPisca;
    }

    public void setTempoPisca(double tempoPisca) {
        this.tempoPisca = tempoPisca;
    }

    void acender(double tempoLigada, double tempoPisca){
        this.tempoLigada = tempoLigada;
        this.tempoPisca = tempoPisca;
    }
}