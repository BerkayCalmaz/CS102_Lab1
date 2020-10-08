/**
 * A simple Java class!
 */
import java.util.Arrays;
public class IntBag 
{
   // properties
   private int[] bag;
   
   // constructors
   public IntBag(){
      bag = new int[4];
      bag[0] = -1;
   }
   
   public void add( int add ){
      if( bag[bag.length - 1] == -1 ){
         int[] bagReplace;
         bagReplace = Arrays.copyOf(bag, 2 * bag.length);
         bag = bagReplace;
      }
      for( int i = 0; i < bag.length - 1; i++ ){
         if( bag[i] == -1){
            bag[i] = add;
            bag[i+1] = -1;
            i = bag.length;
         }
      }
   }
   
   public int addIntTo( int add, int index ){
      int iIndex = this.arraySize(); //Just to prevent initializing problems.
      if( bag[bag.length-1] == -1 ){ //If the array is full, double it.
         int[] bagReplace;
         bagReplace = Arrays.copyOf(bag, 2 * bag.length);
         bag = bagReplace;
      }
      if( iIndex <= index ){ //Setting the rules for index.
         return -1; //Means that the num is not added.
      }
      else{
         for(int i = iIndex; i > index -1; i--){
            bag[i+1] = bag[i];
         }
         bag[index] = add;
         return 1;//Means that the num is added.
      }
   }
   
   public void remove( int index ){
      int iIndex = this.arraySize();
      bag[index] = bag[iIndex-1]; 
   }
   
   public boolean check( int num ){
      boolean returnValue = false;
      for(int i = 0; i< this.arraySize(); i++ ){
         if( bag[i] == num ){
            returnValue = true;  
         }
      }
      return returnValue;
   }
   
   public int arraySize(){
      int iIndex = 0;
      for( int i = 0; i < bag.length; i++){//finding the index of i.
         if( bag[i] == -1 ){
            iIndex = i;
            i = bag.length;
         }
      }
      return iIndex;
   }
   
   public int get( int index ){
    return ( bag[index] );  
   }
   
   public String toString(){
      String returner = "";
      for ( int i = 0; i < this.arraySize(); i++ ){
         returner = returner + " " + bag[i];  
      }
      return returner;
   }
   
   public void removeAll( int remove){
      int[] removeBag = new int[ bag.length ];
      int counter = 0;
      for( int i = 0; i <=  this.arraySize(); i++ ){
         if( remove != bag[i] ){
          removeBag[i - counter] = bag[i];  
         }
         else{
          counter++;  
         }
      }
      bag = removeBag;
   }
}