import java.util.Scanner;
class cust{
String name;
int accno,bal;
}
class transaction{
int src_accno,dst_accno,amt;
}
public class transaction_correct {
public static void main(String arg[]){
Scanner scan = new Scanner(System.in);
int n1,n2,i,j;
System.out.print("Enter the number of customers:");
n1 = scan.nextInt();
cust c[] = new cust[n1];
for(i=0;i<n1;i++)
{
c[i] = new cust();
System.out.print("Enter cutomer details:");
c[i].name = scan.next();
c[i].accno = scan.nextInt();
c[i].bal = scan.nextInt();
}
System.out.print("Enter the number of transactions:");
n2 = scan.nextInt();
transaction t[] = new transaction[n2];
for(i=0;i<n2;i++){
t[i] = new transaction();
System.out.print("Enter transaction details:");
t[i].src_accno = scan.nextInt();
t[i].dst_accno = scan.nextInt();
t[i].amt = scan.nextInt();
int src=-1,dst=-1;
for(j=0;j<n1;j++)
if(t[i].src_accno==c[j].accno){
src=j;
break;
}
for(j=0;j<n1;j++)
if(t[i].dst_accno==c[j].accno){
dst=j;
break;
}
if((src<0)||(dst<0)||(c[src].bal<t[i].amt)){
System.out.println("This is inavlid transaction");
//i--;
}
else{
c[src].bal = c[src].bal - t[i].amt;
c[dst].bal = c[dst].bal + t[i].amt;
}
}
}
}