import java.util.Scanner;
class Q4{
    public static void main(String[] args) {
        Scanner ball=new Scanner(System.in);
        int Salary=ball.nextInt();
        if(Salary<=7000){
            System.out.print("provide Scholarship");
        }
        else{
            System.out.print("Salary enough");
        }
    }
}