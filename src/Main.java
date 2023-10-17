
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter car brand:");
        String car_brand = scanner.nextLine();

        System.out.println("Please enter your total distance:");
        int total_distance = scanner.nextInt();

        System.out.println("Please enter your spend per miles:");
        double spend_per_miles = scanner.nextDouble();

        double road_fuel_calcutor = total_distance * spend_per_miles;

        System.out.println("Your Car Brand:" + car_brand);
        System.out.println("Your Total Distance:" + total_distance);
        System.out.println("Your Car spend per miles:" + spend_per_miles);
        System.out.println("Total amount of money:" + road_fuel_calcutor);





    }
}
