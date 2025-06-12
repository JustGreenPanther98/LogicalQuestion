/*Double every other digit, scanning from right to left, starting from the second digit (from the right).
 * 
Another way to think about it is: if there are an even number of digits
double every other digit starting with the first; if there are an odd number of digits
double every other digit starting with the second:
 */
public class LuhnAlgo{
	public static boolean validate(String n){
	    if(n.trim().isEmpty()) return false;
	    //if(n.length()>=16) return false;
	    int digitcount=n.length();
	    long CreditNumber = Long.valueOf(n),Last,sum=0L;
	    for(int i=digitcount-1;i>=0;i--){
	      Last=CreditNumber%10;
	      if(digitcount%2==0){
	        if(i%2==0){
	          if(Last*2*1L<=9*1L){
	            sum=sum+Last*2;
	          }
	          else{
	            Last=sum(Last*2*1L);
	            System.out.println(Last);
	            sum=sum+Last;
	            //System.out.println(sum);
	          }
	        }
	        else{
	          sum=sum+Last;
	          //System.out.println(sum);
	        }
	      }
	      else{
	        if(i%2!=0){
	          if(Last*2*1L<=9*1L){
	            sum=sum+Last*2;
	          }
	          else{
	            Last=sum(Last*2*1L);
	            sum=sum+Last;
	          }
	        }
	        else{
	          sum=sum+Last;
	          }
	      }
	      CreditNumber=CreditNumber/10*1L; 
	  }
	    return ((sum%10)*1L==0*1L);
	}
	    static long sum(long number){
	      if(number==0) return 0;
	      long sum=0;
	      while(number!=0){
	        sum=sum+(number%10);
	        number=number/10*1L;
	      }
	    return sum;
	    }
}