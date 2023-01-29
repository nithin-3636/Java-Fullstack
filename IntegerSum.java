import java.util.Scanner;  
public class IntegerSum {  
    public static void main(String[] args) {  
      System.out.println("Enter the Two numbers for addtion: ");  
      Scanner readInput = new Scanner(System.in);  
      int a = readInput.nextInt();  
        int b = readInput.nextInt();  
        readInput.close();  
  if(a==b){
    System.out.println((a+b)*2);
  }
  else{
    System.out.println(a+b);
  }
    }
}