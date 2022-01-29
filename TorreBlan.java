/**
*Clase que asemeja una pieza de torre blanca. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/
public class TorreBlan extends PzaJug{
    
    
    /**  
  *Metodo constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    public TorreBlan(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	}

	/**
*Representacion en cadena del objeto
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
 public String toString(){

	return "t";

    }
    /**
*Metodo que sirve para validar el movimiento de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param tablero[][] Arreglo de dos dimensiones sobre el cual se hace la validacion
*@param x fila actual de la pieza
*@param y columa actual de la pieza
*@param w fila futura de la pieza
*@param z columna futura de la pieza
*@return boolean
*/
    public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean valor=true;

	     
	 	int i;
		    PzaJug aux = new PzaJug(0,0,true,"aux");
	if(x==w){
	    if(y<z){
		for( i = y+1; i<z; i++){
	
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		
		}else{

		    	for( i = z+1; i<y; i++){
		  
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		}
	    }

	}//
	
	if(y==z){

	       if(x<w){
		for( i = x+1; i<w; i++){
	        
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		}else if(x>w){

		    	for( i = (x-1); i>w; i--){
		 
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		
			}


	}
	}
   
	if((x!=w)&&(y!=z)){
	    valor = false;
	}
	return valor;
    }


    }
