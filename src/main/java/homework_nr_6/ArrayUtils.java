package homework_nr_6;

public class ArrayUtils {
    public static void main(String[] args) {
        int[] arr = new int[]{-5,7,345,-3234,0};
        int[] arrnull = new int[0];
        System.out.println("Max is " + ArrayUtils.findMax(arrnull));
        System.out.println("Min is " + ArrayUtils.findMin(arrnull));
    }
    public static int findMax(int[] numbers){
        if(numbers.length == 0) return 0x80000000;
        int res = numbers[0];
        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] > res) res = numbers[i];
        return res;
    }
    public static int findMin(int[] numbers){
        if(numbers.length == 0) return 0x7FFFFFFF;
        int res = numbers[0];
        for(int i = 1; i < numbers.length; i++)
            if(numbers[i] < res) res = numbers[i];
        return res;
    }
}
