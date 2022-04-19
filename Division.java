import java.util.Scanner;
class Division {
    public static void main(String[] args) {
        int a,b,sum,product,division;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        sum=a+b;
        product=a*b;
        division=a/b;
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The division is "+division);

    }
}


