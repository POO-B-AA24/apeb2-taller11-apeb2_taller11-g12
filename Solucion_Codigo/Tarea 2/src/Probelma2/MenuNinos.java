package Probelma2;

public class MenuNinos extends Menu{
    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNinos(String n, double vI) {
        super(n, vI);
    }

    public MenuNinos(String n, double vI, double valorH,
            double valorP) {
        super(n, vI);
        valorPorcionHelado = valorH;
        valorPorcionPastel = valorP;
    }

    public void setValorPorcionHelado(double v) {
        valorPorcionHelado = v;
    }

    public void setValorPorcionPastel(double v) {
        valorPorcionPastel = v;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }

    public double getValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public double getValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu de Ninos:\n%s", super.toString());
        cadena = String.format("%sValor helado: %.2f\nValor pastel: %.2f\n"
                + "Valor del Menu: %.2f",
                cadena, valorPorcionHelado, valorPorcionPastel, valorMenu);
        return cadena;
    }
}
