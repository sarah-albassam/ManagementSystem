package inventorysystem;

import java.time.LocalDate;
import java.util.Scanner;

public class orders {
	
	//variables:
	Scanner input = new Scanner(System.in);
	public int orderID;
	public int numOfProducts;
	public double totalPrice;
	public LocalDate dateOfPurchase;
	public String order[] = new String [10];
	
	//methods: 
	public void placeOrder() {
		Dairies D2 = new Dairies();
		Juice J2 = new Juice();
		Meat M2 = new Meat();
		manager manage = new manager();
		Products P1 = new Products();
		
		//print all products
		P1.printProduct();
		if(numOfProducts>10)
			return;
		if(P1.noOfProducts < 1) {
			System.out.println("There's no products to order ");
			return;}
		System.out.println("Please choose what type of product to order: \n1-Dairies \n2-Juices \n3-meat ");
		int choice,key = 0;
		choice = input.nextInt();
		switch(choice) {
		case 1:{
			//if (check(D.))
				
			if (D2.noOfProducts < 1) {
				System.out.println("There is no products.");
				return;
			
		}else {
			System.out.println("enter ID of product: (only from existing IDs)");
			key = input.nextInt();
			for(int i = 0 ; i <D2.noOfProducts; i++ ) {
				if (D2.dairiesID[i] == key) {
					order[this.numOfProducts] = D2.dairies[i];
					totalPrice = totalPrice + D2.price;
					this.numOfProducts++;
				}}}
		}
		
			break;
			
		case 2:{
			if (J2.noOfProducts < 1) {
				System.out.println("There is no products.");
				return;
			
		}else {
			System.out.println("enter ID of product: (only from existing IDs)");
			key = input.nextInt();
			for(int i = 0 ; i <J2.noOfProducts; i++ ) {
				if (J2.juiceID[i] == key) {
					order[this.numOfProducts] = J2.juice[i];
					totalPrice = totalPrice + J2.price;
					this.numOfProducts++;
				}}}
			
		}
			break;
		case 3:{
			if (M2.noOfProducts < 1) {
				System.out.println("There is no products.");
				return;
		}else {
			System.out.println("enter ID of product: (only from existing IDs)");
			key = input.nextInt();
			for(int i = 0 ; i <M2.noOfProducts; i++ ) {
				if (M2.meatID[i] == key) {
					order[this.numOfProducts] = M2.meat[i];
					totalPrice = totalPrice + M2.price;
					this.numOfProducts++;
				}
			}}}
			break;
		
			default:
				System.out.println("wrong input ");
			
		}
		
	if (numOfProducts>0)
		dateOfPurchase = LocalDate.now();
		
	}
		
	public void deleteOrder() {
		if (numOfProducts < 1) {
			System.out.println("There is no order to delete.");
		return;
		}
		totalPrice = 0;
		
		for (int i = 0 ; i < numOfProducts ; i++) {
			order[i] = null; 
		}
		orderID ++;
		numOfProducts = 0;
		System.out.println("Order deleted.");

		
	}

	public void printOrder() {//view cart
		if (numOfProducts < 1) {
			System.out.println("cart empty, place an order.");
			return;}
			
		System.out.println("\n************** Order **************");

		System.out.println("- Order ID : "+orderID);
		System.out.println("- Date of purchase : "+dateOfPurchase);
		for (int i = 0; i < numOfProducts ; i++) {
			System.out.println("- Product #"+(i+1)+" : "+ order[i]);
		}
		System.out.println("\n- Total price : "+ totalPrice);
		System.out.println("\n** Thank you for choosing our system  **");
		System.out.println("\n***********************************");

	}
	
}
