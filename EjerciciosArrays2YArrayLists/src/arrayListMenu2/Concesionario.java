package arrayListMenu2;

import ArrayListMenu1.Menu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by curso mañana on 01/12/2016.
 */
public class Concesionario {
    Menu menu;
    ArrayList<Coche> listaCoches;

    public Concesionario() {
        menu= new Menu();
        listaCoches=new ArrayList<>();
        menu.addMenu("1.Mostrar todos los coches");
        menu.addMenu("2.Mostrar coches de la marca elegida");
        menu.addMenu("3.Mostrar coches con menos de ciertos kilometros");
        menu.addMenu("4.Mostrar coches con mas kilometros");
        menu.addMenu("5.Mostrar coches de forma ordenada");
        menu.addMenu("0.Salir");
        System.out.println("bienvenido al controlador:");
        boolean continuar = true;
        do {
            menu.showMenu();
            Scanner scan;
            try {
                scan= new Scanner(System.in);
                int envio = scan.nextInt();
                continuar = opcion(envio);
            } catch (InputMismatchException e) {
                System.out.println("introduce un numero para seleccionar una opcion");
            }
        } while (continuar);
    }

    private boolean opcion(int envio) {
        switch (envio) {
            case 1:
                verCoches();
                break;
            case 2:
                cochesPorMarca();
                break;
            case 3:
                cochesPorKilometro();
                break;
            case 4:
                cocheMasKilometros();
                break;
            case 5:
                verCochesPorKilometros();
                break;
            case 0:
                return false;
        }
        return true;
    }

    private void verCochesPorKilometros() {
        System.out.print("ver coches con Kilometros hechos inferiores a ");
        Integer scan;
        try {
            Scanner escaner = new Scanner(System.in);
            scan = escaner.nextInt();
            for (Coche coche : listaCoches) {
                if (coche.getKilometros()<scan){
                    coche.toString();
                }
            }
        }catch (Exception e){
            System.out.println("error de busqueda");
        }

    }

    private void cocheMasKilometros() {
        if (listaCoches.get(0)!=null){
            Coche cocheAux= listaCoches.get(0);
            for (Coche coche : listaCoches) {
                if(coche.getKilometros()>cocheAux.getKilometros()){
                    cocheAux=coche;
                }
            }
            cocheAux.toString();
        }else{
            System.out.println("no existen coches");
        }

    }

    private void cochesPorKilometro() {

    }

    private void cochesPorMarca() {
        System.out.print("ver coches con la marca: ");
        String scan;
        try {
            Scanner escaner = new Scanner(System.in);
            scan = escaner.nextLine();

            listaCoches.stream().filter(coche -> coche.getMarca().compareTo(scan.toString()) == 0).forEach(Coche::toString);

            /*
            ** lo de arriba hace lo mismo que esto
            *
            for (Coche coche : listaCoches) {
                if (coche.getMarca().compareTo(scan.toString())==0){
                    coche.toString();
                }
            }*/
        }catch (Exception e){
            System.out.println("error de busqueda");
        }

    }

    private void verCoches() {
        for (Coche coche : listaCoches) {
            coche.toString();
        }
    }

}
