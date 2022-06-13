public class Abajur {

    Lampada luz;;
    String cor;
    int peso;
    boolean estaLigado;

    public Abajur(Lampada luz, String cor, int peso, boolean estaLigado) {
        this.luz = luz;
        this.cor = cor;
        this.peso = peso;
        this.estaLigado = estaLigado;
    }

    public Lampada getLuz() {
        return luz;
    }

    public void setLuz(Lampada luz) {
        this.luz = luz;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setEstaLigado(boolean estaLigado) {
        this.estaLigado = estaLigado;
    }
}