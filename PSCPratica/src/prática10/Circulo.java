package prática10;

class Circulo {
	private int x;
	private int y;
	private double raio;

	// Construtor com parâmetros
	public Circulo(int x, int y, double raio) {
		this.x = x;
		this.y = y;
		this.raio = raio;
	}

	// Construtor vazio
	public Circulo() {
		this.x = 0;
		this.y = 0;
		this.raio = 0;
	}

	// Método para calcular a área do círculo
	public double calcularArea() {
		return Math.PI * Math.pow(raio, 2);
	}

	// Método para calcular o perímetro do círculo
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}

	// Métodos para mover o círculo horizontalmente e verticalmente
	public void moveX(int x1) {
		this.x += x1;
	}

	public void moveY(int y1) {
		this.y += y1;
	}

	// Método para aumentar o raio do círculo
	public void aumenta(double n) {
		this.raio *= n;
	}

	// Método para exibir informações do círculo
	public String exibe() {
		return "Centro: (" + x + ", " + y + ")\nRaio: " + raio + "\nÁrea: " + calcularArea() + "\nPerímetro: "
				+ calcularPerimetro();
	}
}