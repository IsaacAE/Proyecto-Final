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
    
     public String getTipo(){
	return this.tipo;
    }

  public boolean getColor(){
	return this.color;
    }

    public void setFila(int fila){
	this.fila=fila;
    }

      public int getColumna(){
	return this.columna;
    }


    public void setColumna(int fila){
	this.columna=columna;
    }


      

}
