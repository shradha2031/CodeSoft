import java.util.*;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name= sc.next();
        System.out.println("Enter the marks of Math");
        int math=sc.nextInt();
        System.out.println("Enter the marks of Chemistry"); 
        int ch=sc.nextInt();
        System.out.println("Enter the marks of Physics"); 
        int phy=sc.nextInt();
        System.out.println("Enter the marks of PPS");  
        int PPS=sc.nextInt();
        System.out.println("Enter the marks of SME");  
        int SME=sc.nextInt();
        System.out.println("Enter the marks of Mechanics");  
        int mech=sc.nextInt();
        int tot = math+ch+phy+PPS+SME+mech;
        System.out.println("Your total marks are:"+tot);
        int avg = tot/6;
        System.out.println("Your average percentage is:"+avg);
        
       if (avg>=90) {
    	   System.out.println("You got 'A' grade");
       }
       else if(avg>=75) {
    	   System.out.println("You got 'B' grade");
       }
       else if(avg>=50) {
    	   System.out.println("You got 'C' grade");
       }
       else if(avg>=35){
    	   System.out.println("You got 'D' grade");
       }
       else if(avg<=35){
    	   System.out.println("You are Fail");
       }
       else {
    	   System.out.println("Please check again....");
       }
       System.out.println("THANK YOU....");
        	
	}

}
