package principal;

import java.util.Scanner;

public class JefeProyectos extends Empleados implements MetodosCompartidos {

    Scanner sc = new Scanner(System.in);

    private Portatil portatil;
    private Proyectos proyectos;
    private Tecnologias tecnologias;
    private Coches coches;

    public JefeProyectos(String nombre, String apellidos, String dni, int antiguedad, int telefeno, double salario
            , Portatil portatil, Proyectos proyectos, Tecnologias tecnologias, Coches coches) {
        super(nombre, apellidos, dni, antiguedad, telefeno, salario);
        this.portatil=portatil;
        this.proyectos=proyectos;
        this.tecnologias=tecnologias;
        this.coches=coches;
    }

    @Override
    public void incrementarSalario() {

        for(int i = 0; i<antiguedad; i++){
            this.setSalario(this.getSalario()*2.00);
        }

    }

    @Override
    public void impresion() {

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

    public void cambiarCoche(){
        System.out.println("Escriba el coche al que desea cambiar");
        System.out.println("Introduzca la matricula");
        String matricula=sc.nextLine();
        System.out.println("Introduzca el modelo");
        String modelo = sc.nextLine();
        System.out.println("Introduzca la marca");
        String marca = sc.nextLine();

        setCoches(new Coches(matricula,marca,modelo));

    }




    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
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

    public Coches getCoches() {
        return coches;
    }

    public void setCoches(Coches coches) {
        this.coches = coches;
    }
}
