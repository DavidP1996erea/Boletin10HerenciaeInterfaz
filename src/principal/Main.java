package principal;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Empleados ad = new Administrativos("david", "ruben", "xd", 12, 8944,96, Despachos.Junkrat, 25);
        Empleados prog1 = new Programadores("Angel", "Navarro", "Gensshin", 7,
                5895, 968, new Portatil(Modelo.Ruben), 9685, Proyectos.Proyecto2, Tecnologias.cmasmas);


        prog1.impresion();

        ((Programadores)prog1).cambiarPortatil();
        prog1.impresion();

    }
}
