public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
         // b -> a , c -> b, a -> c
         // b에는 5 , c에는 6 , a에는 7

         int temp;
         temp = b; // 6
         int tempp;
         tempp = c; //7
         b = a; // b에는 a값을 b=5
         c = temp; // c에는 b(temp)값을 c = 6
         a = tempp;
         
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
}