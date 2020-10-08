import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
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