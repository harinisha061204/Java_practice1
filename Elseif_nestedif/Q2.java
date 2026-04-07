import java.util.Scanner;
class Q2{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double s1=sc.nextDouble();
       double s2=sc.nextDouble();
       double s3=sc.nextDouble();
       double s4=sc.nextDouble();
       double s5=sc.nextDouble();
       double avg=s1+s2+s3+s4+s5;
       double total=avg/5;
       if(total<35){
        System.out.println("Additional class is required");
       }
       else{
        System.out.println("You good to go");
       }

    }
}