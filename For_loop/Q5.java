class Q5{
    public static void main(String[] args) {
      int  count=0;
        for(int i=1;i<=100;i++){
            if( i%3==0&& i%5==0){
                System.out.println(i);
            }
        }
        System.out.print("count "+count);
    }
}