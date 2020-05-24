package main;
import model.aeronave;
public class main {

	public static void main(String[] args) {
		
		aeronave Aeronave = new aeronave();
		Aeronave.setMarca("Boeing");
		Aeronave.setCorExterna("vermelha");
		Aeronave.setMotor(true);
		
		Aeronave.voar();
		Aeronave.silencioso();
		Aeronave.beleza();
		

	}

}
