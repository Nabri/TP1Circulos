package ar.edu.unlam.tp1;

public class Circulo {

	private Double radio;
			Double pi= 3.14159265359;
	
		public void definiendoElRadio (Double radio){
			this.radio = radio;
		}
		
		public Double conocerElRadio (){
			return radio;
		}
		
		public Double conocerElPerimetro (){
			return 2 * pi * radio ;
		}
		
		public Double conocerElArea () {
			return pi * radio * radio ;
		}
}
	
	
	
