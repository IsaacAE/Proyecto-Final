public class PeonBlan extends PzaJug{
    
    int fila, columa;
    boolean color;
    String tipo;
    
    public PeonBlan(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	
	}
	 public String toString(){

	return "p";

    }
    
     public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean g=true;
	
		if((y-z)==0){
	System.out.println("HOLA");
		        if((x-w)==1){

			    }else{g=false;}
	}else{
	    	g=false;
	}
    return g;
}


	
	

    




}
