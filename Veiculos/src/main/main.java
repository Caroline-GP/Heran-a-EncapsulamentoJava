package main;

import model.carro;
import model.moto;

public class main {

	
	public static void main(String[] args) {
		
		carro Carro = new carro();
		
		carro.setVeiculo(Carro);
		carro.setMarca(Ford);
		carro.setRodas(4);
		
		carro.carro();
		
		moto Moto = new moto();
		
		moto.setVeiculo(Moto);
		moto.setRodas(2);
		
		moto.moto();
		
	}

}
