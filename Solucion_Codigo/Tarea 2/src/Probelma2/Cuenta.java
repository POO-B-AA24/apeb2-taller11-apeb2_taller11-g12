package Probelma2;

import java.util.ArrayList;

public class Cuenta {

    private String nombreCliente;
    private double iva;
    private ArrayList<Menu> menus = new ArrayList<>();
    private double totalMenusSubtotal;
    private double totalMenusFinal;

    public Cuenta(String n, ArrayList<Menu> lista, double v) {
        nombreCliente = n;
        menus = lista;
        iva = v;
    }

    public void setNombre(String n) {
        nombreCliente = n;
    }

    public void setMenus(ArrayList<Menu> lista) {
        menus = lista;
    }
    
    public void setIva(double n) {
        iva = n;
    }


    public void setMenusSubtotal() {
        for (int i = 0; i < getMenus().size(); i++) {
            totalMenusSubtotal = totalMenusSubtotal
                    + getMenus().get(i).getValorMenu();
        }
    }

    public void setTotalMenusFinal() {
        totalMenusFinal = totalMenusSubtotal + (totalMenusSubtotal * (iva / 100));
    }

    public String getNombre() {
        return nombreCliente;
    }

    public ArrayList<Menu> getMenus() {
        return menus;
    }
    
    public double getIva(){
        return iva;
    }

    public double getMenusSubtotal() {
        return totalMenusSubtotal;
    }

    public double getTotalMenusFinal() {
        return totalMenusFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Nombre del Cliente: %s\n"
                + "Lista de Menus:\n\n", getNombre());

        for (int i = 0; i < getMenus().size(); i++) {
            cadena = String.format("%s"
                    + "%s\n\n",
                    cadena,
                    getMenus().get(i));
        }

        cadena = String.format("\n%sSubtotal: %.2f\n"
                + "IVA: %.2f\n"
                + "Total a pagar: %.2f",
                cadena,
                getMenusSubtotal(),
                getIva(),
                getTotalMenusFinal());
        return cadena;
    }
}
