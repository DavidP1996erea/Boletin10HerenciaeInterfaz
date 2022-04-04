package principal;

import java.util.Scanner;

public class Programadores extends Empleados implements MetodosCompartidos{

    Scanner sc = new Scanner(System.in);

    private int tlfMovil;
    private Portatil portatil;
    private Proyectos proyectos;
    private Tecnologias tecnologias;

    public Programadores(String nombre, String apellidos, String dni, int antiguedad, int telefeno, double salario
            , Portatil portatil, int tlfMovil, Proyectos proyectos, Tecnologias tecnologias) {
        super(nombre, apellidos, dni, antiguedad, telefeno, salario);
        this.portatil=portatil;
        this.tlfMovil=tlfMovil;
        this.proyectos=proyectos;
        this.tecnologias=tecnologias;
    }


    
    @Override
    public void incrementarSalario() {
        for(int i = 0; i<antiguedad; i++){
            this.setSalario(this.getSalario()*1.10);
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
                "Su teléfono es " + telefeno + " con el movil " + tlfMovil + " y su puesto es de "
                + getClass().getSimpleName() + saltolinea + "Le pertenece el " + portatil + ", usa la tecnologia "
                + tecnologias + " y está en el proyecto " + proyectos;
    }


    @Override
    public void cambiarTecnologia() {
        System.out.println("Escriba la tecnologia a la que desea cambiar");
        setTecnologias(Tecnologias.valueOf(sc.nextLine()));


    }

    @Override
    public void cambiarPortatil() {
        System.out.println("Escriba el portatil al que desea cambiar");

        setPortatil(new Portatil(Modelo.valueOf(sc.nextLine())));


    }

    public int getTlfMovil() {
        return tlfMovil;
    }

    public void setTlfMovil(int tlfMovil) {
        this.tlfMovil = tlfMovil;
    }

    public Portatil getPortatil() {
        return portatil;
    }

    public void setPortatil(Portatil portatil) {
        this.portatil = portatil;
    }

    public Proyectos getProyectos() {
        return proyectos;
    }

    public void setProyectos(Proyectos proyectos) {
        this.proyectos = proyectos;
    }

    public Tecnologias getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(Tecnologias tecnologias) {
        this.tecnologias = tecnologias;
    }
}

