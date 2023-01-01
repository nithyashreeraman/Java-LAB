import java.io.*;
class readfile
{
    private ObjectInputStream input;
    public void openFile(){
try
{    
 input=new ObjectInputStream(
         new FileInputStream("movie.txt"));  
 
}

catch(IOException e)
{
    //exception
}
}
    public void read_details() throws ClassNotFoundException 
    {
       movie ob;
       System.out.println("Title  Screen_no show  cost");
try
{
    while(true)
    {
        ob=(movie) input.readObject();
        
        System.out.println(ob.getTitle()+ "  " + ob.getScreen() + "  " + ob.getShow() +"  " +  ob.getCost());
    }
}
catch(IOException e)
{
    //exception
}

    }
    
    public void closeFile(){
        try{
            if(input!=null)
                input.close();
            
        }
         catch(IOException e)
     {
         //exception
     }
    }
}
public class movie_readfile {
    public static void main(String args[]) throws ClassNotFoundException {
        readfile r=new readfile();
        r.openFile();
      r.read_details();
       r.closeFile();
    }
}
