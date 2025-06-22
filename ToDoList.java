import java.util.Scanner;
import java.util.HashSet;
public class ToDoList{
	public static void main(String[] args) {
		HashSet <String> toDo= new HashSet<>();//no repeating data
		Scanner s = new Scanner(System.in);
		boolean ch=true;
		int choice;
		System.out.println("----------TO DO LIST----------\n");
		while(ch) {
			System.out.println("1) See List");
			System.out.println("2) Add task to list");
			System.out.println("3) Remove Task from list");
			System.out.print("Enter Choice : ");
			choice=s.nextInt();
			s.nextLine();
			switch(choice){
			case 1:
				if(toDo.isEmpty()) System.out.println("There are no tasks");
				else {
					for(String sc: toDo) 
						System.out.println(sc);
				}
				break;
			case 2:
				System.out.print("Enter your task :");
				String task = s.nextLine();
				toDo.add(task.trim());
				break;
			case 3:
				System.out.print("Which Task You want to remove from To do list:");
				String task1 = s.nextLine();
				if(toDo.contains(task1.trim())) {
					toDo.remove(task1);
					System.out.println(task1+"removed sucessfully");
				}
				else System.out.println("Task Not Found");
				break;
			default:
				System.out.println("Enter Vaild Choice!");
				break;
					
			}
			System.out.print("Do you want to countinue?(true/false): ");
			try{
				ch=s.nextBoolean();
			}
			catch(Exception e){
				System.out.println("Allowed Only to enter true or false!");
				break;
			}
		}
		s.close();
	}
}