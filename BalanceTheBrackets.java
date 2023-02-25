public class BalanceTheBrackets
{
    public static void main(String[] args) {
        String input = "(3*(3+1)-3*2+1=7";
        balanceTheEq(input);
    }
    public static void  balanceTheEq(String input)
    {
        int count=0;
        int closeStatus=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='=')
            {
                break;
            }
            else if(input.charAt(i)=='(')
            {
                closeStatus++;
            }
            else if(input.charAt(i)==')')
            {
                closeStatus--;
            }
            else if(input.charAt(i)>='0' && input.charAt(i)<='9')
            {
                count++;
            }
            System.out.println("count "+count);
            System.out.println("Status "+closeStatus);
            System.out.println("____________________");
            if(input.charAt(i)==')')
            {
                count=0;
            }
            if(count!=0 && count==2 && closeStatus==1 && input.charAt(i+1)!=')')
            {
                input=input.substring(0,i+1)+")"+input.substring(i+1);
                System.out.println("print at "+i);
            }
        }
        System.out.println(input);
        }

    }
