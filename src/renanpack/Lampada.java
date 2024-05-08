package renanpack;

public class Lampada {

    String marca;
    float preco;
    int kilowatts;

  boolean ligada;

   void ligar(){

       ligada=true;
   }

   void desligar(){

       ligada=false;
   }

   void estado(){

       if (ligada){
           System.out.println("a lamp está ligada");
       } else System.out.println("a lampada desligada");
   }
}

