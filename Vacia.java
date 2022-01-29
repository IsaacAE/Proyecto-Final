/**
*Clase que asemeja una pieza vacia, como un espacio en el tablero. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/

public class Vacia extends PzaJug{
/**  
  *Metodo constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    public Vacia(int fila, int columna, boolean color, String tipo){

	super(fila,columna,color, tipo);

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
	boolean g=false;
	 
    return g;
}
}
