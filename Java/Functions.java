package Java;

public class Functions {

    static void func1(int num) {
        System.out.println("Value of num is " + num);
    }

    static int func2(int num) {
        return num * 2;
    }

    public static void main(String[] args) {
        func1(10);
        int n = func2(10);
        System.out.println(n);
    }
}
