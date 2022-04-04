package principal;

public class Administrativos extends Empleados   {

    private Despachos despachos;
    private int numFax;

    public Administrativos(String nombre, String apellidos, String dni, String antiguedad, int telefeno, double salario,
           Despachos despachos, int numFax) {
        super(nombre, apellidos, dni, antiguedad, telefeno, salario);
        this.despachos=despachos;
        this.numFax=numFax;
    }


    @Override
    public void incrementarSalario() {

        this.setSalario(this.getSalario()*1.05);

    }
}
