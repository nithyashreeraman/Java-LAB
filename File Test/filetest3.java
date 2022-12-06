import java.io.*;
public class filetest3{
public static void main(String args[]) {
try {
//input file
FileInputStream sourceFile=new FileInputStream(args[0]);
//output file
FileOutputStream targetFile=new FileOutputStream(args[1]);
// Copy each byte from the input to output
int byteValue;
//read byte from first file and write it into second line
while((byteValue = sourceFile.read()) != -1)
{
System.out.print((char)byteValue);
targetFile.write(byteValue);
}
// Close the files!!!
sourceFile.close();
targetFile.close();
System.out.println("\nFile copied successfully");
}
// If something went wrong, report it!
catch(IOException e) {
System.out.println("Exception: " + e.toString());
}
}
}