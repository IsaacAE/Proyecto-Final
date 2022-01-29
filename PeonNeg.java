/**
*Clase que asemeja una pieza de peon negro. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/

public class PeonNeg extends PzaJug{
    
    /**  
  *Metodo constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    
    public PeonNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	}
	/**
*Representacion en cadena del objeto
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
 public String toString(){

	return "P";

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
	boolean g=true;
	
		if((z-y)==0){
	
		        if((w-x)==1){

			    }else{g=false;}
	}else{
	    	g=false;
	}
    return g;
}
    
}
