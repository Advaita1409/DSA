import java.util.*;
public class Day {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week in number 1 to 5");
        int day = sc.nextInt();

        switch (day) {
            case 1:System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;   
            case 3: System.out.println("Wednesday");
                break;    
            case 4: System.out.println("Thursday");
                break;    
            case 5: System.out.println("Friday");
                break;    
        
            default: System.out.println("Not a weekday");
                break;
        }

    }
}
