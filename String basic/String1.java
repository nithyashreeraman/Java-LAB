import java.util.Scanner;
class abc{
    public void print_hello(){
       System.out.println("Hello");
    }
    String name;
    public abc(String s){
        name=s;}
    @Override
    public String toString(){
        return ("This is " + name);
    }
}
public class String1 {
     public static void main(String arg[]){
         System.out.println("String1" + "String2");
         int a=100;
         System.out.println("String1" + a);
         int b=200;
         System.out.println(b + a);
         
         abc obj=new abc("Nith");
         System.out.println(obj);
         abc obj1=new abc("Ni");
         System.out.println(obj1);
     }
}
    

