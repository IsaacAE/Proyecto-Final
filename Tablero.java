import java.util.Scanner;


public class Tablero{
    
    public static void mover(PzaJug tablero[][], int x, int y, int w, int z){
	int g;
	PzaJug mov = new PzaJug(0,0,"mov");
	PzaJug mov2 = new PzaJug(0,0,"mov");
     
	Vacia vac = new Vacia(0,0,"mov");

   
   
    mov = tablero[x][y];
    tablero[x][y] = vac;
    tablero[w][z]= mov;
    
    
    
}

    public static void main(String[] args){

	int x1,y1,z,w;
	
	Scanner escaner = new Scanner(System.in);

        Vacia a = new Vacia(0,0,"vac");
        Vacia b = new Vacia(0,0,"vac");
	Vacia c = new Vacia(0,0,"vac");
	Vacia d = new Vacia(0,0,"vac");
	Vacia e = new Vacia(0,0,"vac");
	Vacia f = new Vacia(0,0,"vac");

        Vacia a1 = new Vacia(0,0,"vac");
        Vacia b1 = new Vacia(0,0,"vac");
	Vacia c1 = new Vacia(0,0,"vac");
	Vacia d1 = new Vacia(0,0,"vac");
	Vacia e1 = new Vacia(0,0,"vac");
	Vacia f1 = new Vacia(0,0,"vac");


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

	for (int x=0; x < tablero.length; x++) 
 {
    for (int y=0; y < tablero[x].length; y++) 
    {

     System.out.print(" ");System.out.print (tablero[x][y]);

    }
  System.out.println();

 }
	System.out.println("Dame la fila de la pieza que vas a mover");

    x1 = escaner.nextInt();
    
    System.out.println("Dame la columa de la pieza que vas a mover");
    y1 = escaner.nextInt();

     System.out.println("Dame la fila a donde vas a mover la pieza");
     w = escaner.nextInt();
    
    System.out.println("Dame la columa a donde vas a mover la pieza");
    z = escaner.nextInt();

    PzaJug temp = new PzaJug(0,0,"temp");
    temp = tablero[x1][y1];
    int g=1;
     g = temp.getFila();

     switch(temp.getTipo()){

    case "peon":

	if((y1-z)==0){
	System.out.println("HOLA");

	switch(temp.getColor()){

		case true:
		    System.out.println("ES BLANCA");
		    break;


	    }
	}else{
	    	System.out.println("MOVIMIENTO INVÁLIDO");
	}
	
	break;
    }
    mover(tablero,x1,y1,w,z);

    	for (int x=0; x < tablero.length; x++) 
 {
    for (int y=0; y < tablero[x].length; y++) 
    {

     System.out.print(" ");System.out.print (tablero[x][y]);

    }
  System.out.println();

 }

	

    }

  

     
    



}
