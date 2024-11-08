package homework_nr_3;

//HW3 point 3
public class HomeWork3 {
    public static void main(String[] args) {
        //HW3 point 4
        System.out.println("\n\nHomework 3 point 4:");
        int month = 0;
        switch (month)
        {
            case 0: System.out.println("Champaign&Olivier party");break;
            case 1: System.out.println("January");break;
            case 2: System.out.println("February");break;
            case 3: System.out.println("March");break;
            case 4: System.out.println("April");break;
            case 5: System.out.println("May");break;
            case 6: System.out.println("June");break;
            case 7: System.out.println("July");break;
            case 8: System.out.println("August");break;
            case 9: System.out.println("September");break;
            case 10: System.out.println("October");break;
            case 11: System.out.println("November");break;
            case 12: System.out.println("December");break;
            default: System.out.println("Invalid month number");
        }
        //HW3 point 5
        System.out.println("\n\nHomework 3 point 5:");
        for(int i = 100; i <= 1000; i++)
            if(i % 5 == 0) System.out.println(i);
        //HW3 point 6
        System.out.println("\n\nHomework 3 point 6:");
        float sum = 0F;
        for(int i = 1, j = 3; i < 98; i += 2, j += 2, sum += ((float) i )/ j);
        System.out.println("Sum is " + sum);

    }
}
