import java.util.Scanner;
public class L2Q6 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's Age: ");
        int amar_a = input.nextInt();
        System.out.print("Enter Amar's Height: ");
        int amar_h = input.nextInt();
        System.out.print("Enter Akbar's Age: ");
        int akbar_a = input.nextInt();
        System.out.print("Enter Akbar's Height: ");
        int akbar_h = input.nextInt();
        System.out.print("Enter Anthony's Age: ");
        int anthony_a= input.nextInt();
        System.out.print("Enter Anthony's Height: ");
        int anthony_h = input.nextInt();
        if(amar_a<akbar_a && amar_a<anthony_a)
            System.out.println("Youngest is Amar ");
        else if(akbar_a<amar_a && akbar_a<anthony_a)
            System.out.println("Youngest is Akbar");
        else
            System.out.println("Youngest is Anthony");
        if(amar_h>akbar_h && amar_h>anthony_h)
            System.out.println("Amar is Tallest"); 
        else if(akbar_h>amar_h && akbar_h>anthony_h)
            System.out.println("Akbar is Tallest");
        else
            System.out.println("Anthony is Tallest");
    }
}
