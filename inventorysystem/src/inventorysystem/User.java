package inventorysystem;
import java.util.Scanner;

public class User {
	static Scanner input = new Scanner(System.in);

	//variable: 
	public static String userName = "irfan" ;
	protected static int password = 1234;
	
	
	//methods
	public static boolean login() {
		
		System.out.println("Welcome Mr. irfan ");

		System.out.println("Please enter your password");
		int pass = input.nextInt(); 
		
				if(pass==password) {
					System.out.println("correct   password ");
					return true;
					}
				
			
		
			System.out.println("wrong username or password");
			
			return false;
	
	}

	public static void main(String[] args) {
		Products p = new Products();
		manager m = new manager();
		Dairies D1 = new Dairies();
		customer C = new customer();
		orders o = new orders();
		int choice;
		do {
		System.out.println("Enter \n#1 for customer \n#2 for manager \n#3 to exit ");
		choice = input.nextInt();
		
		if(choice==1) {//customer
			System.out.println("Enter shop name: ");
			input.nextLine();
			C.shopName = input.nextLine();
			System.out.println("*** Welcome "+C.shopName+" to the system ***");
			int choice22;
			do {
			System.out.println("-Select operation : ");
			System.out.println("1- Place order \n2- Delete order \n3- View cart \n4- Back");
			choice22= input.nextInt();
			switch(choice22) {
			case 1:
				o.placeOrder();
				break;
			case 2:
				o.deleteOrder();
				break;
			case 3:
				o.printOrder();
				break;
			case 4:
				System.out.println("Thank you for using our system");
				break;
				default:
				System.out.println("wrong input");
			}}while(choice22 !=4);
			o.deleteOrder();
			
			
		}//end if 1 (customer)
		else if(choice == 2){//manager
			if(login())
			{
				System.out.println("*** Welcome to inventory management system ***");
				int choice1;
				do {
					System.out.println("-Select operation : ");
					System.out.println("1- Add product \n2- Delete product \n3- Display all products \n4- Display one selected product \n5- Show statistics \n6-Exit management system");
					choice1 = input.nextInt();
					switch(choice1) {
					case 1: 
						m.addProduct();
						break;
					case 2: 
						m.deleteProduct();
						break;
					case 3:
						p.printProduct();
						break;
					case 4:
						int num;
						do {
						 System.out.println("\n-Please choose what type of product to preview: \n1-Dairies \n2-Juices \n3-meat \n4-exit");
						
						num = input.nextInt();
						p.printProduct(num);}
						while(num!=4);
						break;
					case 5:
						p.showStatistics();
						break;						
					}				
				}while (choice1 !=6);
			}				
		}}while (choice!=3);//end if 2 manager}
		
		
		System.out.println("Thank you for using our system <3");
	}//end main

}//end class
