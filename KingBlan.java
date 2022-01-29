/**
*Clase que simula una pieza de rey blanco. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*
*/

public class KingBlan extends PzaJug{
    
   
     /**  
  *Método constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    public KingBlan(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}
/**
*Metodo que muestra una representación del objeto como Strings
*@author Alcántara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
 public String toString(){

	return "k";

    }
    //
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
     if(((w-x)==1)||((x-w)==1)||((z-y)==1)||((y-z)==1)){
	    
	 }else{
	     g=false;
	 }
	 return g;
	 }
//
    }
