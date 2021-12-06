package inventorysystem;

import java.util.Date;
import java.util.Scanner;
public class Products {

	Scanner input = new Scanner(System.in);
	

	//variable:
	public int productID;
	public static double price;
	public static int noOfProducts;
	public int products[];

	//methods:
	
	//stat
	public void showStatistics() {//will show max weight product in selected type
		int choice;
		
		//objects:
		Dairies D1 = new Dairies();
		Juice J1 = new Juice();
		Meat M1 = new Meat();
		
		do {
		System.out.println("Please choose what type of product to show statistics: (or any number to exit) \n1-Dairies \n2-Juices \n3-meat \n ");
		choice = input.nextInt();
		
		//check for products:
		if (noOfProducts < 1) {
			System.out.println("There is no products to display.");
		return;	
		}
		
		switch(choice) {
		case 1 :{
			//check Dairies num of products:
			if (D1.noOfProducts < 1){
				System.out.println("There is no products to display.");
				break;	
			}//check this
			
			
			double maxWeight = D1.weight[0];
			int maxindex = 0;
			for(int i = 0 ; i<D1.noOfProducts; i++) {
				if(D1.weight[i] > maxWeight) {
					maxWeight = D1.weight[i];
					maxindex = i;
				}
			}
			
			System.out.println("- The product with the highest weight : "+D1.dairies[maxindex] + "\n-weight : " + D1.weight[maxindex] ) ;
			
			
		}
			break; 
		case 2: {
			//check Juice num of products:
			if (J1.noOfProducts < 1){
				System.out.println("There is no products to display.");
				break;	
			}//check this
			
			
			double maxWeight = J1.weight[0];
			int maxindex = 0;
			for(int i = 0 ; i<J1.noOfProducts; i++) {
				if(J1.weight[i] > maxWeight) {
					maxWeight = J1.weight[i];
					maxindex = i;
				}
			}
			
			System.out.println("- The product with the highest weight : "+J1.juice[maxindex] + "\n-weight : " + J1.weight[maxindex] ) ;
		}
			break;
			
		case 3:{
			//check Meat num of products:
			if (M1.noOfProducts < 1){
				System.out.println("There is no products to display.");
				break;	
			}//check this
			
			
			double maxWeight = M1.weight[0];
			int maxindex = 0;
			for(int i = 0 ; i<M1.noOfProducts; i++) {
				if(M1.weight[i] > maxWeight) {
					maxWeight = M1.weight[i];
					maxindex = i;
				}
			}
			
			System.out.println("- The product with the highest weight : "+M1.meat[maxindex] + "\nweight : " + M1.weight[maxindex] ) ;}
			break;
		}
	}while (!(choice<1)&&!(choice>3));
		}
	
	//print
	public void printProduct() {//add id
        System.out.println("****************************************");
		Dairies D1 = new Dairies();
        Juice J1 = new Juice();
        Meat M1 = new Meat();
        
          if (noOfProducts < 1) 
            System.out.println("There is no products to display."); 
          else {
          
             System.out.print("products in Dairies : \n");
      
             if(D1.noOfProducts < 1) {
            	 System.out.println("no products yet");
             }else {
             System.out.println("No. * ID   *  Product");
             for(int i = 0 ; i<D1.noOfProducts; i++)
                 System.out.println("#"+(i+1)+"    (" + D1.dairiesID[i]+")      "+D1.dairies[i]);
             System.out.println("-price: "+ D1.price );}
             System.out.print("\nproducts in juice : \n");
             if(J1.noOfProducts < 1) {
            	 System.out.println("no products yet");
             }else {
             for(int i = 0 ; i<J1.noOfProducts; i++)
                 System.out.println("#"+(i+1)+"    (" + J1.juiceID[i]+")      "+J1.juice[i]);
             System.out.println("-price: "+ J1.price );}
             System.out.print("\nproducts in Meat : \n");
             if(M1.noOfProducts < 1) {
            	 System.out.println("no products yet");
             }else {
             for(int i = 0 ; i<M1.noOfProducts; i++)
                 System.out.println("#"+(i+1)+"    (" + M1.meatID[i]+")      "+M1.meat[i] );
             System.out.println("-price: "+ M1.price );}

             System.out.println("****************************************");}
		
	}
	
	public void printProduct(int num) {//1> Dairies , 2>Juice, 3>Meat
		
		int numm=num;
		Dairies D2 = new Dairies();
		Juice J2 = new Juice();
		Meat M2 = new Meat();
		
		switch(numm){



		case 1 :{
		//check for products:
		if (D2.noOfProducts < 1) {
		System.out.println("There is no products to display.");
		return;
		}
		for(int i = 0 ; i<D2.noOfProducts; i++) {
		System.out.println("-"+D2.dairies[i] + " with the weight of " +D2. weight[i]);
		}
		break;
		}
		case 2:{
		//check for products:
		if (J2.noOfProducts < 1) {
		System.out.println("There is no products to display.");
		return;
		}

		for(int i = 0 ; i<J2.noOfProducts; i++) {
		System.out.println("-"+J2.juice[i] + " with the weight of " +J2. weight[i]);
		}
		break;}

		case 3 :{
		//check for products:
		if (M2.noOfProducts < 1) {
		System.out.println("There is no products to display.");
		return;
		}
		for(int i = 0 ; i<M2.noOfProducts; i++) {
		System.out.println("-" + M2.meat[i] + " with the weight of " + M2. weight[i]);
		}
		break;}
		case 4:
			break;

		default:
		System.out.println("please make sure to choose the right number.");
		}
		
		
		
		
	}
	
}		
