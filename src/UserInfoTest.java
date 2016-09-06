import java.util.Scanner;
public class UserInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean repeat = true;
		Scanner input = new Scanner(System.in);
		
		while (repeat){
			UserInfo test = new UserInfo(null, 0, 0, 0, 0);
			System.out.println("Please input your name: ");
			String name = input.nextLine();
			System.out.println("Please input your ID number: ");
			int ID = input.nextInt();
			System.out.println("Please input your birth day: ");
			int day = input.nextInt();
			System.out.println("Please input your birth month: ");
			int month = input.nextInt(); 
			System.out.println("Please input your birth year: ");
			int year = input.nextInt();
			
			//calling setters
			test.setName(name);
			test.setID(ID);
			test.setDay(day);
			test.setMonth(month);
			test.setYear(year);
			System.out.println("Your name is " + test.getName() + 
							   "\nYour ID number is " + test.getID() + 
							   "\nYour date of birth is: " + test.getDay() + "/" + test.getMonth() + "/" + test.getYear());
			char goAgain = input.next().charAt(0);
			goAgain = Character.toUpperCase(goAgain);
			System.out.println("Input 'Y' to input another user, or 'N' to exit.");
			if (goAgain == 'Y'){
				continue;
			}
			else if (goAgain == 'N'){
				repeat = false;
			}
			
		}
		

	}

}
