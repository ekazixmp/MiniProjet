import java.util.Arrays;

public class Rechercher {

   public void recherche( Object[] table, Object val) {
	 
   Arrays.sort(table);

   int  n  =  table.length - 1 ;
   int compt=1;
   for (  int  i  =  0 ;  i <= n ;  i ++ ) {
    if(val== table[i]){
    	System.out.println("l' �l�ment " +table[i]+" a �t� trouv� dans le tableau tri�");
    	compt++;
    }
   }
   if(compt==1){
   System.out.println("l' �l�ment n'a pas  �t� trouv� dans le tableau tri�");
   }
  }   
}

