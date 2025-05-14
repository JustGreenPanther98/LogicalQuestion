import java.util.Scanner;
//Selection sort of time complexity of O(n^2)
public class SelectionSort{
	public static void main(String [] args) {
		Scanner S = new Scanner(System.in);
		int size;
		size=S.nextInt();
		int [] number = new int [size];
		for(int i=0;i<size;i++)
			number[i] = S.nextInt();
		for(int i:selectionSort(number))
			System.out.print(i+ " ");
	}
	
	private static int[] selectionSort(int []numbers) {
		for(int i=0;i<numbers.length-1;i++) {
			int min =i;
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]>numbers[j]) {
					min=j;
				}
			}
			int temp=numbers[i];
			numbers[i]=numbers[min];
			numbers[min]=temp;
		}
		return numbers;
	}
}