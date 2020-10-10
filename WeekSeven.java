/* 
 * 
 * 
 * Suggested tasks to work on this week:

Select an application to build from scratch.  You will build an interface 
for the user to interact with the application that also allows and managed
 proper input validation.
 
This should be a fully usable application that has an intended purpose
 and NOT just filler code.  This means all functionality you have added 
 to your application must be fully operational.

Your application must contain at least 2 unique classes.
 (not 2 instances of said objects, but two completely independent classes)


You must include at least one of the following (if you do more than 1, 
it will make Mr. Messner smile):
Linked List
Queue
Stack
List
If you have additional time, work on adding additional features to 
your application.  
 

You may select any application you would like, but let me throw out a 
few ideas if you need some:

Course Grade Book
Sports Score Tracking System with Roster
Bank Account System
A Text / Messaging System (Network-Based)
 

Reminder: Do not forget to properly document your code. 
This is an industry best practice and expectation.  Failure to do so on graded assignments will result in reduced points.
 * 
 */

import java.util.*;
import java.io.IOException;
public class WeekSeven  {

	public static void main(String[] args) {
		PriorityQueue<Store> itemLocation = new PriorityQueue<Store>(6, new storeComparator());

	// 
	/*
	public String manager;
	public int numberOfWorkers;
	public String department;
	public int aisle;
	public int section;
	public int itemBarcode;
	Player player1 = new Player("Dan", "Pirates", 30, 74, 1, 170);
	teamRoster.add(player1);
	 */
		System.out.println();
		
		Store item1 = new Store("Cindy", 2, "Health and Beauty", 9, 6, 925492);
		itemLocation.add(item1);
		Store item2 = new Store("Karen", 4, "Electronics", 13, 8, 720649);
		itemLocation.add(item2);
		Store item3 = new Store("Dan", 6,"Home and Office", 4, 1, 893170);
		itemLocation.add(item3);
		Store item4 = new Store("Spencer", 8, "Seasonal", 5, 2, 149254);
		itemLocation.add(item4);
		Store item5 = new Store("Jared", 10,"Grocery", 6, 5, 427509);
		itemLocation.add(item5);
	
		
		
	
	System.out.println();
			System.out.println();
		    System.out.println("Choose an opiton: ");
		       System.out.println("1) Find the item's Section");
		       System.out.println("2) Find the item's Aisle");
		       System.out.println("3) Find the Manager");
		       System.out.println("4) Add an item");
		      
		       Scanner scan= new Scanner(System.in);
		       int option = scan.nextInt();
	
		       
		       switch (option){
		       
		       case 1:
		    	   int temp1;
		    	   int p1=item1.section;
		    	   int p2=item2.section;
		    	   int p3=item3.section;
		    	   int p4=item4.section;
		    	   int p5=item5.section;
		    	   
		    	   
		    	   for(int number1 = 0; number1<5; number1++) {
		    		   if(p2<p1) {
		    			   temp1=p1;
		    			   p1=p2;
		    			   p2=temp1;
		    		   }
		    		   if(p3<p2) {
		    			   temp1=p2;
		    			   p2=p3;
		    			   p3=temp1;
		    		   }
		    		   if(p4<p3) {
		    			   temp1=p3;
		    			   p3=p4;
		    			   p4=temp1;
		    		   }
		    		   if(p5<p4) {
		    			   temp1=p4;
		    			   p4=p5;
		    			   p5=temp1;
		    		   }
		    	
		    		   
		    		 
		    	   }
		    	   System.out.println("The item is in the section "+itemLocation.poll().getsection()+ " of the aisle "+ itemLocation.poll().getaisle());
	  
		            break;
		            
		       case 2:
		    	   int temp2;
		    	   int h1=item1.aisle;
		    	   int h2=item2.aisle;
		    	   int h3=item3.aisle;
		    	   int h4=item4.aisle;
		    	   int h5=item5.aisle;
		    	
		    	   
		    	   for(int number2 = 0; number2<5; number2++) {
		    		   if(h2<h1) {
		    			   temp2=h1;
		    			   h1=h2;
		    			   h2=temp2;
		    		   }
		    		   if(h3<h2) {
		    			   temp2=h2;
		    			   h2=h3;
		    			   h3=temp2;
		    		   }
		    		   if(h4<h3) {
		    			   temp2=h3;
		    			   h3=h4;
		    			   h4=temp2;
		    		   }
		    		   if(h5<h4) {
		    			   temp2=h4;
		    			   h4=h5;
		    			   h5=temp2;
		    		   }
		    		
		    		 
		    	   }
		    	   System.out.println("The item is in aisle "+ itemLocation.poll().getaisle());
	  
		            break;
		            
		       case 3:
		    	   String temp3;
		    	   String w1=item1.manager;
		    	   String w2=item2.manager;
		    	   String w3=item3.manager;
		    	   String w4=item4.manager;
		    	   String w5=item5.manager;
		    	
		    	  
		    	   for(int number3 = 0; number3<6; number3++) {
		    		   if(w2!=w1) {
		    			   temp3=w1;
		    			   w1=w2;
		    			   w2=temp3;
		    		   }
		    		   if(w3!=w2) {
		    			   temp3=w2;
		    			   w2=w3;
		    			   w3=temp3;
		    		   }
		    		   if(w4!=w3) {
		    			   temp3=w3;
		    			   w3=w4;
		    			   w4=temp3;
		    		   }
		    		   if(w5!=w4) {
		    			   temp3=w4;
		    			   w4=w5;
		    			   w5=temp3;
		    		   }
 
		    	   }

		    	   System.out.println("The following is the manager to look for to help you with your item: "+ itemLocation.poll().getmanager());
	  
		        
		    	   break;
		            
		       case 4:
		    	   System.out.println("Enter Manager Name");
		    	   Scanner k1 = new Scanner(System.in);
		    	   String newName = k1.next();
		    	 
		    	   
		    	   System.out.println("Enter Department");
		    	   Scanner k3 = new Scanner(System.in);
		    	   String newDepartment = k3.next();
		    	     
		    	   System.out.println("Enter Aisle");
		    	   Scanner k2 = new Scanner(System.in);
		    	   String newAisle = k2.next();
		    	   
		    	   System.out.println("Enter Section");
		    	   Scanner k4 = new Scanner(System.in);
		    	   String newSection = k4.next();
		    	   
		    	   System.out.println("Enter 6-Digit Barcode ID");
		    	   Scanner k5 = new Scanner(System.in);
		    	   String newBarcode = k5.next();
		    	   
		    	  
		
		            break;
		            
		      
		
		
		       
		      
		       }
		       
		       }
		
			
		
		
}
	
	class storeComparator implements Comparator<Store>{
		public int compare(Store item1, Store item2, Store item3, Store item4, Store item5) {
	return 0;
		}
@Override
public int compare(Store o1, Store o2) {
	return 0;
}

	}
	
	

