/**
 * Some numbers have funny propertie
 * 89 : 8¹ + 9² = 89 * 1
 * 695 : 6² + 9³ + 5⁴= 1390 = 695 * 2
 * 46288 : 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 5
 */
public class PlayWithNumber{
	public class DigPow {
		public static long digPow(int n, int p) {
	    long sum=0*1L;
	    int temp=n,numberofdigit=(int)Math.log10(n)+1,maxpower=numberofdigit-1+p;
	    while(temp!=0){
	      sum+=(long)Math.pow(temp%10,maxpower);
	      maxpower--;
	      temp/=10;
	    }
	    if(sum%n!=0) return -1;
	    long multiple = sum/n;
	    return multiple;
		}
	}
//	n = 89; p = 1 ---> 1 since 8¹ + 9² = 89 = 89 * 1
//
//			n = 92; p = 1 ---> -1 since there is no k such that 9¹ + 2² equals 92 * k
//
//			n = 695; p = 2 ---> 2 since 6² + 9³ + 5⁴= 1390 = 695 * 2
//
//			n = 46288; p = 3 ---> 51 since 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51
}