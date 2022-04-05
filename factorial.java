import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {  
          
int fact = 1;  
        int i = 1;  
  
         
        Scanner sc = new Scanner(System.in);  
  
      
        System.out.println("Enter a number whose factorial is to be found: ");  
        int num = sc.nextInt();  
          
          
        do {  
            fact = fact * i;   
            i++;   
        } while( i <= num );  
  
        
        System.out.println("\nFactorial of " + num + " is: " + fact);  
    }  
}  