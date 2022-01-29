
//Importaciones para uso del programa
import java.util.Scanner;
import java.util.InputMismatchException;

/**
*Clase que simula un tablero de ajedrez
*@author Alcantara Estrada Kevin Isaac
*@version 23.0
*/
public class Tablero{
    /**
*Metodo que mueve una pieza de un sitio a otro
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param tablero[][] Arreglo de dos dimensiones de objetos de la clase PzaJug donde se trabajara
*@param x valor de la fila actual de la pieza
*@param y valor actual de la columna de la pieza
*@param w valor de la fila a la que se quiere mover la pieza
*@param valor de la columna a la cual se quiere mover la pieza
*/
    public static void mover(PzaJug tablero[][], int x, int y, int w, int z){
	int g;
	PzaJug mov = new PzaJug(0,0,true,"vac");
	PzaJug mov2 = new PzaJug(0,0,true,"vac");
     
	Vacia vac = new Vacia(0,0,true,"vac");

   
   
    mov = tablero[x][y];
    tablero[x][y] = vac;
    tablero[w][z]= mov;  
}
 /**
*Metodo que imprime un arreglo de dos diemsiones (tablero)
*@author Alcantara Estrada Kevin Isaac
*@version 1.0
*@param tablero[][] Arreglo de dos dimensiones de objetos de la clase PzaJug con el que se trabajara
*@param filas Numero de filas del tablero
*@param columnas Numero de columnas del tablero
*/
    public static void imprimir_tablero(PzaJug tablero[][],int filas, int columnas){
	for ( filas=0; filas < tablero.length; filas++){
    for ( columnas=0; columnas < tablero[filas].length; columnas++) {

     System.out.print(" ");System.out.print (tablero[filas][columnas]);

    } System.out.print("  "+filas);
  System.out.println();

 }
	System.out.print("\n");
	for(int j = 0; j<6; j++){
	    System.out.print(" "+j);
	}

    }


    /**
*Metodo main para ejecutar el programa
*@author Alcantara Estrada Kevin Isaac
*@version 7.0
*@param String[] args
*/

