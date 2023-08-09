public class Main {
    public static void main(String[] args) {

        int StartingBalance = 100; //Начальный счет
        int ReplenishmentAmount = 1100; //Сумма пополнения
        int bonus; //Сумма бонусов
        int balance; //Общий баланс
        if (ReplenishmentAmount >= 1000) {
            bonus = ReplenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        System.out.println(balance = StartingBalance + ReplenishmentAmount + bonus);

    }
}