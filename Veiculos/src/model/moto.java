package model;

public class moto extends veiculos{
	
	private String veilulo; 
	private int rodas;
	
	
	
	public String getVeilulo() {
		return veilulo;
	}
	public void setVeilulo(String veilulo) {
		this.veilulo = veilulo;
	}
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void moto(){
		System.out.println(" A " + getVeiculo() + " de " + getRodas() + " rodas " + " está se movendo!");
	}
	
	
	
	
	}


