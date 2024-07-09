package Probelma2;


public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;

    public MenuDia(String n, double vI) {
        super(n, vI);
    }

    public MenuDia(String n, double vI, double valorP,
            double valorB) {
        super(n, vI);
        valorPostre = valorP;
        valorBebida = valorB;
    }

    public void setValorPostre(double v) {
        valorPostre = v;
    }

    public void setValorBebida(double v) {
        valorBebida = v;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicialMenu + valorBebida + valorPostre;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu del Dia:\n%s", super.toString());
        cadena = String.format("%sValor bebida: %.2f\nValor postre: %.2f\n"
                + "Valor del Menu: %.2f",
                cadena, valorBebida, valorPostre, valorMenu);
        return cadena;
    }
}
