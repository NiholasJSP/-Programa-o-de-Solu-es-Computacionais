package prática10;

import java.util.Scanner;
/**
 * Classe Veiculos representa um veiculo com marca, modelo número do chassi, placa e cor.
 */
class Veiculos {
	private String marca;
	private String modelo;
	private String numeroChassi;
	private String placa;
	private String cor;
	/**
	 * Construtor para a classe Veiculos.
	 *
	 * @param marca A marca do veículos.
	 * @param modelo O modelo do veículo.
	 * @param numeroChassi O número do chassi do veículo.
	 * @param placa A placa do veículo.
	 * @param cor A cor do veículo.
	 */
	public Veiculos(String marca, String modelo, String numeroChassi, String placa, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroChassi = numeroChassi;
		this.placa = placa;
		this.cor = cor;
	}
	// Métodos de acesso para as propriedades do veículo.
	
	/**
	 * Obtem a marca do veículo.
	 * 
	 * @return A marca do veículo
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * Define a marca do veículo.
	 * 
	 * @param marca A nova marca do veículo.
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * Obtém o modelo do veículo.
	 * 
	 * @return O modelo do véiculo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * Define o modelo do veículo.
	 * 
	 * @param modelo O novo modelo do veículo.
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * Obtém o número do chassi do veículo.
	 * 
	 * @return O numero do chassi do véiculo
	 */
	public String getNumeroChassi() {
		return numeroChassi;
	}
	/**
	 * Define o número do chassi do veículo.
	 * 
	 * @param numeroChassi O novo número do chassi do veículo.
	 */
	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}
	/**
	 * Obtém a placa do veículo.
	 * 
	 * @return A placa do veículo
	 */
	public String getPlaca() {
		return placa;
	}
	/**
	 * Define a placa do veículo.
	 * 
	 * @param placa A nova placa do veículo.
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	/**
	 * Obtém a cor do veículo.
	 * 
	 * @return A cor do veículo.
	 */
	public String getCor() {
		return cor;
	}
	/**
	 * Define a cor do veículo.
	 * 
	 * @param cor A nova cor do veículo.
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	@Override
	public String toString() {
		return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", numeroChassi=" + numeroChassi + ", placa=" + placa + ", cor=" +cor + "]";
	}
	
}