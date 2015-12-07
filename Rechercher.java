import java.util.Arrays;

public class Rechercher {

   public void recherche( Object[] table, Object val) {
	 
   Arrays.sort(table);

   int  n  =  table.length - 1 ;
   int compt=1;
   for (  int  i  =  0 ;  i <= n ;  i ++ ) {
    if(val== table[i]){
    	System.out.println("l' élément " +table[i]+" a été trouvé dans le tableau trié");
    	compt++;
    }
   }
   if(compt==1){
   System.out.println("l' élément n'a pas  été trouvé dans le tableau trié");
   }
  }   
}

