package ArrayList1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by curso mañana on 29/11/2016.
 */
public class ArrayListEmpleados {
    static private ArrayList<Empleado> alday;

    public ArrayListEmpleados() {
        alday = new ArrayList<>();
    }

    public static void main(String[] args) {
        new ArrayListEmpleados();
        System.out.println("bienvenido al controlador:");
        boolean continuar = true;
        do {
            System.out.println("1.añadir empleado:\n2.eliminar empleado\n3.buscar empleado por NIF\n4.media de hijos\n5.informacion de un empleado en concreto\n0.Salir");
            try{
                Scanner scan = new Scanner(System.in);
                int envio = scan.nextInt();
                continuar=opcion(envio);
            }catch(InputMismatchException e){
                System.out.println("introduce un numero para seleccionar una opcion");
            }
        }while (continuar);
    }

    private static boolean opcion(int envio) {
        switch (envio){
            case 1:
                anadirEmpleado();
                break;
            case 2:
                borrarEmpleado();
                break;
            case 3:
                buscarNif();
                break;
            case 4:
                mediaHijos();
                break;
            case 5:
                informacionEmpleado();
                break;
            case 0:
                return false;
        }
        return true;
    }

    private static void informacionEmpleado() {
    }

    private static void mediaHijos() {
        int hijos=0;
        for (int i = 0; i < alday.size(); i++) {

        }
    }

    private static void buscarNif() {

    }

    private static void borrarEmpleado() {

    }

    private static void anadirEmpleado() {

    }

    //Methods

    public void insertEmpleados(){

    }
}
