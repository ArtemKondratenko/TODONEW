public class Main {
    public static void main(String [] args) {
        BonusMilesService service = new BonusMilesService();

        int numberMilesFirstPurchase = service.calculate(50_000);
        System.out.println("Ваше количество миль: "+numberMilesFirstPurchase);

        int numberMilesSecondPurchase = service.calculate(10_000);
        System.out.println("Ваше количество миль: "+numberMilesSecondPurchase);

        int numberMilesThirdPurchase = service.calculate(5_000);
        System.out.println("Ваше количество миль: "+numberMilesThirdPurchase);

        int numberMilesFourthPurchase = service.calculate(1_000);
        System.out.println("Ваше количество миль: "+numberMilesFourthPurchase);

    }
}