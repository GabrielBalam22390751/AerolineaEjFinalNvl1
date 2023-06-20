import java.util.*;
public class ControlMain {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);


        //Registrar Pilotos
        System.out.println("-AEROLINEAS MX-");
        System.out.println("-REGISTRO DE DATOS DE PILOTOS-");

        Pilotos piloto1 = new Pilotos();
       System.out.println("Ingrese datos del primer piloto:");
       piloto1.registrarPiloto();

        Pilotos piloto2 = new Pilotos();
        System.out.println("Ingrese datos del segundo piloto:");
       piloto2.registrarPiloto();


       //Registrar aviones
       System.out.println("-REGISTRO DE DATOS DE AVIONES-");

        Aviones avion1 = new Aviones();
        System.out.println("Ingrese datos del primer avión:");
        avion1.registrarAvion();

        Aviones avion2 = new Aviones();
        System.out.println("Ingrese datos del segundo avión:");
        avion2.registrarAvion();

        //Selección de avión
        System.out.println("Seleccione el avión");
        System.out.println("1) Avión No 1");
        System.out.println("2) Avión No 2");
        int seleccionav = leer.nextInt();
        double selecavpar = 0;
        double selecavlleg = 0;
        switch(seleccionav) {
            case 1:
                System.out.println("Ha seleccionado el avión No 1 ");
                selecavpar = avion1.partida;
                selecavlleg = avion1.llegada;
            case 2:
                System.out.println("Ha seleccionado el avión No 2");
                selecavpar = avion2.partida;
                selecavlleg = avion2.llegada;
        }

        //Selección de piloto
        System.out.println("Seleccione el piloto a asignar");
        System.out.println("1) Piloto No 1");
        System.out.println("2) Piloto No 2");
        int seleccionpil = leer.nextInt();
        double selecionpilen = 0;
        double selecionpilsal = 0;
        switch(seleccionpil) {
            case 1:
                System.out.println("Ha seleccionado el piloto No 1");
                selecionpilen = piloto1.horarioentrada;
                selecionpilsal = piloto1.horariosalida;
            case 2:
                System.out.println("Ha seleccionado el piloto No 2");
                selecionpilen = piloto2.horarioentrada;
                selecionpilsal = piloto2.horariosalida;
        }
        //comparativa
        if(selecavpar > selecionpilen && selecavlleg > selecionpilsal) {
            System.out.println("El piloto seleccionado no puede pilotar este avión");
        }
        else{
            System.out.println("El piloto si puede pilotar este avión");
        }

        }




        }

