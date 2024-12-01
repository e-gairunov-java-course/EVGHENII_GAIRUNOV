package homework_nr_12;

public class HW12 {
    public static void main(String[] args) {
        Months[] months = Months.values();
        for (Months month : months) {
            System.out.println(month);
        }

        System.out.println("\n\n");
        FuelTypes[] fuels = FuelTypes.values();
        for (FuelTypes fuel : fuels) {
            System.out.println(fuel + (fuel.isLiquidFuel() ? " is " : " isn't ") + "liquid fuel.");
        }

        System.out.println("\n\n");
        CheckInteger[] checks = CheckInteger.values();
        Integer[] numbers = new Integer[]{1, 3, 6, -5, -10, 12, -78};
        for (CheckInteger check : checks) {
            System.out.println("--Filtering by " + check);
            for (Integer number : numbers) {
                if (check.test(number)) System.out.println(number);
            }
        }
    }
}
