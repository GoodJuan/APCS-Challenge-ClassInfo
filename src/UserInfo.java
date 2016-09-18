
public class UserInfo {

	private String name;
	private int ID;
	private int day; 
	private int month;
	private int year;
	
	//constructor
	public UserInfo(String name, int ID, int day, int month, int year){
		this.name = name;
		this.ID = ID;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	//setters
	public void setName(String s){
		this.name = s; 
	}
	public void setID(int ID){
		this.ID = ID;
	}
	public void setDay(int day){
		this.day = day;
	}
	public void setMonth(int month){
		this.month = month;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	
	
	//getters
	public String getName(){
		return name; 
	}
	public int getID(){
		return ID;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public void getInfo(){
		System.out.println("Your name is " + getName() + 
		   "\nYour ID number is " + getID() + 
		   "\nYour date of birth is: " + getDay() + "/" + getMonth() + "/" + getYear());
	}
	public void getInfo2(){
		System.out.println("User #" + getID() + "'s name is " + getName() + 
		   "\n"+ "User #" + getID() + "'s ID number is " + getID() + 
		   "\nUser #" + getID() + "'s birthday is " + getDay() + "/" + getMonth() + "/" + getYear());
	}
	
	
}
