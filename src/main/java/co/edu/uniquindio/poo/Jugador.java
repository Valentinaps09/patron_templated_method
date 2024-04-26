package co.edu.uniquindio.poo;

public abstract class Jugador {

	private String nombre;
	private int minutosJugados;
	private int salario;

	public Jugador(String nombre, int minutosJugados, int salario) {
		this.nombre = nombre;
		this.minutosJugados = minutosJugados;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public int getMinutosJugados() {
		return minutosJugados;
	}

	public int getSalario() {
		return salario;
	}

	// Método abstracto para calcular los puntos específicos de cada tipo de jugador
	protected abstract float calcularPuntos();

	// Método para calcular la valoración del jugador
	public String calcularValoracion() {
		float puntos = calcularPuntos();
		float salarioPonderado = salarioPonderado();

		// Ajuste por salario
		puntos -= salarioPonderado;

		// Asignación de valoración basada en los puntos finales usando un switch
		switch ((int) puntos) {
			case -9999:
				return "Malísimo";
			case 0:
				return "Malo";
			case 10:
				return "Normal";
			case 20:
				return "Bueno";
			default:
				return "Galáctico";
		}
	}

	// Método para calcular la penalización por salario
	private float salarioPonderado() {
		// Los delanteros pierden el 10% del salario, los porteros el 8%
		return (float) ((this instanceof Delantero) ? salario * 0.10 : salario * 0.08);
	}
}
