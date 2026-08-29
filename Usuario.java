

public class Usuario {


    private String nombre;
    private String nombreUsuario;
    private int edad;
    private Calificaciones[] calificaciones;
    private int cantidadCalificaciones;


    public Usuario(String nombre, String nombreUsuario, int edad) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.edad = edad;
        this.calificaciones = new Calificaciones[10];
        this.cantidadCalificaciones = 0;
    }


    public String getNombre() {
        return nombre;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public int getEdad() {
        return edad;
    }


    public Calificaciones[] getCalificaciones() {
        return calificaciones;
    }


    public int getCantidadCalificaciones() {
        return cantidadCalificaciones;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public boolean agregarCalificacion(Calificaciones calificacion) {
    if (cantidadCalificaciones < calificaciones.length) {
        calificaciones[cantidadCalificaciones] = calificacion;
        cantidadCalificaciones++;
        return true;
    }

        return false; 
    }
   
}