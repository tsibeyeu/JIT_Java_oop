public class Loop5 {
    public static void main(String[] args) {
        int number =5;
        long factorial = 1;
        int i= 1;
        for(;i<=number;){
           factorial *=i;
           i++;
        }
        System.out.println("factorial of "+number+"= "+factorial);

}
}
