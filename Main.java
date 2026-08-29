import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opc = -1;
        int numeroPelicula = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("---------------- Cartelera ----------------");
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.next();
        System.out.println("Ingrese su nombre de usuario: ");
        String user = scanner.next();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();

        Usuario usuario = new Usuario(nombre, user, edad);

        ArrayList<Pelicula> pelis = new ArrayList<>();
        

        while(opc < 0){

            System.out.println(" 1. Registrar calificacion");
            System.out.println(" 2. Consultar calificaciones");
            System.out.println(" 3. Actualizar calificacion");
            System.out.println(" 4. Consultar calificacion");
            System.out.println(" 5. Calificacion promedio");
            System.out.println(" 6. Calificacion mas alta");
            System.out.println(" 7. Calificacion mas baja");

            System.out.println(" Ingrese su opcion: ");
            opc = scanner.nextInt();
            
            Calificaciones[] perUser = usuario.getCalificaciones();
            int cont = 1;

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombrePelicula = scanner.next();
                    System.out.println("Ingrese el año de publicación");
                    int anio = scanner.nextInt();
                    System.out.println("Ingrese el genero");
                    String gen = scanner.next();

                    Genero genero;
                    

                    switch (gen) {
                        case "Drama":
                            genero = Genero.DRAMA;
                            break;

                        case "Acción":
                        case "Accion":
                            genero = Genero.ACCION;
                            break;

                        case "Romance":
                            genero = Genero.ROMANCE;
                            break;

                        case "Comedia":
                            genero = Genero.COMEDIA;
                            break;

                        case "Suspenso":
                            genero = Genero.SUSPENSO;
                            break;

                        case "Terror":
                            genero = Genero.TERROR;
                            break;

                        default:
                            genero = Genero.INDEFINIDO;
                    }
                    System.out.println("Ingrese la calificación");
                    int calificacion = scanner.nextInt();
                    if(calificacion < 1 || calificacion > 10){
                        System.out.println("Ingrese una calificacion entre 1 y 10");
                    } else {
                        numeroPelicula += 1;
                        Pelicula pelicula = new Pelicula(nombrePelicula, genero, anio, numeroPelicula, calificacion);
                        pelis.add(pelicula);
                        Calificaciones calificacionUsuario = new Calificaciones(usuario, pelicula, calificacion);

                        if (usuario.agregarCalificacion(calificacionUsuario)) {
                            System.out.println("Calificación registrada correctamente.");
                        } else {
                            System.out.println("No se pueden registrar más calificaciones.");
                        }
                    }
                    opc = -1;
                    break;
                case 2:
                    int conteo = 0;
                    System.out.println("------------- Calificaciones -------------");
                    for(Calificaciones cali : perUser){
                        if(cali != null){
                            System.out.println(cont + ". "
                                + cali.getPelicula().getNombre() + " - " + 
                                cali.getUser().getNombreUsuario() + " - " + 
                                cali.getCalificacion()
                            );
                            conteo = cont;
                        }
                        cont += 1;
                    }
                    System.out.println("Han sido calificadas " + conteo + " peliculas" + " quedan " + (10-conteo) + " reseñas por hacer");
                    opc = -1;
                    break;
                case 3:
                    System.out.println("------------- Calificaciones -------------");
                    for(Calificaciones cali : perUser){
                        if(cali != null){
                            System.out.println(cont + ". "
                                + cali.getPelicula().getNombre() + " - " + 
                                cali.getUser().getNombreUsuario() + " - " + 
                                cali.getCalificacion()
                            );
                        }
                        cont += 1;
                    }
                    System.out.println("Seleccione la pelicula que desea modificar: ");
                    int act = scanner.nextInt() -1;
                    System.out.println("Ingrese la nueva calificacion: ");
                    int nueva = scanner.nextInt();
                    if(nueva < 1 || nueva > 10){
                        System.out.println("Ingrese una calificacion entre 1 y 10");
                    }  else{
                        perUser[act].setCalificacion(nueva);
                        System.out.println("Calificacion actualizada con exito: " + perUser[act].getPelicula().getNombre() + " - " + perUser[act].getCalificacion());
                    }
                    opc = -1;
                    break;
                case 4:
                    System.out.println("Ingrese el numero de pelicula que desea consultar");
                    int peliCon = scanner.nextInt();
                    for(Calificaciones cali : perUser){
                        if(cali != null){
                            if(cali.getPelicula().getNumeroPelicula() == peliCon){
                                System.out.println(cont + ". "
                                    + cali.getPelicula().getNombre() + " - " + 
                                    cali.getUser().getNombreUsuario() + " - " + 
                                    cali.getCalificacion()
                                );
                            }
                            cont += 1;
                        }
                    }
                    opc = -1;
                    break;
                case 5: 
                    double sumatoria = 0;
                    double total = 0.0;
                        for(Calificaciones cali : perUser){
                            if(cali != null){
                                sumatoria += cali.getCalificacion();
                                total = cali.getPelicula().getNumeroPelicula();
                            }
                        }
                    double promedio = sumatoria/total;
                    System.out.println("Calificacion promedio del usuario: " + promedio);
                    opc = -1;
                    break;
                case 6:
                    int alta = -1;
                    for(int i = 0; i < perUser.length; i++){
                        if(perUser[i] != null)
                            if(perUser[i].getCalificacion() > alta){
                                alta = perUser[i].getCalificacion();
                            }
                    }
                    System.out.println("La calificacion mas alta es: " + alta);
                    opc = -1;
                    break;
                case 7:
                    int baja = 11;
                    for(int i = 0; i < perUser.length; i++){
                        if(perUser[i] != null)
                            if(perUser[i].getCalificacion() < baja){
                                baja = perUser[i].getCalificacion();
                            }
                    }
                    System.out.println("La calificacion mas baja es: " + baja);
                    opc = -1;
                    break;
                default:
                    break;
            }
        }
    }
}
