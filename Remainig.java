import java.util.Scanner;
class Simple {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principle:");
        int p=scanner.nextInt();
        System.out.println("Enter time:");
        int t=scanner.nextInt();
        System.out.println("Enter rate:");
        int r=scanner.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("The simple interest is "+ SI);
    }
}
class Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number in square:");
        float num=scanner.nextFloat();
        float square=num*num;
        System.out.println("The sqaure of num "+ square);

    }
}
class stud {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=scanner.nextLine();
        System.out.println("Enter your roll number:");
        int roll=scanner.nextInt();
        System.out.println("Enter your field of interest");
        String fields=scanner.nextLine();
        System.out.println("My name is " + name);
        System.out.println("My roll number is "+ roll);
        System.out.println("My field interest is " +fields);

    }
}
class Subjects {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello Robert");
        System.out.println("Enter your marks in three subjects:");
        System.out.println("First subject:");
        float first=scanner.nextFloat();
        System.out.println("Second subject:");
        float second=scanner.nextFloat();
        System.out.println("Third subject:");
        float third=scanner.nextFloat();
        float total=first+second+third;
        float percentage=total/3;
        System.out.println("Your total marks is "+total+".\nPercenatge is "+percentage+".");
    }
}
class Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        System.out.println("Enter third number:");
        c=scanner.nextInt();
        String result=(a==b&&b==c)?"All the numbers are equal!!":(a==b)?"First and second numbers are equal!!":(a==c)?"First and third number are equal!!":(b==c)?"Second and third number are equal!!":"ALl the numbers are different!!";
        System.out.println(result);
    }
}
class Tria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base:");
        float b = scanner.nextInt();
        System.out.println("Enter height:");
        float h = scanner.nextInt();
        float area = (b * h) / 2;
        System.out.println("Area of traingle is " + area);
    }
}
class TwoInputs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a:");
        int num1= scanner.nextInt();
        System.out.println("b:");
        int num2= scanner.nextInt();
        int num3= num1+num2;
        int num4=num1*num2;
        System.out.println("sum of two integers is "+ num3);
        System.out.println("product of two integers is "+ num4);

    }
}
class Twostring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string:");
        String first=scanner.nextLine();
        System.out.println("Enter second string:");
        String second=scanner.nextLine();
        String third=first+second;
        System.out.println("Two strings are: "+third);

    }
}
class Variables {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Enter first number:");
        a=scanner.nextInt();
        System.out.println("Enter second number:");
        b=scanner.nextInt();
        String result=(a<50&&a<b)?"Both condition are true!!":"Both condition are not true!!";
        System.out.println(result);
    }
}
