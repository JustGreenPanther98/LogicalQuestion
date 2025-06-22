import java.util.Arrays;

public class ArraySumLeftRight{
	public static int findEvenIndex(int[] arr) {
	    if(arr.length==0) return -1;
	    int index=0,sumR,sumL;
	    while(index!=arr.length){
	      sumL=sumR=0;
	      for(int i=0;i<index;i++)
	        sumR=sumR+arr[i];//RightSide sum
	      for(int j=index+1;j<arr.length;j++)
	        sumL=sumL+arr[j]; //Left Side sum
	      if(index==0&&sumL==0) return 0;
	      else if(sumL==sumR) return index;
	      index++;
	    }
	    return -1;
	  }
}