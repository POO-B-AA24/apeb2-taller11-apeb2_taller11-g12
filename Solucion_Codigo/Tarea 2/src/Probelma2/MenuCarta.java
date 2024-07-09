package Probelma2;

public class MenuCarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;

    public MenuCarta(String n,double vI) {
        super(n,vI);
    }

    public MenuCarta(String n, double vI, double valorP,
            double valorB, double porcentaje) {
        super(n,vI);
        valorPorcionGuarnicion = valorP;
        valorBebida = valorB;
        porcentajeAdicional = porcentaje;
    }

    public void setValorPorcionGuarnicion(double v) {
        valorPorcionGuarnicion = v;
    }

    public void setValorBebida(double v) {
        valorBebida = v;
    }

    public void setPorcentajeAdicional(double v) {
        porcentajeAdicional = v;
    }
    
    @Override
    public void calcularValorMenu(){
        double subtotal = valorInicialMenu + valorBebida + valorPorcionGuarnicion;
        valorMenu = subtotal + (valorInicialMenu * (porcentajeAdicional / 100));
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu a la Carta:\n%s", super.toString());
        cadena = String.format("%sValor guarnicion: %.2f\nValor bebida: %.2f\n"
                + "Porcentaje Adicional: %.2f\nValor del Menu: %.2f",
                cadena, valorPorcionGuarnicion, valorBebida, porcentajeAdicional,
                valorMenu);
        return cadena;
    }

}
