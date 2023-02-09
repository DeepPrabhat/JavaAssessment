import java.util.*;
import java.util.stream.StreamSupport;

public class Main {
    static  boolean isPrime(int num)
    {
        if(num<1)
        {
            return false;
        }
        if(num==1)
        {
            return true;
        }
        for(int i=2;i<=num/2;i++)
        {
            if((num%i)==0)
                return  false;
        }
        return true;
    }
    static int biggestPrime(int n)
    {
        int biggestPrime=1;
        for(int i=0;i<n;i++)
        {
            if(isPrime(i))
            {
                biggestPrime=i;
            }
        }
        return biggestPrime;
    }

    static void sequence(int target,int count)
    {
        //System.out.print(target+" ");
        //System.out.print(count);

        if(isPrime(target) && count>=1)
        {
            System.out.print(target);
            return;
        }
        else
        {
            System.out.print(biggestPrime(target)+"+");
            //System.out.print("calling");
            //System.out.println(target-biggestPrime(target));
            count=count+1;
            sequence(target-biggestPrime(target),count);
        }
    }

    public static void main(String[] args) {
        int n=17;
        sequence(n,0);
    }
}