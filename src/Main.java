public class Main {
    public static void main(String[] args) {
        System.out.println(suma(10,20,45));

        coche miCoche = new coche();

        miCoche.AgregarPuertas();

        System.out.print(miCoche.puertas);
    }

    public static int suma(int a,int b,int c){
        return a + b + c;
    }
}

class coche{
    public int puertas = 0;

    public void AgregarPuertas(){
        this.puertas++;
    }
}