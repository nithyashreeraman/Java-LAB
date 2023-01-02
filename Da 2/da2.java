import java.util.Scanner;
class Customer{
    int accno;
    String name;
    float bal;
    public void id(int id)
    {
        accno=id;
    }
     public String getname()
    {
        return name;
    }
     
     public void balance(int b)
    {
        bal=b;
    }
    public void details()
    {
        Customer acc=new Customer();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter account id: ");
        acc.id(scan.nextInt());
        
        System.out.println("Enter the name: ");
        acc.getname();
        System.out.println("Enter the amount");
        acc.balance(scan.nextInt());
        
        
    }
    
    public float update(float ff)
    {
        bal=bal-ff;
        
        return bal;
    }

    

}

class Transaction{
    public int trans_details()
    {
        int sendid;
        int rid;
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter sender id: ");
        sendid=scan.nextInt();
        System.out.println("Enter receipent id:");
        rid=scan.nextInt();
        
        return rid;
    }
    
     public static float trans_amt()
    {
       
        Scanner scan=new Scanner(System.in);
        float w;
        do
        {
            System.out.println("Enter amount to be withdrawn:");
            w=scan.nextInt();
        }
        while(w<=0);
        return w;
    }
}
public class da2 {
    public static void main(String args[]) {
        System.out.println("Enter the number of Customers");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Customer c[] = new Customer[n];
        
         for (int i = 0; i < n; i++) {
            
            System.out.println("Enter customer details- "+(i+1));
            c[i].details();
         }
   int check,i;
   System.out.println("Enter no of transcation");
   int nt=scan.nextInt();
    Transaction t[]=new Transaction[nt];
     for (i = 0; i < nt; i++) {
        System.out.println("Enter Transaction details- ");
        check=t[i].trans_details();
     
        float final_amt;
        for (i = 0; i < nt; i++) {
            if(check==c[i].accno)
            {
                float aa=t[i].trans_amt();
               final_amt=c[i].update(aa);
               System.out.println("Transcation successful, balance amount " + final_amt);
                
            }
        }
        }
        
     
    }
     
}
