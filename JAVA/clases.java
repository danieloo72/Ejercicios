
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
    
    // Método acelerar (suma +10) COMPLETAR
    public static void acelerar() {
        int velocidad += 10;
        if (velocidad <= 120) {
            System.out.println("La aceleración del coche es: " + velocidad);  
        } else {
            System.out.println("La aceleración del coche no puede pasar de los 120 km/h.");
        }
    }
   
    // Método frenar (resta -10 y nunca menor que 0) COMPLETAR
    public static void frenar() {
        int velocidad -= 10;
        if (velocidad > -1) {
            System.out.println("La velocidad del " + marca + " se ha reducido a " + velocidad);
        } else {
            System.out.println("La velocidad no puede estar por debajo del 0");
        } 
    }

    // Método mostrarDatos COMPLETAR
    public static void mostrarDatos() {
        System.out.println("La marca del coche es " + marca);
        System.out.println("El modelo del coche es " + modelo);
        System.out.println("La velocidad del coche es " + velocidad);
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
    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
   
    // Método añadirNota COMPLETAR
    public static void añadirNota() {
        System.out.println("Introduce la nota de la primera asignatura: ");
        int asignatura1 = sc.nextLine();
        int asignatura1 = nota.add(new(nota));
        SYstem.out.pritnln("Introduce la nota de la segunda asignatura:");
        int asignatura2 = sc.nextLine();
        int asignatura2 = nota.add(new(nota));
        System.out.println("Las notas han sido añadidas.");
    }
   
    // Método calcularMedia COMPLETAR
    public static void calcularMedia() {
        int media = (asignatura1 + asignatura2) / 2;
        System.out.println("La media de las notas es: " + media);
    }

    // Método mostrarInfo COMPLETAR
    public static void mostrarInfo() {
        System.out.println("La nota de la primera asignatura es: " + asignatura1);
        System.out.println("La nota de la segunda asignatura es: " +  asignatura2);
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
    
    // método ingresar COMPLETAR
    public int ingresar() {
        System.out.print("Introduce la cantidad que deseas ingresar: ");
        int ingresarSaldo = sc.nextInt();
        if (ingresarSaldo < 0) {
            System.out.println("No se puede ingresar un número negativo.");
        }
        System.out.println("Has ingresado " + ingresarSaldo);
        int suma = ingresarSaldo + saldo;
        System.out.println("El saldo todal de la cuenta se queda en: " + suma);
        return suma;
    }
   
    // método retirar COMPLETAR
    public int retirar() {
        System.out.print("Introduce la cantidad que deseas retirar: ");
        int retirarSaldo = sc.nextInt();
        System.out.println("Has retirado " + retirarSaldo);
        int resta = saldo - retirarSaldo;
        System.out.println("El saldo todal de la cuenta se queda en: " + resta);
        return resta;
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
    
    
    // constructor COMPLETAR
   

    // método mostrarInfo COMPLETAR
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

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

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        Coche coche = new Coche("")

        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

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