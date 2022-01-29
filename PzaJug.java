/**
*Clase que simula una pieza jugable. Extiende de la clase Pza.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*
*/

public class PzaJug extends Pza{

	//Atributos de la clase
    int fila, columna;
    boolean color;
    String tipo;
    /**
*Método constructor con parametros
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/
    public PzaJug(int fila, int columna, boolean color,String tipo){
	this.color = color;
	this.fila = fila;
	this.columna = columna;
	this.tipo = tipo;



    }
/**
*Método que obtiene el valor de la fila de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return int
*/
     public int getFila(){
	return this.fila;
    }
    /**
*Método que modificar el valor de la fila de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila
*/
      public void setFila(int fila){
	this.fila=fila;
    }

    /**
*Método que obtiene el valor del tipo de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
     public String getTipo(){
	return this.tipo;
    }
    /**
*Método que modificar el valor del tipo de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param tipo 
*/
     public void setTipo(String tipo){
	this.tipo=tipo;
    }
/**
*Método que obtiene el valor del color de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return boolean
*/
  public boolean getColor(){
	return this.color;
    }
    /**
*Método que modificar el valor del color de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param color
*/
     public void setColor(boolean color){
	 this.color=color;
    }


  /**
*Método que obtiene el valor de la columa de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return int
*/
      public int getColumna(){
	return this.columna;
    }

/**
*Método que modificar el valor de la columa de la pieza
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param columna 
*/
    public void setColumna(int columna){
	this.columna=columna;
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

	     g=false;
	 
	 return g;
	 }

      

}
