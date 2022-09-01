import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
     int hours,minutes;
//24 is the hours
     int total1=days*24;
//60 is minutes 
     int total2=total1*60;
//60 is seconds
     int total3=total2*60;
     
     System.out.println(total3);
     
        
    }
}
