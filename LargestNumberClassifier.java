package knightingale;

public class LargestNumberClassifier {

	 public static void main(String[] args) {
	 double n1 = -1.5, n2 = 2.5, n3 = 3.5; 
	 if( n1 >= n2 && n1 >= n3) 
	 System.out.println(n1 + " is the largest number."); 
	 else if (n2 >= n1 && n2 >= n3) 
	 System.out.println(n2 + " is the largest number."); 
	 else
	 System.out.println(n3 + " is the largest number."); 
	 } 
}