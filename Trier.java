import java.util.Arrays;

public class Trier {

   public void Tri( Object[] table) {
	 
  
   Arrays.sort(table);

   
   int  n  =  table.length - 1 ;
   for (  int  i  =  0 ;  i <= n ;  i ++ ) 
     System.out.print ( table[i] + " , ");
    System.out.println ();
  }

   
}

