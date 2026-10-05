package test;
import modelo.Alumno;
import modelo.Mostrador;
import modelo.Articulo;
import modelo.CafeAlumnos;
public class MainCafeAlumnos {
    public static void main (String [] args){
        Mostrador p1 = new Mostrador();
        CafeAlumnos cafeteria = new CafeAlumnos("Pato Feliz", 1234567890);
        cafeteria.setAlumno(new Alumno("Juan","Camacho")); //Será mi getAlumno(1);
        cafeteria.setAlumno(new Alumno("Andre","Casanova",300)); //Será mi getAlumno(2);
        Articulo prod1 = new Articulo("Papas",30);
        
        //Saldos actuales de los estudiantes (sin haber pagado algo):
        System.out.println(cafeteria.getAlumno(1).getPuntos());
        System.out.println(cafeteria.getAlumno(2).getPuntos());

        System.out.println("\nLuego de haber hecho una compra de 30pts:\n");

        //Saldos después de haber pagado algo (-30pts):
        System.out.println(p1.hacerPago(prod1, cafeteria.getAlumno(1)));
        System.out.println(p1.hacerPago(prod1, cafeteria.getAlumno(2)));



    }
}
