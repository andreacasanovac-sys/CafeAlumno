package modelo;

public class Alumno {
    private String nombre;
    private String apellido;
    private int puntos;

    public Alumno(String nom, String ape){
        setNombre(nom);
        setApellido(ape);
        this.puntos = 100;
    }

    public Alumno(String nom, String ape, int pts){
        setNombre(nom);
        setApellido(ape);
        setPuntos(pts);
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        if(puntos <= 0){
            System.err.println("La cantidad de puntos no válida. Intente de nuevo.");
            return; //No devuelve nada, funciona en el void porque no está regresando algo.
        }
        this.puntos = puntos;
    }
   
    

}
 