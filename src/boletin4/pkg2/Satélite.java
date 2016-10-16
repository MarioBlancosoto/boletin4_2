package boletin4.pkg2;

public class Satélite {

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;
    private double verposicion;

    public Satélite() {

        meridiano = 0;
        paralelo = 0;
        distanciaTerra = 0;

    }

    public Satélite(double m, double p, double d) {

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public void setMeridiano(double meridiano) {
        this.meridiano = meridiano;
    }

    public void setParalelo(double paralelo) {
        this.paralelo = paralelo;
    }

    public void setDistanciaTerra(double distanciaTerra) {
        this.distanciaTerra = distanciaTerra;
    }

    public void getVerposicion() {

       System.out.println("o satelite atopase  no paralelo " + paralelo +" no meridiano " +meridiano + " a unha distancia da terra " + distanciaTerra);
    }

}
