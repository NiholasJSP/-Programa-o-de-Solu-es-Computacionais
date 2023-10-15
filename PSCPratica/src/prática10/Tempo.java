package prática10;
class Tempo {
	private int hora;
	private int minuto;
	private int segundo;

	// Construtor padrão
	public Tempo() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	// Construtor com hora
	public Tempo(int hora) {
		setHora(hora);
		this.minuto = 0;
		this.segundo = 0;
	}

	// Construtor com hora e minuto
	public Tempo(int hora, int minuto) {
		setHora(hora);
		setMinuto(minuto);
		this.segundo = 0;
	}

	// Construtor com hora, minuto e segundo
	public Tempo(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	// Métodos de acesso (getters e setters) para hora, minuto e segundo
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		} else {
			System.out.println("Hora inválida. Deve estar entre 0 e 23.");
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		} else {
			System.out.println("Minuto inválido. Deve estar entre 0 e 59.");
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		} else {
			System.out.println("Segundo inválido. Deve estar entre 0 e 59.");
		}
	}

	// Método para definir hora, minuto e segundo de uma só vez
	public void setTime(int hora, int minuto, int segundo) {
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}

	// Método para retornar uma representação de hora no formato h:m:s
	public String toString() {
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
	}
}