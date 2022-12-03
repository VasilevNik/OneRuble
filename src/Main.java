public class Main {
    public static void main(String[] args) {
        int balance = 530; // стартовый баланс
        int popolnenie = 1345; // сумма пополнения
        int fix = 100;

        int bonus;
        if (popolnenie>=1000) {
            bonus = (popolnenie/fix);
        } else {
            bonus=0;
        }

        System.out.println("Начисленный бонус - " + bonus + " руб.");
        System.out.println("Итоговый баланс - " + (balance + popolnenie + bonus) + " руб.");

    }
}