
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    // Constructor
    public Coche(String marca, String modelo, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // Método acelerar (suma +10) COMPLETAR
    public void acelerar() {
        setVelocidad(getVelocidad() + 10);
        System.out.println("La velocidad del " + marca + " ha aumentado a " + getVelocidad());
    }

    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
    public void frenar() {
        setVelocidad(getVelocidad() -10);
        System.out.println("La velocidad del " + marca + " se ha reducido a " + getVelocidad());
    }

    // Método mostrarDatos COMPLETAR
    public void mostrarDatos() {
        System.out.println("La marca del coche es " + marca);
        System.out.println("El modelo del coche es " + modelo);
        System.out.println("La velocidad máxima del coche es " + velocidad);
    }

}



// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//



import java.util.ArrayList;
import java.util.Scanner;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<Integer>();
    }
    
    // Método añadirNota COMPLETAR
    public void añadirNota(int nota) {
        notas.add(nota);
    }

    // Método calcularMedia COMPLETAR
    public double calcularMedia() {
    double sumar = 0; 
    for (Integer nota : notas) {
        sumar += nota;
    }
    sumar /= notas.size();
    return sumar;
    }

    // Método mostrarInfo COMPLETAR
    public static void mostrarInfo() {
        System.out.println("La notas de las asignaturas son: " + notas);
        System.out.println("La media de la primera y segunda asignaturas es: " + media);
    }

}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR
    private String titular;
    private int saldo;

    // constructor COMPLETAR
    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // método ingresar COMPLETAR
    public int ingresar(int ingresarSaldo) {
        boolean ingresarValido = true; 
        if (ingresarSaldo < 1) {
           ingresarValido = false;
        } else {
            setSaldo(getSaldo() + ingresarSaldo);
        }
        if (ingresarValido == true) {
            System.out.println("Has ingresado " + ingresarSaldo + " por lo que tu saldo se queda en " + saldo);
        }
        return ingresarValido;
    }
   
    // método retirar COMPLETAR
    public int retirar(int retirarSaldo) {
        boolean retirarValido = true;
        if (retirarSaldo > saldo) {
            retirarValido = false;
        } else {
            setSaldo(getSaldo() - retirarSaldo)
        }
        if (retirarValido == true) {
            System.out.println("Has retirado " + retirarSaldo + " por lo que tu saldo se queda en " + saldo);
        }
        return retirarValido;
    }

    // método mostrarSaldo COMPLETAR
    public static void mostrarSaldo() {
        System.out.println("EL nombre del titular de la cuenta es: " + titular);
        System.out.println("El saldo de la cuenta es: " + saldo);
    } 
    
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {

    // atributos COMPLETAR
    private String titulo;
    private String autor;
    private boolean disponible;
    
    // constructor COMPLETAR
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
   

    // método mostrarInfo COMPLETAR
    public static void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nDisponible: " + disponible);
    }
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    // añadirLibro COMPLETAR
    public static void ()
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.
        Coche coche = new Coche("Honda", "Civic", 180);
        coche.acelerar();
        coche.frenar();
        coche.mostrarDatos();



        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        Alumno alumno = new Alumno("Pablo");
        alumno.añadirNota(9);
        alumno.añadirNota(7)

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}