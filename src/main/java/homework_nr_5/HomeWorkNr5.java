package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
        }
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        int sumOfEven = 0;
        long prodOfOdd = 1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 != 0) prodOfOdd *= numbers[i];
            else sumOfEven += numbers[i];
        }
        System.out.println("\n\n\nSum of even is " + sumOfEven + "\nProd of odd is " + prodOfOdd);
        int[] copyNumbers = new int[100];
        for (int i = 0; i < copyNumbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }
        //Outputting copyNumbers to use it somehow in the program
        System.out.println("\n\n\nOutputting copyNumbers to use it somehow in the program:");
        for (int copyNumber : copyNumbers) {
            System.out.println(copyNumber);
        }
    }
}
