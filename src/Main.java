public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int amount = 100; // начальная сумма
        int replenishment = 1300; // сумма пополнения
        int account = amount + replenishment; // баланс


        if (account > 1000) {
            int procent = (account /  100 * 1);
            System.out.println("Итоговый бонус" + procent);
        }
        else{
            System.out.println("Итоговый бонус" + 0);
        }

        System.out.println("Bay");
    }

}
