import java.util.Scanner;

public class permutation
{
    public static int factorial (int number)
    {
        int x = 1;
        for (int i = 2; i <= number; i++)
        {
            x = x * i;
        }
        return x;
    }

    public static int nPr (int n, int r)
    {
        int y = factorial(n)/(factorial(n-r));
        return y;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n: ");
        int n = scanner.nextInt();
        System.out.println("r: ");
        int r = scanner.nextInt();

        System.out.println("Permutation nPr: " + nPr(n,r));
        scanner.close();
    }
}