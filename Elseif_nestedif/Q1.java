import java.util.Scanner;
class Q1{
    public static void main(String[] args){
        Scanner nisha=new Scanner(System.in);
        int Score=nisha.nextInt();
        if(Score<50){
            System.out.print("You need to improve");
        }
        else if(Score>=50&&Score<=70){
            System.out.print("Good Luck");
        }
        else if(Score>90){
            System.out.print("Excellent");
        }
    }
}