



import java.util.Arrays;
import java.util.Scanner;






public class Solution
{
    public static void main(String[] args)
    {

    // 4. Fes la suma de dos arrays posició a posició. Això significa que has d'introduir dos arrays d'igual tamany i en un tercer hi has de posar la suma element a element.
    Scanner sc = new Scanner(System.in);

        System.out.println("De cuantos números quieres que sea el array?");
        int x=sc.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
        int suma[]=new int[x];

        for (int i=0; i<x; i++)
        {
            System.out.print("a[" + i + "] = ");
            a[i]=sc.nextInt();
            System.out.println();

            System.out.print("b[" + i + "] = ");
            b[i]=sc.nextInt();
            System.out.println();
        }

        for (int i=0; i<x; i++)
        {
            suma[i]=a[i]+b[i];
            System.out.println("suma[" + i + "] = " + suma[i]);
        }


    }
}
