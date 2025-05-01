import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
	public static void main(String[] args) {
		int a,b,u=0,co=0;
		Random O = new Random();
		Scanner Os= new Scanner(System.in);
		boolean c= true;
		while(c==true) {
			System.out.println( "ENTER 0 FOR ROCK" );
			System.out.println( "ENTER 1 FOR PAPER" );
			System.out.println( "ENTER 2 FOR SCISSROS" );
			a = Os.nextInt();
			b = O.nextInt(3);
			if(b==a) {
				System.out.println("THIS DRAW");
			}
			else if(b==0&&a==1) {
				System.out.println("ROCK IS CALL BY COMPUTER");
				System.out.println("YOU WON THIS ONE");
				u++;
			}
			else if(b==2&&a==1) {
				System.out.println("SCISSROS IS CALL BY COMPUTER");
				System.out.println("COMPUTER WON THIS ONE");
				co++;
			}
			else if(b==1&&a==0) {
				System.out.println("PAPER IS CALL BY COMPUTER");
				System.out.println("COMPUTER WON THIS ONE");
				co++;
			}
			else if(b==1&&a==2) {
				System.out.println("PAPER IS CALL BY COMPUTER");
				System.out.println("YOU WON THIS ONE");
				u++;
			}
			else if(b==0&&a==2) {
				System.out.println("ROCK IS CALL BY COMPUTER");
				System.out.println("COMPUTER WON THIS ONE");
				co++;
			}
			else if(b==2&&a==0) {
				System.out.println("SCISSROS IS CALL BY COMPUTER");
				System.out.println("YOU WON THIS ONE");
				u++;
			}
			System.out.println("");
			System.out.print("Wanna try again (true/false): ");
			c= Os.nextBoolean();
		}
		if(co>u) {
			System.out.println("COMPUTER WON THE GAME");
			
		}
		else {
			System.out.println("YOU WON THE GAME");
		}
	}
}