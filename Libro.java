public class Libro {

    private String titulo;
    private String autor;
    private boolean prestado;
    private Alumno alumnoPrestamo;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
        this.alumnoPrestamo = null;
    }

    public void prestar(Alumno alumno) {
        if (!prestado) {
            prestado = true;
            alumnoPrestamo = alumno;
            System.out.println("Libro prestado a: " + alumno.getNombre());
        } else {
            System.out.println("Libro ya prestado");
        }
    }

    public void mostrarInfo() {
        if (prestado) {
            System.out.println(titulo + " - Prestado a " + alumnoPrestamo.getNombre());
        } else {
            System.out.println(titulo + " - Disponible");
        }
    }
}