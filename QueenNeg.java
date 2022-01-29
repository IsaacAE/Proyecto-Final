/**
*Clase que emula una pieza de reina negra. Extiende de la clase PzaJug.
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*/

public class QueenNeg extends PzaJug{
    
    /**  
  *Metodo constructor con parametros. Extiende de la clase padre
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param fila Representa la fila de la pieza
*@param columna Representa la columa de la pieza
*@param color representa el color de la pieza
@param tipo Representa el tipo de pieza que es
*/  
    public QueenNeg(int fila, int columna, boolean color, String tipo){

	super(fila, columna, color, tipo);
	

	
	}
/**
*Representacion en cadena del objeto
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@return String
*/
 public String toString(){

	return "Q";

    }
    
     /**
*Metodo que sirve para saber si el movimiento de la pieza es válido o no
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
	int p,j,i=0;

	PzaJug aux = new PzaJug(0,0,true,"aux");
	PzaJug help = new PzaJug(0,0,true,"aux");

	if((x==w)||(y==z)){
	if(x==w){
	    if(y<z){
		for(i = (y+1); i<z; i++){
	
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			g = false;
		    }
		    
		}
		
		}else{

		    	for( i = z+1; i<y; i++){
		  
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			g = false;
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
			g = false;
		    }
		    
		}
		}else if(x>w){

		    	for( i = (x-1); i>w; i--){
		 
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			g = false;
		    }
		
			}


	}
	}

	}else if ((x-w)==(z-y)||(x-w)==(y-z)){
	
	
	 if((x-w)==(z-y)){
	     p=x-1;
	     j=y+1;
	     while((p>w)){
		     aux = tablero[p][y+1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p--;
		     
	     }
	    
	}else if((x-w)==(y-z)){
	     p=x-1;
	     j=y-1;
	     while((p>w)){
		     aux = tablero[p][y-1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p--;
		     
	     }
	     //HACIA ABAJO DERECHA
	}else if((w-x)==(z-y)){
	     p=w+1;
	     j=y+1;
	     while((p<x)){
		     aux = tablero[p][y+1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p++;
		     
	     }
	     //HACIA ABAJO IZQUIERDA
	}else if((w-x)==(y-z)){
	     p=x+1;
	     j=y-1;
	     while((p<w)){
		     aux = tablero[p][y-1];
		     if(aux.getTipo()=="vac"){
			 

		     }else{g=false;}

		     p++;
		     
	     }
            }
	 
	    }else{ g = false;}
	  
	 return g;
    }
    

    }
