import java.util.Scanner;

public class Recurring {

    static final int ASCII_SIZE = 258;
private static void findMaxrecurringchar(String s){
        int count[] = new int[ASCII_SIZE];
        int len = s.length();
        for(int i = 0; i<len; i++)
           count[s.charAt(i)]++;
        int max = -1;
        char result = ' ';
        for(int i=0; i < len; i++){
            if(max < count[s.charAt(i)]){
                max = count[s.charAt(i)];
                result = s.charAt(i);
            }
        }
    System.out.println(result);

}   public static void main(String[] args){
    System.out.println("Enter a string");
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    findMaxrecurringchar(s);
}
}


    

