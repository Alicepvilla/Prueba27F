package pruebafeb;

public class Television extends Electrodomestico {

	//DECLARACION DE CONSTANTES
	final int RESOLUC=20;
	final boolean SINTONIZ=false;
	
	//VARIABLES
	int resoluc;
	boolean sintoniz;
	
	//CONSTRUCTORES
	public Television(String color, char consumoE, int precioBase, int peso) {
		super(color, consumoE, precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Television (int resoluc, boolean sintoniz) {
		this.resoluc=resoluc;
		this.sintoniz=sintoniz;
	}
	
	//DEVUELVE PRECIO BASE
	@Override
	public int getPrecioBase() {
		// TODO Auto-generated method stub
		return super.getPrecioBase();
	}

	//DEVUELVE PESO
	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return super.getPeso();
	}
	//DEVUELVE RESOLUCION
	public int getRESOLUC() {
		return RESOLUC;
	}
	//DEVUELVE SINTONIZADOR
	public boolean isSINTONIZ() {
		return SINTONIZ;
	}

	public int precioFinal(){
        int plus=super.precioFinal();
  
       
        if (resoluc>40){
            plus+=precioBase*0.3;
        }
        if (sintoniz){
            plus+=50;
        }
  
        return plus;
	
	}	
}
