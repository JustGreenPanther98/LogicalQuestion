import java.util.Scanner;
public class BubbleSort{
	//time complexity of bubble sort is O(n^2)
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int size = Input.nextInt();
		int [] number = new int [size];
		for(int i=0;i<size;i++)
			number[i]=Input.nextInt();
		for(int i: bubbleSort(number)) {
			System.out.println(i+" ");
		}
	}

	private static int[] bubbleSort(int[] number) {
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number.length-i-1;j++) {
				if(number[j]>number[i]) {
					int temp = number[j];
					number[i]=number[j];
				}
			}
		}
		return number;
	}
}