import java.util.Scanner;
class Q4{
    public static void main(String[] args) {
        Scanner nisha=new Scanner(System.in);
        int a=nisha.nextInt();
        int b=nisha.nextInt();
        int count=0;
        for(int i=a;i<=b;i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }
        }
        System.out.print("Count "+count);
    }
}