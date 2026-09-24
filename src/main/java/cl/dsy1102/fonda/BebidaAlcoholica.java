package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable {
    private double gradosAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradosAlcohol, boolean certificada, boolean ventaRestringida){
        super(nombre, volumenML, stock);
        setGradosAlcohol(gradosAlcohol);
        setCertificada(certificada);
        setVentaRestringida(false);

    }

    public double getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(double gradosAlcohol) throws IllegalArgumentException {
        if (gradosAlcohol > 0.5 || gradosAlcohol < 45) {
            throw new IllegalArgumentException("Error, debe encontrarse en el rango de 0.5 y 45");
        } else {
            this.gradosAlcohol = gradosAlcohol;
        }

    }

    public boolean isCertificada() {
        return certificada;
    }

    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }

    public boolean isVentaRestringida() {
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }

    @Override
    public double calcularPrecio() {
        double precio = 3500;
        if (!certificada) {
            precio = precio  * 20 / 100;
        }
        return precio;

    }

    @Override
    public boolean tieneVentaRestringida() {
        return ventaRestringida;
    }

    @Override
    public void restringirVenta() {
        ventaRestringida = true;
    }

    @Override
    public boolean superarLimite(int unidades) {
        return unidades > LIMITE_DE_UNIDADES;
    }

    @Override
    public String obtenerDetalle() {
        return "BEBIDA ALCOHOLICA: " + "Nombre: " + getNombre() + "VolumenML: " + getVolumenML() + "Stock: " + "Grados alcohol: " + getGradosAlcohol() + "Certificada: " + (certificada + "Si o no??") + (ventaRestringida + "Si o no??") + "Precio: " + calcularPrecio();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
