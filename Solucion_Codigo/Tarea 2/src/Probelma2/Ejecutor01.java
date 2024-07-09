package Probelma2;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejecutor01 {

    /**l
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreCliente;
        ArrayList<Menu> listaMenus = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:  ");
        nombreCliente = sc.nextLine();
        int opcion;

        do {
            System.out.println("\n(1) Menu de Niños"
                    + "\n(2) Menu Economico"
                    + "\n(3) Menu del Dia"
                    + "\n(4) Menu a la carta"
                    + "\nIngrese la opcion a desear (Digite cualquier otro "
                    + "numero para salir)");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nMenu de ninos ");
                    System.out.println("Ingrese el nombre del plato: ");
                    sc.nextLine();
                    String nombrePlato = sc.nextLine();
                    System.out.println("Ingrese el valor incial del plato: ");
                    double valorPlato = sc.nextDouble();
                    System.out.println("Ingrese el valor de la porcion de helado: ");
                    double valorHelado = sc.nextDouble();
                    System.out.println("Ingrese el valor de la porcion de pastel:  ");
                    double valorPastel = sc.nextDouble();
                    sc.nextLine();
                    MenuNinos menu = new MenuNinos(nombrePlato, valorHelado, valorPlato,
                            valorPastel);
                    menu.calcularValorMenu();
                    listaMenus.add(menu);
                    break;
                case 2:
                    System.out.println("\nMenu Economico ");
                    System.out.println("Ingrese el nombre del plato: ");
                    sc.nextLine();
                    nombrePlato = sc.nextLine();
                    System.out.println("Ingrese el valor incial del plato: ");
                    valorPlato = sc.nextDouble();
                    System.out.println("Ingrese el porcentaje de descuento: ");
                    double porcentajeDesc = sc.nextDouble();
                    sc.nextLine();
                    MenuEconomico menuE = new MenuEconomico(nombrePlato, valorPlato,
                            porcentajeDesc);
                    menuE.calcularValorMenu();
                    listaMenus.add(menuE);
                    break;
                case 3:
                    System.out.println("\nMenu del Dia "); 
                    System.out.println("Ingrese el nombre del plato: ");
                    sc.nextLine();
                    nombrePlato = sc.nextLine();
                    System.out.println("Ingrese el valor incial del plato: ");
                    valorPlato = sc.nextDouble();
                    System.out.println("Ingrese el valor del postre: ");
                    double valorPostre = sc.nextDouble();
                    System.out.println("Ingrese el valor de la bebida");
                    double valorBebida = sc.nextDouble();
                    sc.nextLine();
                    MenuDia menuD = new MenuDia(nombrePlato, valorPlato, valorPostre, valorBebida);
                    menuD.calcularValorMenu();
                    listaMenus.add(menuD);
                    break;
                case 4:
                    System.out.println("\nMenu a la carta ");
                    System.out.println("Ingrese el nombre del plato: ");
                    sc.nextLine();
                    nombrePlato = sc.nextLine();
                    System.out.println("Ingrese el valor incial del menu: ");
                    valorPlato = sc.nextDouble();
                    System.out.println("Ingrese el valor de la porcion de guarnicion: ");
                    double valorGuarnicion = sc.nextDouble();
                    System.out.println("Ingrese el valor de la bebida");
                    valorBebida = sc.nextDouble();
                    System.out.println("Ingrese el valor del porcentaje a pagar por el "
                            + "servicio:");
                    double porcentajeServicio = sc.nextDouble();
                    sc.nextLine();
                    MenuCarta menuC = new MenuCarta(nombrePlato, valorPlato, valorGuarnicion,
                            valorBebida, porcentajeServicio);
                    menuC.calcularValorMenu();
                    listaMenus.add(menuC);
                    break;
            }
        } while (opcion >= 1 && opcion <= 4);
        
        double iva = 10;
        Cuenta cuenta1 = new Cuenta(nombreCliente, listaMenus, iva);
        cuenta1.setMenusSubtotal();
        cuenta1.setTotalMenusFinal();
        System.out.println(cuenta1);

    }

}
