import java.util.Scanner;
class Q4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double mark=sc.nextDouble();
        sc.nextLine();
        String dept=sc.nextLine();
        System.out.println("Name "+name);
        System.out.println("Mark "+mark/10+"/10");
        System.out.println("department "+dept);

    }
}