package pruebafeb;

public class Lavadora extends Electrodomestico {

	//DECLARACION DE CONSTANTE
	final int CARGA=5;
	
	//ATRIBUTO
	private int carga;
	
	//METODO POR DEFECTO
	public Lavadora() {
		// TODO Auto-generated constructor stub
	}
	public Lavadora(String color, char consumoE, int precioBase, int peso, int carga) {
		this.carga=carga;
	}
	//DEVUELVE CARGA
	public int getCARGA() {
		return carga;
	}
	public Lavadora(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}
	public int precioFinal(){
		int masCarga=super.precioFinal();
  
    if (carga>30){
    	masCarga+=50;
       	return masCarga;
    	}
		return masCarga;     		
}
		
}


