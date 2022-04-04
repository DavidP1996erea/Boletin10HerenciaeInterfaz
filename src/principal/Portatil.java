package principal;

enum Modelo{
Lenovont, XD, Vaio, Ruben
}

public class Portatil {

    protected String marca;
    protected Modelo modelo;
    protected int nSerie=0;

    public Portatil(Modelo modelo){

        marca="HP";
        nSerie++;
        this.modelo=modelo;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return "portatil modelo " + modelo + " con numero de serie: " + this.nSerie;
    }
}
