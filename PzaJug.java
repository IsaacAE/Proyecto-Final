public class PzaJug extends Pza{


    int fila, columna;
    boolean color;
    String tipo;
    
    public PzaJug(int fila, int columna, boolean color,String tipo){
	this.color = color;
	this.fila = fila;
	this.columna = columna;
	this.tipo = tipo;



    }

    
     public int getFila(){
	return this.fila;
    }
    
      public void setFila(int fila){
	this.fila=fila;
    }

    
     public String getTipo(){
	return this.tipo;
    }
    
     public void setTipo(String tipo){
	this.tipo=tipo;
    }

  public boolean getColor(){
	return this.color;
    }
    
     public void setColor(boolean color){
	 this.color=color;
    }


  
      public int getColumna(){
	return this.columna;
    }


    public void setColumna(int columna){
	this.columna=columna;
    }


public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean g=true;

	     g=false;
	 
	 return g;
	 }

      

}
