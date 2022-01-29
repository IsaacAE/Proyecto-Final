/**
*Clase que simula una pieza de caballo blanco. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*
*/

public class CabaBlan extends PzaJug{
    
  /**  
  *Método constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    public CabaBlan(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}
/**
*Método que muestra una representación del objeto como Strings
*@author Alcántara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
 public String toString(){

	return "c";

    }
    /**
*Método que sirve para saber si el movimiento de la pieza es válido
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
	
		if((x-2)==w || (x+2)==w){
	     if((y+1)==z || (y-1)==z){
		 
	     }else{ g=false; }
	 }else if((y-2)==z || (y+2)==z){
	     if((x+1)==w || (x-1)==w){
		 g=true;
	     }else{ g=false; }
	 }else{g=false; }
	 
    return g;
}

//

	// 
    }
