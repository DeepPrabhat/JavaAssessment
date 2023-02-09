public class BalanceTheBrackets {
    public static void main(String[] args) {
        String input = "(8 + 2) * (2 -1 =  10" ;
        balanceTheEq(input);
    }

    public static void balanceTheEq(String input) {
        //TODO Add your implementation here
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='(')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
 