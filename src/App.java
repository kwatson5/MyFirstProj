
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//item price
		float yogaMatPrice = 34.99f;
		float foamRollerPrice = 23.52f;
		
		//amount of money in wallet
		float dougsWallet = 53.43f;
		float wendysWallet = 245.85f;

		//number of friends		
		int dougsFriends = 315;
		int wendysFriends = 87;
		
		//age in years
		int dougsAge = 33;
		int wendysAge = 37;
		
		//first name
		String husbandFirstName = "Doug";
		String wifeFirstName = "Wendy";
		
		//last name
		String husbandLastName = "Jones";
		String wifeLastName = "Smith";
		
		//middle initial
		char husbandMiddleInitial = 'L';
		char wifeMiddleInitial = 'K';
		
		//money in wallet after buying yoga mat
		float wendysPostYogaMatBalance = wendysWallet - yogaMatPrice;
		float dougsPostYogaMatBalance = dougsWallet - yogaMatPrice;
		
		//money in wallet after buying foam roller
		float dougsPostFoamRollerBalance = dougsWallet - foamRollerPrice; 
		
		//friends made each year
		double wendysFriendsPerYear = wendysFriends / wendysAge;
		double dougsFriendsPerYear = dougsFriends / dougsAge;
		
		
		System.out.println("The price of the yoga mat is:" + " " +"$" +yogaMatPrice);
		
		System.out.println("The price of the foam roller is:" + " " +"$" +foamRollerPrice);
		
		System.out.println("Wendy had $" +wendysPostYogaMatBalance +" remaining in her wallet after purchasing the yoga mat for $" +yogaMatPrice);	
		
		System.out.println("Doug had $" +dougsPostFoamRollerBalance +" remaining in his wallet after buying a foam roller is $" +foamRollerPrice);
		
		System.out.println("Wendy has made roughly " + wendysFriendsPerYear +" friends per year");
		
		System.out.println("Doug has made roughly " + dougsFriendsPerYear +" friends per year");
		
		System.out.println("Doug's full name is " +husbandFirstName +" " +husbandMiddleInitial +". " +husbandLastName);
		
		System.out.println("Wendy's full name is " +wifeFirstName +" " +wifeMiddleInitial +". " +wifeLastName);
		
		
	}

}
