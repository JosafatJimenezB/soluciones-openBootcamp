package funciones;

public class cocheEjercicio {

    public static void main(String[] args) {

        Coche miCoche = new Coche();

        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println("El coche tiene: " + miCoche.puertas + " puertas");
    }

}
class Coche{
    public int puertas = 0;

    public void agregarPuerta(){
        this.puertas++;
    }

}
