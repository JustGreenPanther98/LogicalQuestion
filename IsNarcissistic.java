import java.lang.Math;
//A Narcissistic Number (or Armstrong Number) is a positive number which is the sum of its own digits, each raised to the power of the number of digits in a given base
public class IsNarcissistic{
    public static boolean isNarcissistic_(int number) {
        int n= (int)(Math.log10(number))+1,sum=0,i=0,temp=number;
        while(i!=n){
        i++;
        sum=sum+(int)(Math.pow(temp%10,n));
        temp=temp/10;
        }
        if(sum==number){
        return true;
        }
        else{
        return false;
      }
    }
}