// 1. INTERFAZ: Define un comportamiento que pueden tener varios objetos
interface ImpuestoAplicable {
    double calcularImpuesto();
}

// 2. CLASE ABSTRACTA: Base para todos los productos
abstract class Producto implements ImpuestoAplicable {
    protected String nombre;
    protected double precioBase;

    public Producto(String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Método abstracto que cada subclase implementará de forma distinta (Polimorfismo)
    public abstract void mostrarDetalles();
}

// 3. SUBCLASES: Implementan los métodos abstractos
class Electronico extends Producto {
    public Electronico(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return this.precioBase * 0.16; // 16% IVA
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Electrónico] " + nombre + " | Precio Final: $" + (precioBase + calcularImpuesto()));
    }
}

class Alimento extends Producto {
    public Alimento(String nombre, double precioBase) {
        super(nombre, precioBase);
    }

    @Override
    public double calcularImpuesto() {
        return 0; // Alimentos sin IVA
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Alimento] " + nombre + " | Precio Final: $" + precioBase);
    }
}

class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precioBase, String talla) {
        super(nombre, precioBase);
        this.talla = talla;
    }

    @Override
    public double calcularImpuesto() {
        return this.precioBase * 0.08; // 8% impuesto textil
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("[Ropa] " + nombre + " (Talla: " + talla + ") | Precio Final: $" + (precioBase + calcularImpuesto()));
    }
}

// 4. CLASE PRINCIPAL: Debe llamarse 'Main' para que el IDE funcione
public class Main {
    public static void main(String[] args) {
        // Polimorfismo: Una lista de 'Producto' que almacena diferentes tipos
        java.util.List<Producto> inventario = new java.util.ArrayList<>();

        inventario.add(new Electronico("Smartphone", 500.00));
        inventario.add(new Alimento("Manzanas 1kg", 3.50));
        inventario.add(new Ropa("Camiseta Algodón", 20.00, "L"));

        System.out.println("SISTEMA DE GESTIÓN DE INVENTARIOS");
        System.out.println("---------------------------------");

        // Ejecución polimórfica: p.mostrarDetalles() hace algo distinto según el objeto
        for (Producto p : inventario) {
            p.mostrarDetalles();
        }
    }
}