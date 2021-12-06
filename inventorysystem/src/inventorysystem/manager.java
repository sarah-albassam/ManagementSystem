package inventorysystem;
import java.util.Scanner;

public class manager extends User {
	
	static Scanner input = new Scanner(System.in);
	
	public static void addProduct()  {
		Products p = new Products();
		if (p.noOfProducts > 0) {
			System.out.println("These are the products available: ");
			p.printProduct();
		}
		System.out.println("Select type of product to add: \n1-Dairies \n2-Juice \n3-Meat");
		int choice;
		choice = input.nextInt();
		switch(choice) {

		case 1:
		
			Dairies D = new Dairies();
			if(D.noOfProducts< 5)
			{
				//input:
				System.out.println("Enter product ID (numbers only): ");
				D.dairiesID[D.noOfProducts] = input.nextInt();
				//to check if the ID already taken
				while(check(D.dairiesID,D.dairiesID[D.noOfProducts],D.noOfProducts))
						{
						System.out.println("ID already taken type another ID: ");
						D.dairiesID[D.noOfProducts] = input.nextInt();
						}
				
				input.nextLine();
				System.out.println("Enter dairy type: ");
				D.dairies[D.noOfProducts] = input.nextLine();
				System.out.println("Enter weight in liter : ");
				D.weight[D.noOfProducts] = input.nextDouble();
				D.noOfProducts++;
				p.noOfProducts++;

			}
			else {
				System.out.println("Dairies already full");	
			}
		
			break;
		case 2:
		
			Juice J = new Juice();
			if(J.noOfProducts< 5)
			{
				//input:
				System.out.println("Enter product ID (numbers only): ");
				J.juiceID[J.noOfProducts] = input.nextInt();
				while(check(J.juiceID,J.juiceID[J.noOfProducts],J.noOfProducts))
				{
				System.out.println("ID already taken type another ID: ");
				J.juiceID[J.noOfProducts] = input.nextInt();
				}
				input.nextLine();
				System.out.println("Enter juice type: ");
				J.juice[J.noOfProducts] = input.nextLine();
				System.out.println("Enter weight in liter : ");
				J.weight[J.noOfProducts] = input.nextDouble();
				J.noOfProducts++;
				p.noOfProducts++;


			}
			else {
				System.out.println("Juice already full");
				
			}
		break;
		
		case 3:
			Meat M = new Meat();
			if(M.noOfProducts< 5)
			{
				//input:
				System.out.println("Enter product ID (numbers only): ");
				M.meatID[M.noOfProducts] = input.nextInt();
				while(check(M.meatID,M.meatID[M.noOfProducts],M.noOfProducts))
				{
				System.out.println("ID already taken type another ID: ");
				M.meatID[M.noOfProducts] = input.nextInt();
				}
				input.nextLine();
				System.out.println("Enter meat type: ");
				M.meat[M.noOfProducts] = input.nextLine();
				System.out.println("Enter weight in kelograms : ");
				M.weight[M.noOfProducts] = input.nextDouble();
				M.noOfProducts++;
				p.noOfProducts++;

			}
			else {
				System.out.println("Meat already full");
				
			}
			
			break;	
		
	}}

	public static void deleteProduct() {
		Products p = new Products();
		if (p.noOfProducts > 0) {
			System.out.println("These are the products available: ");
			p.printProduct();
		}
		else {
			System.out.println("There's no product to delete");
			return;
		}
		
		System.out.println("Select type of product to delete: \n1-Dairies \n2-Juice \n3-Meat");
		int choice;
		choice = input.nextInt();
		System.out.println("enter the ID of the product you want to delete");
		int key;
		key =  input.nextInt();
		switch(choice) {

		case 1:{
			Dairies D = new Dairies();
			int index = 0;
			boolean found = false;
			//to find the product:
			for(int i = 0 ; i<D.noOfProducts  ; i++) {
				if(D.dairiesID[i] == key) {
					index = i;
					found = true;
				break;	
				}
			}
			if (!found)
				System.out.println("product not found");

			else {
			for (int i = index ; i < D.noOfProducts-1; i++ ) {
				D.dairies[i] = D.dairies[i+1];
				D.dairiesID[i] = D.dairiesID[i+1];
				D.weight[i] = D.weight[i+1];

			}
			D.noOfProducts--;
			p.noOfProducts--;
			System.out.println("Item deleted.");

			}
			}
			break;
		case 2:{
			Juice J = new Juice();
			int index = 0;
			boolean found = false;
			//to find the product:
			for(int i = 0 ; i<J.noOfProducts - 1 ; i++) {
				if(J.juiceID[i] == key) {
					index = i;
					found = true;
				break;	
				}
			}
			if (!found)
				System.out.println("product not found");

			else {
			for (int i = index ; i < J.noOfProducts-1; i++ ) {
				J.juice[i] = J.juice[i+1];
				J.juiceID[i] = J.juiceID[i+1];
				J.weight[i] = J.weight[i+1];

			}
			J.noOfProducts--;
			p.noOfProducts--;
			System.out.println("Item deleted.");
			}
			}
			break;
			
		case 3:{
			Meat M = new Meat();
			int index = 0;
			boolean found = false;
			//to find the product:
			for(int i = 0 ; i<M.noOfProducts-1 ; i++) {
				if(M.meatID[i] == key) {
					index = i;
					found = true;
				break;	
				}
			}
			if (!found)
				System.out.println("product not found");

			else {
			for (int i = index ; i < M.noOfProducts-1; i++ ) {
				M.meat[i] = M.meat[i+1];
				M.meatID[i] = M.meatID[i+1];
				M.weight[i] = M.weight[i+1];
				M.noOfProducts--;
				p.noOfProducts--;

			}
			M.noOfProducts--;
			p.noOfProducts--;
			System.out.println("Item deleted.");
			}
			}
			break;		
		}
		
	}

	public static boolean check(int arr[] ,int num,int size) {
		for (int i = 0 ; i < size ; i ++) {
			if (arr[i]==num)
			return true;
		}
		return false;
	}
}
