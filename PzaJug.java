public class PzaJug extends Pza{


    int fila, columna;
    String tipo;
    
    public PzaJug(int fila, int columna, String tipo){

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
