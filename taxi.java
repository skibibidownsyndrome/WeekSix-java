//George Lupu 3/10/2025
import java.util.*;
public class taxi {

public static void main(String[]args){

    int cabs;
    int passengers;
    int remaining;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter amount of passangers: ");
    passengers = input.nextInt();

    cabs = passengers / 4;
    remaining = passengers % 4;

    System.out.println(cabs + " cabs are require");
    System.out.println(remaining + " passangers(s) will be left over ");





    }

}