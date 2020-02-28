package pruebafeb;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//SE CREA UN ARREGLO DE TIPO DE ELECTRODOMESTICOS
		Electrodomestico tipoElectrod[]=new Electrodomestico[10];
		   
        //SE ASIGNA POSICION
        tipoElectrod[0]=new Electrodomestico("Negro", 'A', 150, 50);
        tipoElectrod[1]=new Electrodomestico("Gris", 'E', 100, 80);
        tipoElectrod[2]=new Electrodomestico("Rojo", 'C', 60, 20);
        tipoElectrod[3]=new Lavadora(80, 50);
        tipoElectrod[4]=new Lavadora(60, 50);
        tipoElectrod[5]=new Lavadora(50, 50);
        tipoElectrod[6]=new Television(20, false);
        tipoElectrod[7]=new Television(60, false);
        tipoElectrod[8]=new Television(40, true);
        tipoElectrod[9]=new Television(30, true);
                  
        //VARIABLES DE LOS TOTALES
        int totalElectrodo=0;
        int totalTele=0;
        int totalLavadoras=0;
   
        //RECORRE EL ARREGLO PARA VERIFICAR TIPO DE ELECTRODOMESTICO
        for(int i=0;i<tipoElectrod.length;i++){
            
   
            if(tipoElectrod[i] instanceof Electrodomestico){
                totalElectrodo+=tipoElectrod[i].precioFinal();
            }
            if(tipoElectrod[i] instanceof Lavadora){
                totalLavadoras+=tipoElectrod[i].precioFinal();
            }
            if(tipoElectrod[i] instanceof Television){
                totalTele+=tipoElectrod[i].precioFinal();
            }
        }
   
        //SE IMPRIME EL RESULTADO SOLICITADO
        
        System.out.println("La suma de los electrodomesticos es de "+totalElectrodo);
        System.out.println("La suma de las lavadoras es de "+totalLavadoras);
        System.out.println("La suma de los televisores es de "+totalTele);
   
    }
   
	
		
	}


