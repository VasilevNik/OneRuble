public class Main {
    public static void main(String[] args) {
        int balance = 530; // стартовый баланс
        int replenishment = 1102; // сумма пополнения
        int fix = 100; // полные 100 рублей пополнения для начисления 1-го рубля

        int bonus; // условие начисления бонуса
        if (replenishment >= 1001) {
            bonus = (replenishment / fix);
        } else {
            bonus = 0;
        }

        System.out.println("Начисленный бонус - " + bonus + " руб.");
        System.out.println("Итоговый баланс - " + (balance + replenishment + bonus) + " руб.");

    }
}