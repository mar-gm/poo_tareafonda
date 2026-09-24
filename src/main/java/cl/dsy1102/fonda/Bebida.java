package cl.dsy1102.fonda;

public abstract class Bebida {
    protected String nombre;
    protected int volumenML;
    protected int stock;

    public Bebida(String nombre, int volumenML, int stock){
        setNombre(nombre);
        setVolumenML(volumenML);
        setStock(stock);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException{
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;

        } else {
            throw new IllegalArgumentException("Error, no puede ser nulo ni vacio");
        }


    }

    public int getVolumenML() {
        return volumenML;
    }

    public void setVolumenML(int volumenML) throws IllegalArgumentException {
        if (volumenML > 100 && volumenML > 3000) {
            throw new IllegalArgumentException("Error, debe encontrarse en el rango entre 100 y 3000 mililitros");
        } else {
            this.volumenML = volumenML;


        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws IllegalArgumentException {
        if (stock > 0) {
            this.stock = stock;
        } else {
            throw new IllegalArgumentException("Error, debe ser un valor mayor que 0");
        }




    }

    public abstract double calcularPrecio();
    public abstract String obtenerDetalle();

    @Override
    public String toString() {
        return "Nombre: " + nombre +  "VolumenML: " + volumenML + "Stock: " + stock;
    }
}
