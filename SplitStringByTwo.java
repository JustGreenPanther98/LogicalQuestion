public class SplitStringByTwo{
	    public static String[] solution(String s) {
	      String str;
	      String [] arr;
	      if(s.length()%2==0){
	        arr = new String[(int)s.length()/2];
	        for(int i=0,j=0;i<s.length();i=i+2,j++){
	          if(i+2<s.length()) {
	            str = s.substring(i,i+2);
	            arr[j]=str;
	        }
	          else{
	            str=s.substring(i);
	            arr[j]=str;
	          }
	      }
	    }
	      else{
	        arr = new String[(int)s.length()/2+1];
	        for(int i=0,j=0;i<s.length();i=i+2,j++){//abcde
	          if(i+2<s.length()) {
	            str = s.substring(i,i+2);
	            arr[j]=str;
	        }
	          else{
	            str=s.substring(i);
	            str+="_";
	            arr[j]=str;
	          }
	      }
	    }
	      return arr;
	  }
	}
