
/**
 * Write a description of class Primzahlen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primzahlen
{
    // instance variables - replace the example below with your own
   
    
    public static boolean isPrime(int p)
    {
       if (p <= 2) {
            return (p == 2);
        }
       for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    
  public  int countPrimes(int n)
    {
   
}

public  boolean[] eratosthenes(int n)
{
  
}
}
