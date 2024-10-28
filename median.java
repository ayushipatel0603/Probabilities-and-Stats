import java.util.ArrayList;
public class Median
{
    public double computeMedian(ArrayList<Integer> listOfNumbers)
    {
        int sum = 0;
        int size = listOfNumbers.size();
        System.out.println("Size: "+ size);
        if (size % 2 == 0)
        {
            return (listOfNumbers.get(size / 2 - 1) + listOfNumbers.get(size / 2)) / 2; //listOfNumbers.get(x) + listOfNumbers.get(y);
        }
        else
        {
            return listOfNumbers.get(size / 2);
        }

    }
    
    public static void main(String[] args)
    {
        Median tester = new Median();
        
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        
        //for (int i = 0; i < 10; i++)
        //{
        //  listOfNumbers.add(i);
        //}
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        //listOfNumbers.add(500);
        listOfNumbers.add(49);
        listOfNumbers.add(4);
        System.out.println(listOfNumbers);
        System.out.println("Median: " +tester.computeMedian(listOfNumbers));
    }
}