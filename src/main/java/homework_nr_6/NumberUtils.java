package homework_nr_6;

public class NumberUtils {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0,-34,-54,-3,24234,19,83,97};
        NumberUtils.findPrimesInArray(arr);
    }
    public static boolean isPrime(int number){
        if(number < 2) return false;
        int sq = (int) Math.floor(Math.sqrt(number));
        for(int i = 2; i <= sq; i++)
            if(number % i == 0) return false;
        return true;
    }
    public static void findPrimesInArray(int[] numbers){
        for (int number : numbers) if (NumberUtils.isPrime(number)) System.out.println(number);
    }
}
