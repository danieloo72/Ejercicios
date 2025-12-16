
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
    System.out.println("La media de las notas es: " + sumar);
    return sumar;
    }

    // Método mostrarInfo COMPLETAR
    public void mostrarInfo() {
        System.out.println("La notas de las asignaturas son: " + notas);
        System.out.println("La media de la primera y segunda asignaturas es: " + calcularMedia());
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
    public boolean ingresar(int ingresarSaldo) {
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
    public boolean retirar(int retirarSaldo) {
        boolean retirarValido = true;
        if (retirarSaldo > saldo) {
            retirarValido = false;
        } else {
            setSaldo(getSaldo() - retirarSaldo);
        }
        if (retirarValido == true) {
            System.out.println("Has retirado " + retirarSaldo + " por lo que tu saldo se queda en " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
        return retirarValido;
    }

    // método mostrarSaldo COMPLETAR
    public void mostrarSaldo() {
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // método mostrarInfo COMPLETAR
    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nDisponible: " + disponible);
    }
}



class Biblioteca {

    // lista de libros COMPLETAR
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    // añadirLibro COMPLETAR
    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    // prestarLibro COMPLETAR
    public void prestarLibro(Libro libro) {
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(libro.getTitulo())) {
                libros.remove(libro);
                System.out.println("Libro prestado correctamente.");
            }
        }
    }

    // devolverLibro COMPLETAR
    public void devolverLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
            System.out.println("Libro devuelto correctamente.");
        }
    }
    public void mostrarBiblioteca() {
        for (Libro libro : libros) {
            System.out.println("Libros: " + libro);
        }
    }
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
import java.util.ArrayList;
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
        alumno.añadirNota(7);
        alumno.calcularMedia();
        alumno.mostrarInfo();

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 100);
        cuenta.ingresar(500);
        cuenta.retirar(50);
        cuenta.retirar(1000);
        cuenta.mostrarSaldo();

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
        Libro libro1 = new Libro("El Quijote", "Cervantes", true);
        Libro libro2 = new Libro("Drácula", "Bram Stroker", true);
        Libro libro3 = new Libro("1984", "George Orwell", false);
        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.añadirLibro(libro1);
        biblioteca.añadirLibro(libro2);
        biblioteca.añadirLibro(libro3);

        biblioteca.prestarLibro(libro2);
        biblioteca.devolverLibro(libro3);
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}