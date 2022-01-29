import java.util.Scanner;
import java.util.InputMismatchException;


public class Tablero{
    
    public static void mover(PzaJug tablero[][], int x, int y, int w, int z){
	int g;
	PzaJug mov = new PzaJug(0,0,true,"vac");
	PzaJug mov2 = new PzaJug(0,0,true,"vac");
     
	Vacia vac = new Vacia(0,0,true,"vac");

   
   
    mov = tablero[x][y];
    tablero[x][y] = vac;
    tablero[w][z]= mov;  
}

    public static void imprimir_tablero(PzaJug tablero[][],int filas, int columnas){
	for ( filas=0; filas < tablero.length; filas++){
    for ( columnas=0; columnas < tablero[filas].length; columnas++) {

     System.out.print(" ");System.out.print (tablero[filas][columnas]);

    }
  System.out.println();

 }

    }


    public static boolean verificar(PzaJug tablero[][], int x, int y, int w, int z){
	int i;
	boolean valor=true;
		    PzaJug aux = new PzaJug(0,0,true,"vac");
	if(x==w){
	    if(y<z){
		for( i = y+1; i<=z; i++){
	
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		
		}else{

		    	for( i = z+1; i<=y; i++){
		  
		    aux = tablero[x][i];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		}
	    }

	}else if(y==z){

	       if(x<w){
		for( i = x+1; i<=w; i++){
	        
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		    
		}
		}
	}else{

		    	for( i = w+1; i<=x; i++){
		 
		    aux = tablero[i][y];
		    if(aux.getTipo()!="vac"){
			valor = false;
		    }
		
			}


	}
   
	if((x!=w)&&(y!=z)){
	    valor = false;
	}
	return valor;
    }


    public static void main(String[] args){

	int x1=0,y1=0,z=0,w=0,contador=4, resp=0;
	boolean coco=false,juego=true; 
	Scanner escaner = new Scanner(System.in);
	 PzaJug temp = new PzaJug(0,0,true,"vac");

        Vacia a = new Vacia(0,0,true,"vac");
        Vacia b = new Vacia(0,0,true,"vac");
	Vacia c = new Vacia(0,0,true,"vac");
	Vacia d = new Vacia(0,0,true,"vac");
	Vacia e = new Vacia(0,0,true,"vac");
	Vacia f = new Vacia(0,0,true,"vac");
	Vacia extra = new Vacia(0,0,true,"vac");

        Vacia a1 = new Vacia(0,0,true,"vac");
        Vacia b1 = new Vacia(0,0,true,"vac");
	Vacia c1 = new Vacia(0,0,true,"vac");
	Vacia d1 = new Vacia(0,0,true,"vac");
	Vacia e1 = new Vacia(0,0,true,"vac");
	Vacia f1 = new Vacia(0,0,true,"vac");


	KingNeg reyn = new KingNeg(0, 2, false, "rey");
	QueenNeg queenN = new QueenNeg(0, 3, false, "reina");
	TorreNeg torreNeg1 = new TorreNeg(0,0,false,"torre");
	TorreNeg torreNeg2 = new TorreNeg(0,5,false,"torre");
	CabaNeg cabaNeg1 = new CabaNeg(0,1,false,"caba");
	CabaNeg cabaNeg2 = new CabaNeg(0,4,false,"caba");
	PeonNeg peonNeg1 = new PeonNeg(1,0,false,"peon");
	PeonNeg peonNeg2 = new PeonNeg(1,1,false,"peon");
	PeonNeg peonNeg3 = new PeonNeg(1,2,false,"peon");
	PeonNeg peonNeg4 = new PeonNeg(1,3,false,"peon");
	PeonNeg peonNeg5 = new PeonNeg(1,4,false,"peon");
	PeonNeg peonNeg6 = new PeonNeg(1,5,false,"peon");

	

	KingBlan reyb = new KingBlan(5, 2, true,"rey");
	QueenBlan queenB = new QueenBlan(5, 3, true,"reina");
       	TorreBlan torreBlan1 = new TorreBlan(5,0,true,"torre");
	TorreBlan torreBlan2 = new TorreBlan(5,5,true,"torre");
	CabaBlan cabaBlan1 = new CabaBlan(5,1,true,"caba");
	CabaBlan cabaBlan2 = new CabaBlan(4,4,true,"caba");
	PeonBlan  peonBlan1 = new PeonBlan(4,0,true,"peon");
	PeonBlan  peonBlan2 = new PeonBlan(4,1,true,"peon");
	PeonBlan  peonBlan3 = new PeonBlan(4,2,true,"peon");
	PeonBlan  peonBlan4 = new PeonBlan(4,3,true,"peon");
	PeonBlan  peonBlan5 = new PeonBlan(4,4,true,"peon");
	PeonBlan  peonBlan6 = new PeonBlan(4,5,true,"peon");
	
	PzaJug tablero[][] = new PzaJug[6][6];

	tablero[2][0]= a;
       	tablero[2][1]= b;
      	tablero[2][2]= c;
       	tablero[2][3]= d;
       	tablero[2][4]= e;
      	tablero[2][5]= f;

	tablero[0][0] = torreNeg1;
	tablero[0][5] = torreNeg2;
	tablero[0][1] = cabaNeg1;
	tablero[0][4] = cabaNeg2;
	tablero[0][2] = reyn;
	tablero[0][3] = queenN;
       	tablero[1][0] = peonNeg1;
	//	tablero[1][0] = extra;
	tablero[1][1] = peonNeg2;
        tablero[1][2] = peonNeg3;
	tablero[1][3] = peonNeg4;
	tablero[1][4] = peonNeg5;
	tablero[1][5] = peonNeg6;

	tablero[5][1] = cabaBlan1;
	tablero[5][4] = cabaBlan2;
	tablero[5][0] = torreBlan1;
	tablero[5][5] = torreBlan2;
	tablero[5][2] = reyb;
	tablero[5][3] = queenB;
	tablero[4][0] = peonBlan1;
	tablero[4][1] = peonBlan2;
        tablero[4][2] = peonBlan3;
	tablero[4][3] = peonBlan4;
	tablero[4][4] = peonBlan5;
	tablero[4][5] = peonBlan6;

	tablero[3][0]= a1;
       	tablero[3][1]= b1;
      	tablero[3][2]= c1;
       	tablero[3][3]= d1;
       	tablero[3][4]= e1;
      	tablero[3][5]= f1;
	
	while(juego==true){
	    /* System.out.println(contador);
	    if(contador == 0){
		juego=false;
		break;
		}*/
	    
	while(contador!=0){
  System.out.println("\n \n");
	    if(contador%2==0){

		 System.out.println("JUEGAN BLANCAS\n");
	    }else{
		System.out.println("JUEGAN NEGRAS \n");

	    }

	    System.out.println(contador);
	    imprimir_tablero(tablero,5,5);

	    
	
	do{ 
	try{
	    coco=true;
	   
	System.out.println("Dame la fila de la pieza que vas a mover");

    x1 = escaner.nextInt();
    
    System.out.println("Dame la columa de la pieza que vas a mover");
    y1 = escaner.nextInt();

     System.out.println("Dame la fila a donde vas a mover la pieza");
     w = escaner.nextInt();
    
    System.out.println("Dame la columa a donde vas a mover la pieza");
    z = escaner.nextInt();


	
    
   
    temp = tablero[x1][y1];
    	}catch(InputMismatchException ez){
        System.out.println("\n¿Al menos sabes jugar?, intenta de nuevo");
	    coco=false;
	   
	     imprimir_tablero(tablero,5,5);
	     
     escaner.next();
    
    
            }catch(ArrayIndexOutOfBoundsException ex){

	    System.out.println("Tantito coco, por favor, intenta de nuevo");

	    coco=false;
	     imprimir_tablero(tablero,5,5);
	}
	}while(coco==false);

	//CIERRE DE PRIMER ATRAPA INGENUOS
	
    
    
     if((contador%2==0)&&(temp.getColor()==true)){
	
      }else if((contador%2!=0)&&(temp.getColor()==false)){

      }else{

	  System.out.println("\nPierdes un turno por tramposo");
	  contador--;
	  break;
     }

	   if((temp.getTipo()=="vac")||((x1==w)&&(y1==z))){
	 System.out.println("\n¿Eres bobo?, pierdes un turno por listillo \n");
	 System.out.println(contador);
	 contador--;
	 //break;
	 

	   }

     
     	PzaJug  ojo = new PeonBlan(0,0,true,"vac");
	ojo = tablero[w][z];

	 System.out.println("\n¿Qué deseas hacer?\n1.Mover\n2.Comer\n3.Salir del juego\n");
	    resp=escaner.nextInt();

	    switch(resp){

	    case 1:
		if(ojo.getTipo()!="vac"){
		    if(ojo.getColor()==temp.getColor()){

			System.out.println("Estas intentando mover tu pieza a un lugar ocupado, es movimiento ilegal, pierdes un turno");
			//contador--;
				//
			

		    }else if(temp.getTipo()!="peon"){
			System.out.println("Parece que intentas comer una pieza, intenta de nuevo");
			contador++;
		    }else{
				System.out.println("Es movimiento ilegal, pierdes un turno");
		    }

		}else if(temp.move(tablero,x1,y1,w,z)==true){

	    mover(tablero,x1,y1,w,z);
	}else{
	     System.out.println("\n¿Todo bien en casa?, pierdes un turno. \n");
	     //contador-1;
	

		}
		 break;

	    case 2:

		if(ojo.getTipo()=="vac"){
		    System.out.println("Me parece que más bien quieres mover tu pieza, intenta de nuevo");
		    contador++;
		}else if(ojo.getColor()==temp.getColor()){
			System.out.println("No puedes comer tus propias piezas, pierdes un turno");
		    }else if(temp.getTipo()=="peon"){
			if(((x1+1)==w)||((x1-1)==w)&&(((y1+1)==z)||((y1-1)==z))){

			    mover(tablero,x1,y1,w,z);

			}
		}else if(temp.move(tablero,x1,y1,w,z)==true){

	    mover(tablero,x1,y1,w,z);
	}else{
	     

		}       contador--;
			break;

	    case 3:
		contador = -100;
		juego = false;
		break;

	    default:

		System.out.println("\n Ahhhh, chistosito, ahora por eso no juegas");
			contador = -100;
		juego = false;
		break;

	    }
	

		//break;

		
	    }
	     contador--;
	    	if(contador <= 0 ){
	    juego = false;
		}
	   
	}
		System.out.println("\nEl juego ha acabado por turnos, el ganador es:");
	
	}
	
}
	


