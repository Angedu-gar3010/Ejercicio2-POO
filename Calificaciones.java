
public class Calificaciones {
    private int id;
    private Usuario user;
    private Pelicula pelicula;
    private int calificacion;

    public Calificaciones(Usuario user, Pelicula pelicula, int calificacion) {
        if (user.getCantidadCalificaciones() < 10){
        this.user = user;
        this.pelicula = pelicula;
        this.calificacion = calificacion;
        } else {
            System.out.println("El usuario tiene mas de 10 calificaciones");
        }
    }

    public int getId() {
        return id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    

    @Override
    public String toString() {
        return "Calificaciones{" +
                ", user=" + user.getNombreUsuario() +
                ", pelicula=" + pelicula.getNombre() +
                ", calificacion=" + calificacion +
                '}';
    }

    public Usuario getUser() {
        return user;
    }

    
}
