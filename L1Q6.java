import java.util.Scanner;
public class L1Q6 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);    
        System.out.print("Enter the Number: ");
        int n=input.nextInt();
        int count=0;
        int x=n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println(x+" has "+count+" digits");
        input.close();
    }
}
