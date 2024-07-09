package Probelma2;

public abstract class Menu {
    
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    public Menu(String n,double vI){
        nombrePlato = n;
        valorInicialMenu = vI;
    }

    public void setNombrePlato(String n) {
        nombrePlato = n;
    }

    public void setValorMenu(double v) {
        valorMenu = v;
    }

    public void setValorInicialMenu(double v) {
        valorInicialMenu = v;
    }
    
    public abstract void calcularValorMenu();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Plato: %s\nValor Inicial Menu: %.2f\n",
                nombrePlato, valorInicialMenu);
        return cadena;
    }
}
