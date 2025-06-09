public class SortingOnlyOddInArray {
  public static int[] sortArray(int[] array) {
    for(int i=0;i<array.length-1;i++){
      int min=i,temp;
      if(array[i]%2==0) continue; 
      for(int j=i+1;j<array.length;j++){
        if((array[min]>array[j]) && array[j]%2!=0){
          temp=array[min];
          array[min]=array[j];
          array[j]=temp;
        }
      }
  }
    return array;
}
}