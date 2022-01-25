public class Tablero{

    public static void main(String[] args){

       Vacia a = new Vacia();
        Vacia b = new Vacia();
	 Vacia c = new Vacia();
	  Vacia d = new Vacia();
	   Vacia e = new Vacia();
	    Vacia f = new Vacia();

        Vacia a1 = new Vacia();
        Vacia b1 = new Vacia();
	 Vacia c1 = new Vacia();
	  Vacia d1 = new Vacia();
	   Vacia e1 = new Vacia();
	    Vacia f1 = new Vacia();

	Pza tablero[][] = new Pza[6][6];

	tablero[2][0]= a;
       	tablero[2][1]= b;
      	tablero[2][2]= c;
       	tablero[2][3]= d;
       	tablero[2][4]= e;
      	tablero[2][5]= f;

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

    }






}
