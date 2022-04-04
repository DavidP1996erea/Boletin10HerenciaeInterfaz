package principal;

public abstract class Empleados {

    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected int antiguedad;
    protected int telefeno;
    protected double salario;

    public Empleados(String nombre, String apellidos, String dni, int antiguedad, int telefeno, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.antiguedad = antiguedad;
        this.telefeno = telefeno;
        this.salario = salario;
    }

    public abstract void incrementarSalario();
    public abstract void impresion();



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTelefeno() {
        return telefeno;
    }

    public void setTelefeno(int telefeno) {
        this.telefeno = telefeno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
