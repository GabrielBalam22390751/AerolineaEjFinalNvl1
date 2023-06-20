import java.util.*;
public class Aviones {
    Scanner leer = new Scanner(System.in);
    //Atributos
    String nombre;
    String salida;
    String destino;
    double partida;
    double llegada;
    //Métodos
    public void registrarAvion(){

        System.out.println("Marca del avión:");
        this.nombre = leer.nextLine();

        System.out.println("Lugar de salida del avión:");
        this.salida = leer.nextLine();

        System.out.println("Destino del avión:");
        this.destino = leer.nextLine();

        System.out.println("Hora de SALIDA del avión (en formato de 24 horas):");
        this.partida = leer.nextDouble();
        if(partida <= 24 && partida >= 1) {

        }
            else{
            System.out.println("Ingrese un número VÁLIDO");
        }

        System.out.println("Hora de LLEGADA del avión (en formato de 24 horas):");
        this.llegada = leer.nextDouble();
        if(llegada <= 24 && llegada >= 1) {

        }
            else{
            System.out.println("Ingrese un número VÁLIDO");
        }
    }
}
