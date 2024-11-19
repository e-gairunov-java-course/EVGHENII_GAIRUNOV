package homework_nr_7;

public class Date {
    private int day;
    private int month;
    private int year;
    private boolean isAC;
    private boolean isCorrect;
    private static final String[] months = {"January", "February", "March", "April",
    "May", "June", "July", "August", "September", "October", "November", "December"};
    private static final int[] numOfDays = {31,28,31,30,31,30,31,31,30,31,30,31};

    public Date(int day, int month, int year) {
        calcYear(year);
        this.month = month;
        this.day = day;
        check();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
            this.day = day;
            check();
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        check();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        calcYear(year);
        check();
    }

    private void calcYear(int year){
        if(year < 1){
            this.year = -year + 1;
            isAC = false;
        }
        else{
            this.year = year;
            isAC = true;
        }
    }

    private boolean isLeap(){
        if(this.year % 400 == 0) return true;
        if(this.year % 100 == 0) return false;
        return this.year % 4 == 0;
    }

    private int numberOfDays(){
        if(this.month == 2) return this.isLeap() ? 29 : 28;
        return numOfDays[month];
    }
    private void check(){
        isCorrect = month >= 1 && month <= 12;
        if(day < 1 || day > numberOfDays()) isCorrect = false;
    }

    public void displayDate(){
        if(!isCorrect){
            System.out.println("\nIncorrect date");
            return;
        }
        System.out.println("\nDate is: " + day + "/" + month + "/" + year + (isAC ? "" : " B.C."));
    }

    public void displayDateText(boolean text){
        if(!isCorrect){
            System.out.println("\nIncorrect date");
            return;
        }
        System.out.print("\nDate in " + (text ? "text" : "numerical") + " format is: ");
        System.out.print(day + (text ? " " + months[month-1] + " " : "/" + month + "/") + year);
        System.out.println(isAC ? "" : " B.C.");
    }

    public static void main(String[] args) {
        Date date = new Date(1,1,100);
        date.setDay(29);
        date.setMonth(2);
        date.setYear(-399);
        date.displayDate();
        date.displayDateText(true);
    }
}
