public class Porta {

    double altura;
    double largura;
    String cor;
    String material;
    boolean statusPortaAbertura;
    boolean statusPortaTrancamento;

    public Porta(){
        altura = 0;
        largura = 0;
        cor = null;
        material = null;
    }

    public Porta(double altura, double largura, String cor, String material) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.material = material;
    }

    void abrir(){
        statusPortaAbertura = true;
        System.out.println("Abriram a porta");
    }

    void fechar(){
        statusPortaAbertura = false;
        System.out.println("Fecharam a porta");
    }

    void trancar(){
        statusPortaTrancamento = true;
        System.out.println("Trancaram a porta");
    }

    void destrancar(){
        statusPortaTrancamento = true;
        System.out.println("Destrancaram a porta");
    }

    void pintar(String cor){
        this.cor = cor;
        System.out.println("A porta foi pintada da cor " + cor);
    }
}