import java.util.Scanner;

public class HochVier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Input:");
		n=in.nextInt();
		int result=1;
		
		while(result*result*result*result<n){
			result++;
		}
		result-=1;
		int result2=result*result*result*result;
		if(result*result*result*result==n){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		System.out.println(result*result*result*result);
	}

}
