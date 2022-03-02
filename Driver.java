//Dereck Helms
//10/26/21
//CSC119002
import java.util.Scanner; //importing scanner
public class Driver { //initializing driver
    public static void main(String[] args) { //psvm
        System.out.println("How many rows do you want in your pattern: "); //prompting user
        DiamondPattern pattern1 = new DiamondPattern(); //creating new object under class DiamondPattern
        Scanner sc = new Scanner(System.in); //creating new Scanner object sc
        int userRows = sc.nextInt(); //creating new variable to take user input
        pattern1.displayDiamond(userRows); //printing pattern

    }
}
