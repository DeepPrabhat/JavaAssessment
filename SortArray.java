import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        Integer [] input = new Integer[] {2, 6, 7, 8, 11, 12};
        sortMyArray(input);
    }
    public  static void  sortMyArray(Integer [] input) {
        ArrayList<Integer> arr1= new ArrayList<Integer>();
        ArrayList<Integer> arr2= new ArrayList<Integer>();

        Arrays.sort(input);
        arr1.add(input[input.length-1]);
        arr2.add(input[input.length-2]);
        int sum1=input[input.length-1];
        int sum2=input[input.length-2];
        for(int i=input.length-3;i>=0;i--)
        {
            if(sum2>sum1)
            {
                arr1.add(input[i]);
                sum1=sum1+input[i];
            }
            else
            {
                arr2.add(input[i]);
                sum2=sum2+input[i];
            }
        }
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<arr1.size();i++)
        {
            result.add(arr1.get(i));
        }
        for(int i=0;i<arr2.size();i++)
        {
            result.add(arr2.get(i));
        }
        System.out.println(result);
    }
}