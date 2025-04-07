import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Unicode points

        String text = "Hi 😊 你";
        text.codePoints().forEach(
                i ->{
                    System.out.println(
                            "the code point for "+ i +" =" + new String(Character.toChars(i))
                    );
                }
        );

        System.out.println( "the fibonacci of 10 is \n"+Arrays.toString(fibonacci(10)));
        System.out.println(reverse("Hello"));
        palindrome("madam");
    }

    public static int[] fibonacci(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];

        }
        return fib;
    }

    public  static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static  void palindrome(String s){
        String reverse = reverse(s);
        if (s.equals(reverse)){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("the string is not palindrome");
        }
    }
}