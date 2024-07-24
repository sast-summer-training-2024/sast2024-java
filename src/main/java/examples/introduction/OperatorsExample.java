package examples.introduction;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 114;
        int b = 514;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        // int / int = int
        System.out.println("a / b = " + (a / b));
        // int / double = double
        System.out.println("a / b = " + (a / (double) b));

        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("++a = " + (++a));
        System.out.println("b += 100 = " + (b += 100));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));

        int x = -4;
        // Arithmetic shift
        System.out.println("x >> 2 = " + (x >> 1));
        // Logical shift
        System.out.println("x >>> 2 = " + (x >>> 1));

        boolean c = true;
        boolean d = false;
        System.out.println("c && d = " + (c && d));
        System.out.println("c || d = " + (c || d));
        System.out.println("!c = " + (!c));
        System.out.println("c ? 'T' : 'F' = " + (c ? 'T' : 'F'));
    }
}
