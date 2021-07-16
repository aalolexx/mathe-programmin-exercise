import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

/**
 * Write a description of class Primzahlen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primzahlen
{
    
    public static void test () {
        boolean eratos[] = eratosthenes(100);
        int amPrimes = countPrimes(100);
        System.out.println(Arrays.toString(eratos));
    }
    
    public static boolean isPrime (int p) {
       if (p < 2) {
            return false;
       }
       for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static int countPrimes (int n) {
        int primeCount = 0;
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static boolean[] eratosthenes (int n) {
        boolean P[] = new boolean[n+1];
        
        for (int i = 0; i <= n; i++) {
            P[i] = true;
        }
        
        P[0] = false;
        P[1] = false;
        
        int currentNumber = 2;
                
        while (true) {
            int multiple = currentNumber + currentNumber;
            
            while (multiple <= n) {
                P[multiple] = false;
                multiple += currentNumber;
            }
            
            int tempNextNumber = -1;
            int i = currentNumber + 1;
            
            while (tempNextNumber == -1 && i <= n) {
                if (P[i]) {
                    tempNextNumber = i;
                }
                i++;
            }
            if (tempNextNumber == -1) {
                break;
            }
            currentNumber = tempNextNumber;
        }
        
        return P;
    }
}
