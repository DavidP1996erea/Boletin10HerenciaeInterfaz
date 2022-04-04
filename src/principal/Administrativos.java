package principal;

public class Administrativos extends Empleados   {

    private Despachos despachos;
    private int numFax;

    public Administrativos(String nombre, String apellidos, String dni, int antiguedad, int telefeno, double salario,
           Despachos despachos, int numFax) {
        super(nombre, apellidos, dni, antiguedad, telefeno, salario);
        this.despachos=despachos;
        this.numFax=numFax;
    }


    @Override
    public void incrementarSalario() {

        for(int i = 0; i<antiguedad; i++){
            this.setSalario(this.getSalario()*1.05);
        }

    }

    @Override
    public void impresion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String saltolinea = System.getProperty("line.separator");
        return "El empleado " + nombre + " " + apellidos + " con DNI " + dni + ", cobra " + salario+"." + saltolinea +
                "Su teléfono es " + telefeno + " con el fax " + numFax + " y su puesto es de "
                + getClass().getSimpleName() + saltolinea + "Le pertenece el despacho " + despachos;
    }

}



