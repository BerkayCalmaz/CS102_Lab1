import java.util.Scanner;

/**
 * Gives the fibonacci numbers
 * @author Berkay Çalmaz
 * @version 08.10.2020
 */ 
public class fibonacci
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      IntBag fib = new IntBag();
      fib.add(0);
      fib.add(1);
      for(int i = 2; i < 40; i++ ){
         fib.add( fib.get( i-1 ) + fib.get(i-2) );  
      }
//      System.out.println( fib.toString() );
      fib.add(1);
      System.out.println( fib.toString() );
   }
   
}