
import java.util.Scanner;

public class workb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address=scanner.nextLine();
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);


    }
}