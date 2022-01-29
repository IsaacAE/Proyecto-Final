public class KingBlan extends PzaJug{
    
    int fila, columa;
    boolean color;
    String tipo;
    
    public KingBlan(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}

 public String toString(){

	return "k";

    }
    //
    public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean g=true;
     if(((x==w)&&(((y-1)==z)||((y+1)==z)))||((y==z)&&(((x-1)==w) ||((x+1)==w)))){
	    
	 }else{
	     g=false;
	 }
	 return g;
	 }
//
    }
