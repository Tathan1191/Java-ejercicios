public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        cantidadActual = capacidadMaxima;
    }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
            System.out.println("Se ha servido una taza de " + cantidad + " cc de café.");
        } else {
            System.out.println("No hay suficiente café para llenar la taza.");
            System.out.println("Se ha servido una taza de " + cantidadActual + " cc de café.");
            cantidadActual = 0;
        }
    }

    public void vaciarCafetera() {
        cantidadActual = 0;
    }

    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
        } else {
            System.out.println("No se puede agregar más café, la cafetera está llena.");
            cantidadActual = capacidadMaxima;
        }
    }
}