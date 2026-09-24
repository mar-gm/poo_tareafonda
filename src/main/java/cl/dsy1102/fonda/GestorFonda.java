package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {

    private List<Bebida> bebidas;

    public GestorFonda() {
        bebidas = new ArrayList<>();
    }

    public void registrar(Bebida bebida) {
        bebidas.add(bebida);

        System.out.println(bebida.getNombre() + "-" + bebida.getClass().getSimpleName() + ")" + " registrada correctamente.");
    }

    public List<Bebida> buscarPorNombre(String nombre) {

        List<Bebida> encontradas = new ArrayList<>();

        for (Bebida bebida : bebidas) {

            if (bebida.getNombre().equalsIgnoreCase(nombre)) {
                encontradas.add(bebida);
            }
        }

        return encontradas;
    }

    public void vender(String nombre, int unidades) {

        Bebida bebidaEncontrada = null;

        for (Bebida bebida : bebidas) {

            if (bebida.getNombre().equalsIgnoreCase(nombre)) {
                bebidaEncontrada = bebida;
                break;
            }
        }

        if (bebidaEncontrada == null) {
            System.out.println("No se encontró la bebida: " + nombre);


        }

        if (bebidaEncontrada instanceof ConsumoResponsable) {

            ConsumoResponsable control =
                    (ConsumoResponsable) bebidaEncontrada;

            if (control.tieneVentaRestringida()) {

                System.out.println("Venta rechazada:" + bebidaEncontrada.getNombre() + "Tiene la venta restringida");


            }

            if (control.superarLimite(unidades)) {

                System.out.println( "Venta rechazada: " + unidades + "-" + bebidaEncontrada.getNombre() + "Supera a las: " + ConsumoResponsable.LIMITE_DE_UNIDADES + "Al cliente");



            }
        }

        double total = bebidaEncontrada.calcularPrecio() * unidades;

        System.out.println("Venta autorizada: " + unidades + " x " + bebidaEncontrada.getNombre() + "| Total: $" + total);

    }

    public List<Bebida> obtenerTodas() {
        return bebidas;
    }
}

