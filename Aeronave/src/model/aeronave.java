package model;

public class aeronave {
		private String corExterna;
		private String marca;
		private boolean motor;
		//private String porte;
		//private boolean asa;

		
		public String getCorExterna() {
			return corExterna;
		}
		public void setCorExterna(String corExterna) {
			this.corExterna = corExterna;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public boolean isMotor() {
			return motor;
		}
		public void setMotor(boolean motor) {
			this.motor = motor;
		}
		//public String getPorte() {
			//return porte;
		//}
		//public void setPorte(String porte) {
			//this.porte = porte;
		//}
		//public boolean isAsa() {
			//return asa;
		//}
		//public void setAsa(boolean asa) {
			//this.asa = asa;
		//}
		public void voar() {
			System.out.println("A aeronave " + this.marca + " esta voando!");
		}
		public void silencioso(){
			System.out.println("O motor " + this.motor + " da aeronave " + this.marca + " é silencioso!");
		}
		public void beleza(){
			System.out.println("Em terra ou no céu, o avião é muito bonito com  a cor " + this.corExterna + "!");
		}
	}


