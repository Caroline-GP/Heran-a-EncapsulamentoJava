package model;

public class model {
	
	private String aparelho;
	private String cor;
	private String marca;
	private int polegada;
	

	public String getAparelho() {
		return aparelho;
	}
	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPolegada() {
		return polegada;
	}
	public void setPolegada(int polegada) {
		this.polegada = polegada;
	}
		
	
	public void beleza(){
		System.out.println("A " + this.aparelho + " fica muito bonita com a cor " + this.cor + "!");
	}
	public void modelo(){
		System.out.println("A " + this.aparelho + " é da marca " + this.marca + "!");
	}
	public void tamanho(){
		System.out.println("A " + this.aparelho + " é " + this.polegada + " polegadas!");
	}
	
		
	}
	
	




