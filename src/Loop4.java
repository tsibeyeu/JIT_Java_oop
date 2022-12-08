public class Loop4 {
    public static void main(String[] args) {
        int n =0;
        int m =2;
        me://using labeled break with while loop.
        while(n<5){
            System.out.println("n = "+n);
            while(m<4){
                if(m==4){
                  break me;
                }
                System.out.println("m = "+m);
                m++;
            }
           n++;
        }
    }
}
