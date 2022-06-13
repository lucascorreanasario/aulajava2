import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Porta porta1 = new Porta();
        Relógio relógio1 = new Relógio();

        porta1.abrir();
        porta1.fechar();

        String cor = JOptionPane.showInputDialog("Informe a cor que você quer pinta a porta: ");
        porta1.pintar(cor);

        String corRelogio = JOptionPane.showInputDialog("Informe a cor que quer trocar para o relógio: ");
        relógio1.trocarCor(corRelogio);
    }
}