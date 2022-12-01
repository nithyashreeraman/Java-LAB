public class elements {
   < E > void printArray( E[] inputArray ) {
      // Display array elements
      for(E element : inputArray) {
         //System.out.printf("%s ", element);
         System.out.print(element + " ");
      }
      System.out.println();
   }
   void show(){
       System.out.println("Hello....");
   }
   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
      elements obj = new elements();
      System.out.println("Array integerArray contains:");
      obj.printArray(intArray);   // pass an Integer array

 

      System.out.println("\nArray doubleArray contains:");
      obj.printArray(doubleArray);   // pass a Double array

 

      System.out.println("\nArray characterArray contains:");
      obj.printArray(charArray);   // pass a Character array
   }
}