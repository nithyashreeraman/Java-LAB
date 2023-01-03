import java.io.*;
import java.util.Scanner;

public class stream1{
  public static void main(String[] args) throws IOException {
    
      File infilename = new File("abc.txt");
  Scanner scan=new Scanner(System.in);
  System.out.println("Type all student's registration number, to terminate type 'exit'");
FileWriter fw = new FileWriter(infilename);
    
    String fileContent;
    while(true){
    String input = scan.nextLine();
    
    if("exit".equalsIgnoreCase(input.trim())){
        break;
    }
    fw.write(input + "\n");
    
    }
    scan.close();
    fw.close();

     FileInputStream fstream = new FileInputStream(infilename);
     DataInputStream in = new DataInputStream(fstream);
     BufferedReader br = new BufferedReader(new InputStreamReader(in));
     String outfilename = "output.txt";


     PrintWriter p = new PrintWriter(outfilename);
      String strLine, filename;
      int status = 0;
      int i = 0;
           while ((strLine = br.readLine()) != null) {
                String temp = "";

               for (int k = 0; k < strLine.length(); k++) {
     char c;
     c = strLine.charAt(k);
     if (Character.isLowerCase(c))
     temp += Character.toUpperCase(c);
     else
      temp += c;
       }
      p.println(temp);
                        }
       in.close();
       p.close();
                

    
  }}
