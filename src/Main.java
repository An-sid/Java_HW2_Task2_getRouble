public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addition = 1100;
        int bonus = 0;
        if (addition > 1000) {
            bonus = addition / 100;
        } else {
            bonus = 0;
        }
        int totalBalance = balance + addition + bonus;
        System.out.println(totalBalance);
    }
}