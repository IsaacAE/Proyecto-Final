public class QueenNeg extends PzaJug{
    
    int fila, columa;
    boolean color;
    String tipo;
    
    public QueenNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}

 public String toString(){

	return "Q";

    }
    
    public boolean move(PzaJug tablero[][], int x, int y, int w, int z){
	boolean g=true;
	int p,j,i=0;

	PzaJug aux = new PzaJug(0,0,true,"aux");
	PzaJug help = new PzaJug(0,0,true,"aux");

	if((x==w)||(y==z)){
	aux = tablero[x][y];
	if(x==w){
	    if(y<z){
		for( i = y+1; i<=z; i++){
	
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			g = false;
		    }
		    
		}
		
		}else{

		    	for( i = z+1; i<=y; i++){
		  
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			g = false;
		    }
		}
	    }

	}else if(y==z){

	       if(x<w){
		for( i = x+1; i<=w; i++){
	        
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			g = false;
		    }
		    
		}
		}
	}else{

		    	for( i = w+1; i<=x; i++){
		 
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			g= false;
		    }
		
		    }

	//DIAGONALES
	}

	}else if((x-w)==(z-y)){
	     p=x-1;
	     j=y+1;
	     while((p>w)){
		     aux = tablero[x-1][y+1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p--;
		     
	     }
	    
	}else if((x-w)==(y-z)){
	     p=x-1;
	     j=y-1;
	     while((p>w)){
		     aux = tablero[x-1][y-1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p--;
		     
	     }
	     //HACIA ABAJO DERECHA
	}else if((w-x)==(z-y)){
	     p=w+1;
	     j=y+1;
	     while((p<x)){
		     aux = tablero[w+1][y+1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p++;
		     
	     }
	     //HACIA ABAJO IZQUIERDA
	}else if((w-x)==(y-z)){
	     p=w+1;
	     j=y-1;
	     while((p<w)){
		     aux = tablero[w+1][y-1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p++;
		     
	     }
            }
	 
	    
	  
	 return g;
    }
    

    }
