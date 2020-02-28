package pruebafeb;

public class Electrodomestico {

	//DECLARACION DE CONSTANTES
	private final String COLORDEF="Blanco";
	private final char CONS_ENER= 'F';
	private final int PRECIO_BASE=100;
	private final int PESO=5;
	
	//ATRIBUTOS
	private String color;
	private char consumoE;
	public int precioBase;
	public int peso;
	
	public int precioFinal;
		
	//CONSTRUCTORES
	private int peso() {
		return peso;
	}
	private int precioBase() {
		return precioBase;
	}
	private String color() {
		return color;
	}
	private char consumoE() {
		return consumoE;
	}
	public int precioFinal(){
		int suma=0;
		
	//SE CONSULTA POR LA LETRA DEL CONSUMO ENERGETICO	
        switch(consumoE){
        
        case 'A':
            suma+=100;
            break;
        case 'B':
            suma+=80;
            break;
        case 'C':
            suma+=60;
            break;
        case 'D':
            suma+=50;
            break;
        case 'E':
            suma+=30;
            break;
        case 'F':
            suma+=10;
            break;    
        }
		return suma;  
  }
	
	//SE CONSULTA POR EL COLOR.  SI NO CORRESPONDE, TOMA COLOR POR DEFECTO
	private void compruebaColor(String color){
		   
        String colores[]={"Blanco", "Negro", "Rojo", "Azul", "Gris"};
        boolean colorq=false;
  
        for(int i=0;i<colores.length && !colorq;i++){
              
            if(colores[i].equals(color)){
                colorq=true;
            }
        }
         if(colorq){
            this.color=color;
        }else{
            this.color=COLORDEF;
        }
	}         
	
	//SE COMPRUEBA CONSUMO ENERGETICO
	public double compruebaConsumoE(char consumoE){
        
		if(consumoE>=65 && consumoE<=70){
            this.consumoE=consumoE;
        }else{
            this.consumoE=CONS_ENER;
        }
         
    //SE COMPRUEBA EL PESO
	
    int aumPrecio1=0;
	
	if(peso>=0 && peso<19){
				aumPrecio1+=10;
			}else if(peso>=20 && peso<49){
				aumPrecio1+=50;
			}else if(peso>=50 && peso<=79){
				aumPrecio1+=80;
			}else if(peso>=80){
				aumPrecio1+=100;
    }
    return aumPrecio1;
}
	
	public Electrodomestico(String color, char consumoE, int precioBase, int peso) {
		this.color = color;
		this.consumoE = consumoE;
		this.precioBase = precioBase;
		this.peso = peso;
	}
	//DEVUELVE EL COLOR
	public String getColor() {
		return color;
	}
	//DEVUELVE EL CONSUMO	
	public char getConsumoE() {
		return consumoE;
	}
	//DEVUELVE EL PRECIO BASE
	public int getPrecioBase() {
		return precioBase;
	}
	//DEVUELVE EL PESO
	public int getPeso() {
		return peso;
	}
	
	public Electrodomestico() {
		this.color();
		this.consumoE();
		this.precioBase();
		this.peso();
		
	}
	public int getPrecioFinal() {
		return precioFinal;
	}
	
	}
	

		
	
	

        