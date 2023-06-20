import java.util.*;
public class Pilotos {
    Scanner leer = new Scanner(System.in);
    //Atributos
    String id;
    String nombre;
    String apellido;
    double horarioentrada;
    double horariosalida;
    //Métodos
    public void registrarPiloto() {

        System.out.println("ID del piloto:");
        this.id = leer.nextLine();

        System.out.println("Primer NOMBRE del piloto:");
        this.nombre = leer.nextLine();

        System.out.println("Primer APELLIDO del piloto:");
        this.apellido = leer.nextLine();

        System.out.println("Horario de ENTRADA del piloto (en formato de 24 horas):");
        this.horarioentrada = leer.nextDouble();
        if(horarioentrada <= 24 && horarioentrada >= 1) {

        }
            else{
            System.out.println("Ingrese un número VÁLIDO");
        }
        System.out.println("Horario de SALIDA del piloto (en formato de 24 horas):");
        this.horariosalida = leer.nextDouble();
        if(horariosalida <= 24 && horariosalida >= 1) {

        }
        else{
            System.out.println("Ingrese un número VÁLIDO");
        }
    }
}
