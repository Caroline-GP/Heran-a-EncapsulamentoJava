package model;

public class carro extends veiculos{
	
	private String veiculo;
	private String marca;
	private int rodas;
	
	
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo() {
		this.veiculo = veiculo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void carro(){
		System.out.println(" O " + getVeiculo() + " de " + getRodas() + " rodas "+ " está se movendo!");
	}
	
	
	}

