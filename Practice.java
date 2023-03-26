import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String a = "hi";
        String b = "hi";
        String c = new String("hi");
        String d = "h" + "i";
        String e = new String("h") + "i";

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(a == b);             // true
        System.out.println(a == c);             // false
        System.out.println(b == c);             // false
        System.out.println(a == d);             // true
        System.out.println(a == e);             // false
        System.out.println(d == e);             // false


        System.out.println(a == input);         // hi 입력 시 false
        System.out.println("hi".equals(input)); // hi 입력 시 true
    }
}
