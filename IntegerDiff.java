import java.util.Scanner;  
public class IntegerDiff {  
    public static void main(String[] args) {  
      System.out.println("Enter the numbers: ");  
      Scanner readInput = new Scanner(System.in);  
      int a = readInput.nextInt();  
        readInput.close();  
        int b=21;
  if(a<=b){
    System.out.println(b-a);
  }
  else{
    System.out.println(-2*(b-a));
  }
    }
}