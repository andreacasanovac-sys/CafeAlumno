package modelo;

public class CafeAlumnos {
    private String nombre;
    private int telefono;
    private Alumno[] alumno;
    private int cantAlumnos;

    public CafeAlumnos(String nom, int cel){
        setNombre(nom);
        setTelefono(cel);
        alumno = new Alumno[10];
        cantAlumnos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Alumno getAlumno(int cantAlumnos) {
        return alumno[cantAlumnos - 1];
    }

    public void setAlumno(Alumno alumno) {
        this.alumno[cantAlumnos] = alumno;
        cantAlumnos++;
    }
    
}
