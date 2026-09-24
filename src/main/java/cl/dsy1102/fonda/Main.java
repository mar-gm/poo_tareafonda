package cl.dsy1102.fonda;


public class Main {

    public static void main(String[] args) {
        GestorFonda gestorFonda = new GestorFonda();

        BebidaAlcoholica chichaAlcoholica = new BebidaAlcoholica("Chicha", 1000, 40, 12.0, false, true);

        BebidaAlcoholica piscoSour = new BebidaAlcoholica("Pisco sour", 1000, 60, 95, true, true);


        BebidaSinAlcohol chichaSinAlcohol = new BebidaSinAlcohol("Chicha", 1000, 60, 95);

        BebidaSinAlcohol moteConHuesillo = new BebidaSinAlcohol("Mote con huesillo", 40, 50, 70);

        chichaAlcoholica.restringirVenta();

        gestorFonda.registrar(chichaAlcoholica);
        gestorFonda.registrar(piscoSour);
        gestorFonda.registrar(chichaSinAlcohol);
        gestorFonda.registrar(moteConHuesillo);

        System.out.println("BUSCAR POR NOMBRE");


        for (Bebida bebida : gestorFonda.buscarPorNombre("Chicha")){
            System.out.println(bebida.obtenerDetalle());
            System.out.println("--");
        }
        System.out.println();
        System.out.println("___________VENTAS_____________");

        gestorFonda.vender("Pisco Sour", 2);
        gestorFonda.vender("Pisco Sour", 5);
        gestorFonda.vender("Chicha", 0);
        gestorFonda.vender("Mote con Huesillo", 6);

        System.out.println();


        System.out.println("===========LISTADO DE BEBIDAS==============");
        for (Bebida bebida : gestorFonda.obtenerTodas()) {
            System.out.println(bebida);
        }









    }
}




