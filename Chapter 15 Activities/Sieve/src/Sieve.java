import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * A program that implements the sieve of Eratosthenes.
*/
public class Sieve
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Compute primes up to which integer?");
        int n = in.nextInt();

        // Your work goes here
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= n; i++)
        {
            primes.add(i);
        }

        for (int i = 2; i * i <= n; i++)
        {1
            for (int j = 2; i * j <= n; j++)
            {
                primes.remove(i * j);
            }
        }

        System.out.println(primes);

        








    }
}
