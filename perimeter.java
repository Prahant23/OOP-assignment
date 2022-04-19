import java.util.Scanner;
class Perimeter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length:");
        float length=scanner.nextInt();
        float area=length*length;
        float perimeter=4*length;
        System.out.println("The area and perimeter are " +area+"  and "+perimeter+"respectively.");
    }
}

