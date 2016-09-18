import java.util.ArrayList;
import java.util.Scanner;
public class UserInfoTest {

	
	static Scanner input = new Scanner(System.in);
	static ArrayList<UserInfo> users = new ArrayList<UserInfo>();
	static boolean repeat = true;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		while (repeat){
			UserInfo test = new UserInfo(null, 0, 0, 0, 0);
			System.out.println("Please input your name: ");
			name = input.next();
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
			users.add(test);
			test.getInfo();
			
			//repeat thing to make the program run again to input another person
			//System.out.println(users.get(0).getID());
			System.out.println("Input 'Y' to input another user, 'A' to check a user's info, or 'N' to exit.\n\n");
			char goAgain = input.next().charAt(0);
			goAgain = Character.toUpperCase(goAgain);
			if (goAgain == 'Y'){
				//continue;
			}
			else if (goAgain == 'A'){
				findUser();
			}
			else if (goAgain == 'N'){
				System.out.println("Bye bye!");
				repeat = false;
			}
			
		}
		
	}
	
	private static void findUser() {
		System.out.println("Please input the ID number of the user you would like to search for.");
		int inUser = input.nextInt();
		for (int x = 0; x < users.size(); x++) {
			if (inUser == users.get(x).getID()){
				System.out.println("User #" + inUser + " has the following information.\n");
				users.get(x).getInfo2();
				System.out.println("\n");
			}
			else {
				System.out.println("Error. No user found, please try again.");
				findUser();
			}
		}
		System.out.println("Enter 'Y' to search for another user, 'N' to input another user's information, or 'Z' to exit.");
		char meme = input.next().charAt(0);
		meme = Character.toUpperCase(meme);
		if (meme == 'Y'){
			findUser();
		}
		else if (meme == 'N'){
		}
		else if (meme == 'Z'){
			System.out.println("Bye bye!");
			repeat = false;
		}
		
		
	}



	
	

}
