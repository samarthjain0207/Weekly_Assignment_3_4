import java.util.Scanner;
public class L3Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int yr=input.nextInt();
        if((yr%4==0 && yr%100!=0 )|| yr%400==0 )
            System.out.println(yr+" is a Leap Year");
        else
            System.out.println(yr+" is NOT a Leap Year");
    }
}
