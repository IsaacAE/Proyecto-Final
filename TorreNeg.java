public class TorreNeg extends PzaJug{
    
    int fila, columa;
    boolean color;
    String tipo;
    public TorreNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}

 public String toString(){

	return "T";

    }
public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean valor=true;

	     
	 	int i;
		    PzaJug aux = new PzaJug(0,0,true,"aux");
		    //MOVER DERECHA
	if(x==w){
	    if(y<z){
		for(i = (y+1); i<z; i++){
	
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		
		}else{

		    	for( i = z+1; i<y; i++){
		  
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		}
	    }

	}//
	
	 if(y==z){
	//MOVER ABAJO
	       if(x<w){
		for( i = (x+1); i<w; i++){
	        
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		}else if(x>w){

		    	for( i = (x-1); i>w; i--){
		 
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		
			}


	}
	}
   
	if((x!=w)&&(y!=z)){
	    valor = false;
	}
	return valor;
    }

	 
	 }
    
