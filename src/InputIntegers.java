import java.util.Scanner;

public class InputIntegers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		System.out.print("Input a number: ");
	    int n1 = in.nextInt(); 	
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    
	    if(n1%10==n2%10 ||n2%10==n3%10 || n1 % 10 == n3 % 10){
	    	System.out.println("true");
	    }
	    else{
	    	System.out.println("false");
	    }
	}
}
