import java.util.Scanner;
 
public class ShumezimiIMatricave
{
   public static void main(String args[])
   {
      int m1, n1, m2, n2, c, d, k;		
      int sum = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Jepni numrin e rreshtave dhe kolonave te matrices se pare: ");
      m1 = in.nextInt();		// numri i rreshtave te matrices se pare
      n1 = in.nextInt();		// numri i kolonave te matrices se pare
 
      int first[][] = new int[m1][n1];
 
      System.out.println("Jepni elementet e matrices se pare: ");
 
      for ( c = 0 ; c < m1 ; c++ )
         for ( d = 0 ; d < n1 ; d++ )
            first[c][d] = in.nextInt();		// matrica e pare
 
      System.out.println("Jepni numrin e rreshtave dhe kolonave te matrices se dyte:");
      m2 = in.nextInt();		//numri i rreshtave te matrices se dyte
      n2 = in.nextInt();		// numri i kolonave te matrices se dyte
 
      if ( n1 != m2 )
         System.out.println("Matricat me numer te rreshtave/kolonave te tille nuk mund te shumezohen");
      else
      {
         int second[][] = new int[m2][n2];
         int multiply[][] = new int[m1][n2];
 
         System.out.println("Jepni elementet e matrices se dyte");
 
         for ( c = 0 ; c < m2 ; c++ )
            for ( d = 0 ; d < n2 ; d++ )
               second[c][d] = in.nextInt();
 
         for ( c = 0 ; c < m1 ; c++ )
         {
            for ( d = 0 ; d < n2 ; d++ )
            {   
               for ( k = 0 ; k < m2 ; k++ )
               {
                  sum = sum + first[c][k]*second[k][d];
               }
 
               multiply[c][d] = sum;
               sum = 0;
            }
         }
 
         System.out.println("Produkti i matricave te dhena: ");
 
         for ( c = 0 ; c < m1 ; c++ )
         {
            for ( d = 0 ; d < n2 ; d++ )
               System.out.print(multiply[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
   }
}