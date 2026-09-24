package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    private int azucarPorLitro;

    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro){
        super(nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    @Override
    public double calcularPrecio() {
        double precio = 2000;
        if (azucarPorLitro > 80) {
            precio = precio * 10 / 100;
        }
        return precio;
    }

    @Override
    public String obtenerDetalle() {
        return "BEBIDA SIN ALCOHOL" + "Nombre: " + getNombre() + "VolumenML: " + getVolumenML() + "Stock: " + "Azucar: " + getAzucarPorLitro() + "Precio: " + calcularPrecio();


    }

    @Override
    public String toString() {
        return super.toString();
    }
}