    public static void main(String[] args){
	//Principales variables a utilizar
	int x1=0,y1=0,z=0,w=0,contador=4, resp=0, partido=0;
	boolean coco=false,juego=true, turnos; 
	
	//Escaner para recibir datos del usuario
	Scanner escaner = new Scanner(System.in);
	 
	 
	PzaJug temp = new PzaJug(0,0,true,"vac");
	
	//COLOCACION DE LAS PIEZAS
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

//Seleccion de numero de turnos a jugar
	 do{
		turnos=false;
		System.out.println("Dime, ¿de cuántos turnos deseas que sea tu partida?\n1.20 TURNOS\n2.40 TURNOS\n3.100 TURNOS");
		 try{
		
		partido=escaner.nextInt();
		    }catch(InputMismatchException et){
		
		     turnos=true;
		     escaner.next();
		 }
	    if((partido<1)||(partido>3)){
		turnos=true;
	    }
	    }while(turnos);

	    switch(partido){

	    case 1: contador=20;
		break;

	    case 2: contador=40;
		break;

	    case 3:
		contador =100;
		break;
	    }
	    
	    //Comienza el juego
	while(juego==true){
	while(contador!=0){
  System.out.println("\n \n");
	    if(contador%2==0){

		 System.out.println("\nJUEGAN BLANCAS\n");
	    }else{
		System.out.println("\nJUEGAN NEGRAS \n");

	    }

	    System.out.println("Turnos restantes: " + contador+"\n");
	    imprimir_tablero(tablero,5,5);

	    
	//Se solicitan coordenadas de las piezas al usuario
	do{ 
	try{
	    coco=true;
	   
	System.out.println("\nDame la fila de la pieza que vas a mover");

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
	
    
    
	/*Siempre se ejecuta*/
	
	//Verificacion de piezas elegidas
if((temp.getTipo()=="vac")||((x1==w)&&(y1==z))){
	 System.out.println("\n¿Eres bobo?, pierdes un turno por listillo \n");
	 contador--;
	 //break;
	 

	   }else if((contador%2==0)&&(temp.getColor()==false)){
    System.out.println("TRAMPOSO,PIERDES TURNO");
    contador--;
    //break;
      }else if((contador%2!=0)&&(temp.getColor()==true)){
     System.out.println("TRAMPOSO, PIERDES TURNO");
    contador--;
    //break;
    }else{
    PzaJug  ojo = new PeonBlan(0,0,true,"vac");
		
		//Se solicita al usario que desea hacer
		ojo = tablero[w][z];
		boolean bobo;
		do{
		    bobo=false;
		    try{
		System.out.println("\n¿Qué deseas hacer?\n1.Mover\n2.Comer\n3.Salir del juego\n");
		resp=escaner.nextInt();
		    }catch(InputMismatchException et){
        System.out.println("\nBuen intento, ahora elige bien");
	    bobo=true;
	   
	     
	     
     escaner.next();
    
    
		    }
		}while(bobo==true);
		switch(resp){
	//La pieza se mueve
		        case 1:
			    if(ojo.getTipo()!="vac"){
				if(ojo.getColor()==temp.getColor()){

				    System.out.println("Estas intentando mover tu pieza a un lugar ocupado, es movimiento ilegal, pierdes un turno");
			contador--;
				//
			

				}else if(temp.getTipo()!="peon"){
				    System.out.println("Parece que intentas comer una pieza, intenta de nuevo");
				    //contador++;
				}else{
				    System.out.println("Es movimiento ilegal, pierdes un turno");
				    contador--;
				}

			    }else if(temp.move(tablero,x1,y1,w,z)==true){

				mover(tablero,x1,y1,w,z);
				contador--;
			    }else{
				System.out.println("\n¿Todo bien en casa?, pierdes un turno. \n");
				contador--;
	

			    }
			    break;
	//La pieza come otra pieza
		case 2:

		    if(ojo.getTipo()=="vac"){
		    System.out.println("Me parece que más bien quieres mover tu pieza, intenta de nuevo");
		    contador++;
		    }else if(ojo.getColor()==temp.getColor()){
			System.out.println("\nNo puedes comer tus propias piezas, pierdes un turno");
			contador--;
			break;
		    }else if(temp.getTipo()=="peon"){
			if(((x1+1)==w)||((x1-1)==w)&&(((y1+1)==z)||((y1-1)==z))){
			    
			    mover(tablero,x1,y1,w,z);
			    
			}
		    }else if(temp.move(tablero,x1,y1,w,z)==true){

			mover(tablero,x1,y1,w,z);
		    }else{
	     

		    }       contador--;
		    break;
	//Salir del juego
		case 3:
		    contador = -100;
		    juego = false;
		    System.out.println("Vale, hasta luegoooo");
		    return;
		    
		    
		default:
		   
		    System.out.println("\nAhhhh, chistosito, anda, elige bien");
		    
		    break;
		   
		}

   
}

         	
	

		

		

	/*Siempre se ejecuta*/
	   
	//Se pregunta si alguno perdio
		int peonB=0, peonN=0, kingN=0, kingB=0, kuinB=0, kuinN=0, torreB=0, torreN=0, caballoN=0, caballoB=0;
		for( int k = 0; k < tablero.length; k++){

		    for( int h = 0; h< tablero[k].length; h++){
			if(tablero[k][h] instanceof PeonBlan){
			    peonB++;
			    
			}
			if(tablero[k][h] instanceof PeonNeg){
			    peonN++;
			    
			}
			//CABALLOS
				if(tablero[k][h] instanceof CabaBlan){
			    caballoB++;
			    
			}
			if(tablero[k][h] instanceof CabaNeg){
			    caballoN++;
			    
			}

				//TORRES
				if(tablero[k][h] instanceof TorreBlan){
			    torreB++;
			    
			}
			if(tablero[k][h] instanceof TorreNeg){
			    torreN++;
			    
			}

				//REYES
				if(tablero[k][h] instanceof KingBlan){
			    kingB++;
			    
			}
			if(tablero[k][h] instanceof KingNeg){
			    kingN++;
			    
			}

				//REINAS
				if(tablero[k][h] instanceof QueenBlan){
			    kuinB++;
			    
			}
			if(tablero[k][h] instanceof QueenNeg){
			    kuinN++;
			    
			}
			//FIN DE REVISIÓN
		    }
		}
	//Pierde negro
		if(peonB==0||torreB==0||caballoB==0||kingB==0||kuinB==0){
		    System.out.println("NEGRAS GANAN / BLANCAS PIERDEN");
		    return;
		}
	//Pierde blancas
			if(peonN==0||torreN==0||caballoN==0||kingN==0||kuinN==0){
		    System.out.println("NEGRAS PIERDEN / BLANCAS GANA");
		    return;
		}
	
	}
	     contador--;
	    	
		if(contador <= 0 ){
	    juego = false;
		}
	   
	}


	//Eleccion de ganador si se acaban los turnos
	        int winner = (int)(Math.random()*100);

		if(winner<=50){
		    	System.out.println("\nEl juego ha acabado por turnos, el ganador es: BLANCAS");
		}else{
			
		
		    System.out.println("\n El juego ha acabado por turnos, el ganador es: NEGRAS");
		}   

		
	
	
	}
//FIN DEL PROGRAMA	
}
	//FIN DE LA CLASE


