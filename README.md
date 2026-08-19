# Análisis
Realizar análisis.  

## Sistema de calicifaciones de Películas  
### 2. ¿Qué tipo deben tener las propiedades y métodos de cada clase?  

#### Usuario   
- nombre: String  
- nombreUsuario: String  
- edad: int  
- calificaciones: float[]  
- cantidadCalificaciones: int  
- registrarCalificacion(int): void  
- consultarCalificaciones(): void  
- consultarPelicula(int): int  
- modificarCalificacion(int, int): void  
- calcularPromedio(): double  
- obtenerMayor(): int  
- obtenerMenor(): int  
- espaciosDisponibles(): int  

#### Película  
- numeroPelicula: int  
- getNumeroPelicula(): int  

### 3. ¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo? ¿Qué tipo de datos almacenará?  
- Propiedad: calificaciones  
- Tipo: float[]    

### 4. ¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?  

#### Usuario  
- Propiedades: private
- Métodos: public
- Constructor: public

#### Película
- Propiedades: private
- Métodos: public
- Constructor: public

### 5. ¿Qué parámetros serán requeridos por los métodos en sus clases?

#### Usuario  
- registrarCalificacion(int calificacion)  
- consultarPelicula(int numeroPelicula)  
- modificarCalificacion(int numeroPelicula, int nuevaCalificacion)  
- calcularPromedio()  
- obtenerMayor()  
- obtenerMenor()  
- espaciosDisponibles()  

#### Película  
- Pelicula(int numeroPelicula)  

### 6. ¿Cómo proveerá de valores iniciales a sus objetos? ¿Qué valores iniciales les asignará?  
- Los valores iniciales se dan a partir de constructores.  
- Usuario recibirá nombre, nombreUsuario y edad.  
- calificaciones se inicializará como un arreglo de tamaño 10.  
- cantidadCalificaciones comenzará en 0.      
- Un usuario nuevo comenzará sin calificaciones registradas.  
- Pelicula recibirá inicialmente su número de identificación.  

### 7. ¿Cómo determinará cuál es la siguiente posición disponible dentro del arreglo?  
- Se utilizará cantidadCalificaciones para identificar la siguiente posición.  
- Después de registrar una calificación válida, aumentará en 1.  
- Antes de registrar se verificará que cantidadCalificaciones < 10.  

### 8. ¿Cómo recorrerá únicamente las posiciones del arreglo que contienen calificaciones registradas?

- El recorrido comenzará en el índice 0.  
- cantidadCalificaciones se utilizará como límite del recorrido.  
- Se recorrerán las posiciones desde 0 hasta cantidadCalificaciones - 1.  
- Se terminara el ciclo cuando encuentre un valor 0.
