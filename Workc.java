import java.util.Scanner;

class Workc{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter length:");
        int l=scanner.nextInt();
        int volume=l*l*l;
        System.out.println("Volume of cube is "+ volume);

    }
}