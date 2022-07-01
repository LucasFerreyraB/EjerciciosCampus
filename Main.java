public class Main {
    public static void main(String[] args) {
        suma(337, 50, 139);

        Coche miCoche = new Coche();
        miCoche.Sumarpuerta();
        miCoche.Sumarpuerta();
        System.out.println("el numero de puertas es " +miCoche.numerodepuertas);

    }

    public static void suma(int a, int b, int c) {
        int resultado= a + b + c;
        System.out.println(resultado);

    }
    static class Coche{
       public int numerodepuertas=4;
       public void Sumarpuerta(){
           this.numerodepuertas++;
       }


    }

}
