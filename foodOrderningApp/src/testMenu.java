

import java.util.Scanner;
public class testMenu {

	public static void main(String[] args) {
		int dosa =40,samosa=20,rice=80,noodels=120;
		int totalBill,bill1 = 0,bill2 = 0, bill3 = 0,bill4 = 0;;
		
	   System.out.println("*********Menu*********");
	   System.out.println("Menu: \n1.Dosa \n2.samosa \n3.Rice \n4.Noodles \n5.GenerateBill \n6.Exit");
	   
	   Scanner sc = new Scanner(System.in);
	   
	   boolean exit = false;
	   while(!exit) {
	   switch(sc.nextInt()) {
	   
	   case 1 : System.out.println(" DOSA@40 - Enter quantity ");
	     int quantDosa=sc.nextInt();
	     if(quantDosa>0) {
	    	 bill1= quantDosa * dosa ;
	    	 
	    	 
	    	 
		    	 System.out.println("Bill:" + bill1);
	     }
	     else{System.out.println("Give Order Or Choose something Else!!"); 
	      }
	     break;
	     
	   case 2: System.out.println(" Samosa@20 - Enter quantity ");
	     int quantSamosa=sc.nextInt();
	    
	     if(quantSamosa>0) {
	    	 bill2= quantSamosa * samosa ;
	    	 System.out.println("Bill:" + bill2);
	     }
	     else{System.out.println("Give Order Or Choose something Else!!"); 
	    	 }
	     break; 
	   
	   case 3: System.out.println(" Rice@80 - Enter quantity");
	     int quantRice=sc.nextInt();
	    
	     if(quantRice>0) {
	    	 bill3= quantRice * rice ;
	    	 System.out.println("Bill:" + bill3);
	     }
	     else{System.out.println("Give Order Or Choose something Else!!"); 
	    	 }
	     break; 
	     
	   case 4 :  System.out.println(" Noodles@120 - Enter quantity ");
	     int quantNoodles=sc.nextInt();
	    
	     if(quantNoodles>0) {
	    	 bill4= quantNoodles * noodels ;
	    	 System.out.println("Bill:" + bill4);
	     }
	     else{System.out.println("Give Order Or Choose something Else!!"); 
	    	 }
	     break; 
	     
	   case 5 :   System.out.println("Enter coupon if you have else you miss discount ");
	   System.out.println("enter code to get 20% instant discount");
	   String coupon = sc.next();
	   String code = "food@20";
	    if(  code.equals(coupon) ) {
	   totalBill= bill1 + bill2 + bill3 + bill4 ;
	   
	   double discountedBill = (totalBill -(totalBill * 20) /100)  ;// Discount of 20 %
	    System.out.println("Discount applied Total Bill :" + discountedBill);
	    
	    }else{
	    	 totalBill= bill1 + bill2 + bill3 + bill4 ;
	 	    System.out.println("Wrong Code please check you coupon or pay Total Bill :" + totalBill);
	    }break; 
		   
	     
	   case 6 : if(exit=true) {
		   System.out.println("****ThankYou****");
	   }
	   }
	   
	}   
	   
	}
	   
}

