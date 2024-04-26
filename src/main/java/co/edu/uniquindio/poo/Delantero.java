package co.edu.uniquindio.poo;

public class Delantero extends Jugador{

    private float golesPorPartido;

    public Delantero(String nombre, int minutosJugados, int salario, float golesPorPartido) {
        super(nombre, minutosJugados, salario);
        this.golesPorPartido = golesPorPartido;
    }

    @Override
    protected float calcularPuntos() {
        // Puntos por goles
        float puntosPorGoles = golesPorPartido * 30;
        return puntosPorGoles;
    }
}



