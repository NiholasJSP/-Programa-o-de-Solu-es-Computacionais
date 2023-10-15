package prática10;
/**
 * Classe Cadastro permitir cadastrar veiculos em um vetor e imprimilos.
 */
class Cadastro {
	private Veiculos[] veiculos;
	private int tamanho;
	private int capacidade;
	/**
	 * Construtor para a classe Cadastro
	 * 
	 * @param capacidade A capacidade inicial do vetor cadastro.
	 */
	public Cadastro(int capacidade) {
		this.capacidade = capacidade;
		this.veiculos = new Veiculos[capacidade];
		this.tamanho = 0;
	}
	/**
	 * Adiciona um veículo ao vetor de cadastro.
	 * 
	 * @param veiculo O veículo a ser adicionado.
	 */
	public void cadastrarVeiculo(Veiculos veiculo) {
		if (tamanho < capacidade) {
			veiculos[tamanho] = veiculo;
			tamanho++;
		} else {
			System.out.println("Cadastro de veículos está cheio.");
		}
	}
	/**
	 * Imprime o vetor de cadastro de veículos.
	 */
	public void imprimirCadastro() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Veículo #" + (i + 1) + ": " + veiculos[i]);
		}
	}
}