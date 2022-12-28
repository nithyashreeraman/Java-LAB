import java.util.Scanner;
public class table_booking {
     public static void main(String arg[]){
   Scanner scan=new Scanner(System.in);  
   int table[],i,j,n,ch;
   table=new int[10];
   int k ;
   System.out.println("Enter the no of customers {max 10} ");
   n=scan.nextInt();
   System.out.println("Enter the table choice");
   for(i=0;i<n;i++)
   {
       table[i]=scan.nextInt();
   }
   for(i=0;i<n;i++)
   {
       ch=table[i];
       if((ch>0) && (ch<11))
       {
           j=0;
           while(j<i)
               if(ch==table[j])
               {
                   ch++;
                   j=0;
               }
               else j++;
          table[i]=ch;
       }
       else
       {
           for(k=1;k<=10;k++)
           {
               for(j=0;j<n;j++)
                   if(table[j]==k)
                       break;
               
               if(j==n)
                   break;
       
       }
   
   if(k<=10)
       table[i]=k;
   else
       System.out.println("No table available");
   }
   }
     for(i=0;i<n;i++)
     System.out.print(table[i] + " ");
     }
}
