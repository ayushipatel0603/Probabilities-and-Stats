import java.util.Scanner;

/**
 * User enters a number and the program prints out the roman numeral the corresponds
 *
 * @author Erin Wolf
 * @version 11/2/2021
 */
public class RomanNum
{
    public static void main(String[] args)
    {   int numValue;
        Scanner num = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        numValue= num.nextInt();

        switch (numValue)
        {
            case 1:
                System.out.print("The Roman Numeral is: I");
                break;
            case 2:
                System.out.print("The Roman Numeral is: II");
                break;
            case 3:
                System.out.print("The Roman Numeral is: III");
                break;
            case 4:
                System.out.print("The Roman Numeral is: IV");
                break;
            case 5:
                System.out.print("The Roman Numeral is: V");
                break;
            case 6:
                System.out.print("The Roman Numeral is: VI");
                break;
            case 7:
                System.out.print("The Roman Numeral is: VII");
                break;
            case 8:
                System.out.print("The Roman Numeral is: VIII");
                break;
            case 9:
                System.out.print("The Roman Numeral is: IX");
                break;
            case 10:
                System.out.print("The Roman Numeral is: X");
                break;
            case 11:
                System.out.print("The Roman Numeral is: XI");
                break;
            default:
                System.out.print("The Number entered is out of range.");

        }

    }
}
