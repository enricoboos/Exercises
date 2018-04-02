
import java.util.Scanner;
public class Sternchen {
  public static void main(String[] args) {
  // Write your code here
  Scanner in = new Scanner(System.in);
  int n=in.nextInt();
  String s="";
  for(int i=0;i<n;i++){
    s=s+"*";
  }
  System.out.println(s);
  
  for(int i=0; i<n ; i++){
	  System.out.println(s);
	  s=s.replaceFirst("*", " ");
	  
  }
 }
}