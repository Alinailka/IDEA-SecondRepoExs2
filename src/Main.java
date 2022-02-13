public class Main {
    public static void main(String[] args) {
        int amount = 300;
        int depositAmount = 10000;
        boolean depositAmount1000 = true;
        int totalAmount = depositAmount1000 ? depositAmount / 100 + amount + depositAmount : depositAmount + amount;
        System.out.println("Итоговый баланс:" + totalAmount);
        int bonus = depositAmount1000 ? depositAmount / 100 : 0;
        System.out.println("Вам начислены бонусы в размере:" + bonus);
    }
}