public class Main {
    public static void main(String[] args) {

        int startingBalance = 100; //Начальный счет
        int replenishmentAmount = 1100; //Сумма пополнения
        int bonus; //Сумма бонусов
        int balance; //Общий баланс
        if (replenishmentAmount >= 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        
        System.out.println(balance = startingBalance + replenishmentAmount + bonus);

    }
}