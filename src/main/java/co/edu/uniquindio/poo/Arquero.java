package co.edu.uniquindio.poo;

public class Arquero extends Jugador {

    private float golesRecibidosPorPartido;

    public Arquero(String nombre, int minutosJugados, int salario, float golesRecibidosPorPartido) {
        super(nombre, minutosJugados, salario);
        this.golesRecibidosPorPartido = golesRecibidosPorPartido;
    }

    @Override
    protected float calcularPuntos() {
        // Puntos por evitar goles
        float puntosPorEvitarGoles = 50 - (golesRecibidosPorPartido * 30);
        return puntosPorEvitarGoles;
    }

}
