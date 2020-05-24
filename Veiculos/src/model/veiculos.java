package model;

public class veiculos {
	private String veiculo;
	private String cor;
	private String marca;
	private int rodas;
	
	
	//exer 3
	
	//private int velocimetro;
	
	//public int getVelocimetro() {
		//return velocimetro;
	//}
	//public void setVelocimetro(int velocimetro) {
		//this.velocimetro = velocimetro;
	//}
	//public void Acelerar(int Acelerar) {
		//this.setAcelerar = ( 50 );
	//}
	//public void Frear(int Frea) {
		//this.setFrea = ( 20 );
	//}
	
	// fim do exercicio 3
	
	
	
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
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
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	
	public void OQue(){
		System.out.println("Esse " + this.veiculo + " é da ultima geração!");
	}
	public void beleza(){
		System.out.println("Esse " + this.veiculo + " é da cor " + this.cor + "!");
	}
	public void simbolo(){
		System.out.println("Esse " + this.veiculo + this.cor + " é da marca " + this.marca);
	}
	public void numero(){
		System.out.println(" O "  + this.veiculo + " tem " + this.rodas + " rodas!");
	}
	public void Acelerar(){
		
	}

		

	}

