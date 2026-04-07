import java.util.Scanner;
class Q2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[5];   
        for(int i=0;i<5;i=i+1){
            nums[i]=sc.nextInt();
           // System.out.println(nums[i]);
            
        }
        for(int i=0;i<5;i++){
            System.out.println(nums[i]);
        }
      
        //System.out.println(nums[1]);
        //System.out.println(nums[2]);
        //System.out.println(nums[3]);
        //System.out.println(nums[4]);
    }
}