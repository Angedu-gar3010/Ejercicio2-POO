
public class Pelicula {

    
    private String nombre;
    private Genero genero;
    private int anio;
    private int calificacion;
    private int numeroPelicula;


    public Pelicula(String nombre, Genero genero, int anio, int numeroPelicula, int calificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.numeroPelicula = numeroPelicula;
        this.calificacion = calificacion;
    }


    public String getNombre() {
        return nombre;
    }


    public Genero getGenero() {
        return genero;
    }


    public int getAnio() {
        return anio;
    }


    public int getNumeroPelicula() {
        return numeroPelicula;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setGenero(Genero genero) {
        this.genero = genero;
    }


    public void setAnio(int anio) {
        this.anio = anio;
    }


    public void setNumeroPelicula(int numeroPelicula) {
        this.numeroPelicula = numeroPelicula;
    }


    public int getCalificacion() {
        return calificacion;
    }


    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}