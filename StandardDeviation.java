import java.util.ArrayList;
public class StandardDeviation
{
    public double computeStandardDeviation(ArrayList<Integer> listOfNumbers)
    {
        int sum = 0;
        
        for (int singleNumber: listOfNumbers)
        {
            sum = sum + singleNumber;
        }
        int mean = sum / listOfNumbers.size();
        
        double y = 0;
        double z = 0;
        for (double singleNumber: listOfNumbers)
        {
            y += Math.pow(singleNumber - mean, 2);
        }
        
        z = Math.sqrt(y/ listOfNumbers.size());
        
        return z;
    }
    
    public static void main(String[] args)
    {
        StandardDeviation tester = new StandardDeviation();
        
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
        System.out.println("Standard Deviation: " +tester.computeStandardDeviation(listOfNumbers));
    }
}