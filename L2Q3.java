import java.util.Scanner;
public class L2Q3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=6;i<10;i++)
        {
            System.out.println(""+n+"x"+i+"="+n*i);
        }
        input.close();
    }
}
