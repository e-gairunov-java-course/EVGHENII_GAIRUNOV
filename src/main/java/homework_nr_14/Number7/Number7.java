package homework_nr_14.Number7;

public class Number7 {
    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit){
        if(inferiorLimit > superiorLimit) throw new InvalidRangeException("The inferior limit is higher than the superior limit.");
        int num;
        num = superiorLimit / 7 - inferiorLimit / 7;
        if(inferiorLimit % 7 == 0) num++;
        return num;
    }

    public static void main(String[] args) {
        int inf = 7;
        int sup = 16;
        int a = countDivisibleBy7Numbers(inf,sup);
        System.out.println("Number of divisible by 7 is " + a);
        if(a > 0)
            for (int i = inf; i <= sup; i++) {
                if(i % 7 == 0) System.out.println(i);
            }
    }
}
