package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    List<Bebida> bebidas;

    public GestorFonda() {
        bebidas = new ArrayList<>();
    }

    public void registrar(Bebida bebida) {
        this.bebidas.add(bebida);
        System.out.println(bebida.getNombre() + "-" + bebida.getClass().getSimpleName());
        System.out.println("Se ha registrado correctamente");
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
        Bebida bebidaencontrada = null;

        for (Bebida bebida : bebidas) {
            if (bebida.getNombre().equalsIgnoreCase(nombre)) ;
            bebidaencontrada = bebida;
            break;
        }
        if (bebidaencontrada == null) {
            System.out.println("no ha sido encontrada: " + nombre);

        }
        if (bebidaencontrada instanceof ConsumoResponsable) {
            ConsumoResponsable control = (ConsumoResponsable) bebidaencontrada;


            if (control.tieneVentaRestringida()) ;
            System.out.println("Venta rechazada: " + bebidaencontrada.getNombre());


            if (control.superarLimite(unidades));
            System.out.println("Venta rechazada" + unidades + "-" + bebidaencontrada.getNombre() + "Supera a las : " + ConsumoResponsable.LIMITE_DE_UNIDADES + "AL CLIENTE");

        }
        double total = bebidaencontrada.calcularPrecio() * unidades;
        System.out.println("Ventas: " + unidades + "-" + bebidaencontrada.getNombre() + "Total" + total);


    }
    public List<Bebida> obtenerTodas(){
        return bebidas;
    }


}






