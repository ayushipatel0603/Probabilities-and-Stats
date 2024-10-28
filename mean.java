
import java.util.ArrayList;
public class Mean
{
    public double computeMean(ArrayList<Integer> listOfNumbers)
    {
        int sum = 0;
        
        for (int singleNumber: listOfNumbers)
        {
            sum = sum + singleNumber;
        }
        
        return sum/ (double) listOfNumbers.size();
    }
    
    public static void main(String[] args)
    {
        Mean tester = new Mean();
        
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        
        //for (int i = 0; i < 10; i++)
        //{
        //  listOfNumbers.add(i);
        //}
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        listOfNumbers.add(3);
        listOfNumbers.add(49);
        System.out.println(listOfNumbers);
        System.out.println("Mean: " +tester.computeMean(listOfNumbers));
    }
}

