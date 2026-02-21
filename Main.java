/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA BIBLIOTECA ===");

        // Crear alumno
        Alumno alumno1 = new Alumno(1, "Ana");

        // Crear libro
        Libro libro1 = new Libro("El Principito", "Saint-Exupery");

        // Mostrar estado inicial
        libro1.mostrarInfo();

        // Prestar libro al alumno
        libro1.prestar(alumno1);

        // Mostrar estado después del préstamo
        libro1.mostrarInfo();
    }
}