import java.util.Scanner;
class Q5{
    public static void main(String[] args) {
        Scanner fan=new Scanner(System.in);
        int nums=fan.nextInt();
        if(nums%3==0&&nums%5==0){
            System.out.print("nums divided by 3 and 5");
        }
        else{
            System.out.print("not divided");
        }
    }
}