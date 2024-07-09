package Probelma2;

public class MenuEconomico extends Menu{
    private double porcentajeDescuento;

    public MenuEconomico(String n, double vI) {
        super(n, vI);
    }

    public MenuEconomico(String n, double vI, double porcentajeD) {
        super(n, vI);
        porcentajeDescuento = porcentajeD;
    }

    public void setPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicialMenu - (valorInicialMenu * (porcentajeDescuento / 100));
    }
    
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menu Economico:\n%s", super.toString());
        cadena = String.format("%sPorcentaje Descuento: %.2f\nValor del Menu: %.2f",
                cadena, porcentajeDescuento, valorMenu);
        return cadena;
    }
}
