public class Main {
    public static void main(String[] args) {
        isDifferent('B', 'Z');
    }
    public static void isDifferent(char a, char b) {
        boolean result = a != b;
        System.out.println("I due caratteri sono: " + a + " e " + b + " e sono diversi?");
        System.out.println(result);
    }
}