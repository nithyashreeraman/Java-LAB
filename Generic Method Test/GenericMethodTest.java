
public class GenericMethodTest {
   // generic method printArray
   public < E > 
   void printArray( E inputArray[] ) {
      // Display array elements
      for(E element : inputArray) {
         System.out.printf("%s ", element);
      }
      System.out.println();
   }

   public static void main(String args[]) {
      // Create arrays of Integer, Double and Character
      Integer[] intArray = { 1, 2, 3, 4, 5 };
      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
      GenericMethodTest obj = new GenericMethodTest();
      System.out.println("Array intArray contains:");
      obj.printArray(intArray);   // pass an Integer array

      System.out.println("\nArray doubleArray contains:");
      obj.printArray(doubleArray);   // pass a Double array

      System.out.println("\nArray charArray contains:");
      obj.printArray(charArray);   // pass a Character array
   }
}

