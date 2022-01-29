public class CabaNeg extends PzaJug{
    
    int fila, columa;
    boolean color;
    String tipo;
    
    public CabaNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}

 public String toString(){

	return "C";

    }
    
     public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean g=true;
	
		if((x-2)==w || (x+2)==w){
	     if((y+1)==z || (y-1)==z){
		 
	     }else{ g=false; }
	 }else{g=false; }
	 
    return g;
}

    }
