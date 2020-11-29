public class Main1 {
    public static void main(String[] args) {
        int deposit = 1700;
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        int initial = 100;
        int overall = initial + deposit + bonus;
        System.out.println(overall);
    }
}
