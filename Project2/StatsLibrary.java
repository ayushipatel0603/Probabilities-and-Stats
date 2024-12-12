import java.util.ArrayList;

public class StatsLibrary 
{
    public int factorial(int number) 
    {
        int count = 1;
    for (int i = 1; i <= number; i++) 
    {
        count = count * i;
       }
       return count;
    }
    
    public int Combination(int n, int r)
    {
        // n!/(r!)(n-r)!
        int z = factorial(n)/(factorial(r) * factorial(n-r));;
        return z;
    }
    
    public double Binomial(int n, int y, double p)
    {
        //nCy
        int comb = Combination(n, y);
    //p^y
    double pPower = Math.pow(p,y);
    //(1-p)^(n-y)
    double qPower = Math.pow((1-p), (n-y));

    double B = ((double)comb * pPower * qPower);
    return B;
    }
    
    public double Geometric(double p, double y) 
    {
        double G = (Math.pow((1-p), (y-1))* p);
        return G;
    }
    
    public double NegativeBinomial( int y, int r, double p)
    {
        //(y-1)C(r-1)
        double comb = Combination(y-1, r-1);
        //p^r
        double pPower = Math.pow(p, r);
        //(1-p)^(y-r)
        double qPower = Math.pow((1-p), (y-r));
        
        double N = ((double)comb * pPower * qPower);
        return N;
    }
    
    
    public double Hypergeometric(int y, int r, int n, int N) 
    {
        //rCy
        double comb1 = Combination(r, y);
        
        //(N-r)C(n-y)
        double comb2 = Combination((N-r),(n-y));
        
        //NCn
        double comb3 = Combination(N,n);
        double H = (comb1 * comb2) / comb3;
        return H;
    }
    
    
    public double Poisson(int y, int lambda) 
    {
        double P = 0.0;
        
        // (lambda^y * e^(-lambda)) / y!
        double a = ( (Math.pow(lambda, y)) * (Math.pow(Math.E, ((-1)* lambda))) ) / (factorial(y));
        
        P = a;
        return P;
    }
    
    
    public String testall() 
    {
        System.out.println("Binomial Distribution: " + Binomial(10,9,0.3));
        System.out.println("Geometric Distribution: " + Geometric(0.75,4));
        System.out.println("Negative Binomial Distribution: " + NegativeBinomial(5, 3,0.2));
        System.out.println("Hypergeometric Distribution: " + Hypergeometric(3, 5, 11, 20));
        System.out.println("Poisson Distribution: " + Poisson(8,5));
        return "-----------------------------------------------------------";
    }
    
}
