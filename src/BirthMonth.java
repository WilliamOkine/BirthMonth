import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your birth month (1 -12): ");
        int birthMonth = scan.nextInt();
        if (birthMonth >= 1 & birthMonth <= 12) {
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }

}