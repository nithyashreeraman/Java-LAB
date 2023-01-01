import java.io.*;
import java.util.*;
//import java.util.NoSuchElementsException;
//import movie;

class createfile {
private ObjectOutputStream output;
public void openFile(){
try
{    
 output=new ObjectOutputStream(
         new FileOutputStream("movie.txt"));  
 
}

catch(IOException e)
{
    //exception
}
}

public void add_details(){
    movie ob;
    String t;
     int sn;
    String s;
    int c;
    
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter movie details");
    while(scan.hasNext())
    {
        try{
            t=scan.nextLine();
    sn=scan.nextInt();
   s=scan.nextLine();
    c=scan.nextInt();
        ob=new movie(t,sn,s,c);
        output.writeObject(ob);
        }
     catch(IOException e)
     {
         //exception
     }
            System.out.println("Enter movie details"); 
    }
}
  public void closeFile(){
        try{
            if(output!=null)
                output.close();
            
        }
         catch(IOException e)
     {
         //exception
     }
    }
}

public class movie_createfile{
    public static void main(String args[]) {
        createfile m=new createfile();
        m.openFile();
        m.add_details();
        m.closeFile();
    }
}