import java.util.ArrayList;
public class Mode
{
    public int computeMode(ArrayList<Integer> listOfNumbers)
    {
        //ArrayList<Double> modes = new ArrayList<>();
        
        int value = 1;
        int maxValue = 1;
        //int curNum = listOfNumbers.get(0);
        int mode = listOfNumbers.get(0);
        
        
        for (int i = 0; i < listOfNumbers.size(); i++)
        {   
            //int value = 1;
            for (int j = i + 1; j < listOfNumbers.size(); j++)
            {
                if (listOfNumbers.get(i) == listOfNumbers.get(j))
                {
                    value++;
                }
            }
        
            if (value > maxValue)
            {
                maxValue = value;
                listOfNumbers.get(i);
            }
            else
            {
                listOfNumbers.add(listOfNumbers.get(i));
            }
        }
        return mode;
    }
    
    
    
    public static void main(String[] args)
    {
        Mode tester = new Mode();
        
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        
        //for (int i = 0; i < 10; i++)
        //{
        //  listOfNumbers.add(i);
        //}
        listOfNumbers.add(10);
        listOfNumbers.add(15);
        listOfNumbers.add(3);
        listOfNumbers.add(49);
        listOfNumbers.add(15);
        System.out.println(listOfNumbers);
        System.out.println("Mode: " +tester.computeMode(listOfNumbers));
    }
}