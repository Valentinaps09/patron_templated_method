package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
            // Crear jugadores
            Delantero delantero1 = new Delantero("Cristiano Ronaldo", 90, 15, 0.9f);
            Arquero arquero1 = new Arquero("Jan Oblak", 90, 10, 1.1f);
    
            // Calcular y mostrar la valoración de los jugadores
            System.out.println("Valoración de " + delantero1.getNombre() + ": " + delantero1.calcularValoracion());
            System.out.println(("Valoración de " + arquero1.getNombre() +":" + arquero1.calcularValoracion()));
    }
}

