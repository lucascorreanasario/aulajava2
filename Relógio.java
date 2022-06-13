public class Relógio {

    String corRelogio = "azul";
    boolean luzAcesa = true;
    String material;
    double horario;
    String data;

    public Relógio() {
        this.corRelogio = corRelogio;
        this.material = material;
        this.horario = horario;
        this.data = data;
    }

    public String getCor() {
        return corRelogio;
    }

    public void setCor(String corRelogio) {
        this.corRelogio = corRelogio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHorario() {
        return horario;
    }

    public void setHorario(double horario) {
        this.horario = horario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    void trocarCor(String corRelogio) {
        this.corRelogio = corRelogio;
        System.out.println("trocou a cor do relógio para " + corRelogio);
    }

    boolean verificaLuzAcesa() {
        if (luzAcesa) {
            return true;
        } else {
            return false;

        }
    }

    void ligar() {
        System.out.println("Relógio agora está ligado");
    }
}