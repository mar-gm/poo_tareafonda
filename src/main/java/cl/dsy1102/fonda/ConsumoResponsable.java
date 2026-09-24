package cl.dsy1102.fonda;

public interface ConsumoResponsable {
    int LIMITE_DE_UNIDADES = 3;
    boolean tieneVentaRestringida();
    void restringirVenta();
    boolean superarLimite(int unidades);
}
