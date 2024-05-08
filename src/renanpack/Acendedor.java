package renanpack;

public class Acendedor {

    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();

        System.out.println("A Lâmpada está" + " " + lampada.ligada);

        lampada.desligar();

        System.out.println("A Lâmpada está" + " " + lampada.ligada);

        lampada.estado();


    }

}
