public class PeonNeg extends PzaJug{
    
    int fila, columa;
    boolean color;
    String topo;
    
    public PeonNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	}
 public String toString(){

	return "P";

    }
    
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
