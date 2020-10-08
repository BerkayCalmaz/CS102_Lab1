import java.util.Scanner;

/**
 * __program description___ 
 * @author __your name___
 * @version __date__
 */ 
public class removeAllTest
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner( System.in );
      
      // constants
      
      // variables
      int input;
      IntBag bag = new IntBag();
      // program code
      do{
         System.out.println( "Choose by entering 1 to 7" );
         System.out.println( "1. Create a new empty collection(any previous values are lost!)" ); 
         System.out.println( "2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)" );
         System.out.println( "3. Print the collection of values.");
         System.out.println( "4. Add a value to the collection of values at a specified location" );
         System.out.println( "5. Remove the value at a specified location from the collection of values" );
         System.out.println( "6. Remove all instances of a value within the collection* (see note below)." );
         System.out.println( "7. Quit the program." );
         input = scan.nextInt();
         if( input == 1 ){
           bag = new IntBag();
         }
         
         else if( input == 2){
            int addInput; //SHOULD THIS BE HERE OR TOP
            System.out.println( "Enter your values. 0 to stop" );
            do{
               addInput = scan.nextInt();
               if( addInput < 0 ){ //Checking if the entered number is valid.
                  System.out.println( "Please enter positive values!" );  
               }
               else if( addInput > 0 ){//This is not "else" to not add 0 in the array.
                  bag.add( addInput ); 
               }
            }while( addInput != 0 ); //Continuing till the sentinel value comes.  
         }
         
         else if( input == 3 ){
            System.out.println( "Values in the array are: " + bag.toString() );  
         }
         
         else if( input == 4 ){
            int indexInput;
            int numInput;
            System.out.println( "Enter the integer" );
            numInput = scan.nextInt();
            System.out.println( "Enter the index" );
            indexInput = scan.nextInt();
            if( bag.addIntTo( numInput, indexInput ) == 1 ){ // checks if the addition is complete
               System.out.println( "Done!" );
            }
            else{
               System.out.println( "The integer should be added \"into\" the array, try again!" ); 
            }
         }
         else if( input == 5 ){
            int indexInput5;
            System.out.println( "Enter the index" );
            indexInput5 = scan.nextInt();
            bag.remove( indexInput5 );
            System.out.println( "Done!" );
         }
         
         else if( input == 6 ){
            int numInput6;
            System.out.println( "Enter number:" );
            numInput6 = scan.nextInt();
            bag.removeAll( numInput6 );
            System.out.println( "Done!" );
         }
         
         else if( input > 7 || input < 1 ){
            System.out.println( "Enter 7 to quit please!" );
         }
      }while( input != 7 );
   }
   
}