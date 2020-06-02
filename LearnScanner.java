import java.util.Scanner ;
public class LearnScanner {

    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("wassup wuss yo full name");
        String name = input.nextLine();
        System.out.print("aight then " + name+ " where do you wanna go? ");
        String place = input.nextLine();
        System.out.print("i see so youre trying to goto " + place + " " + "\n");
        System.out.print("******************************" + "\n");
        travelbudget();
        timedifference();
        countryarea();
    }

    public static void travelbudget() {
        System.out.print("so how many days are you staying there?");
        int days = input.nextInt();

        System.out.print("total budget in USD?");
        int budget = input.nextInt();

        System.out.print("what is the currency name of your country?");
        String name = input.next();

        System.out.print("how many " + name + " is equal to 1 dollar?");
        double conversion = input.nextDouble();

        int days1 = days*24;
        int days2 = days*1440;
        System.out.print("the amount of time you are staying is around " + days1 + " hours or around " + days2 + "\n");

        int bpd = budget/days;
        System.out.print("the amount of money you can spend each day is:" + bpd + "USD" + "\n");

        double equiv = bpd*conversion;
        System.out.print("your daily budget in " + name + "is equivalent to " + equiv + name + "\n");

        System.out.print("******************************" + "\n");

    }

    public static void timedifference() {
        System.out.print("what is the time difference between your home and your destination");
        int diff = input.nextInt();

        if(diff >= 24) {
            diff %= 24;
        }

        int diffmid = 0 + diff;
        int diffnoon = 12 + diff;

        System.out.print("at midnight, it will be " + diffmid + ":00 AM at your destination and at noon it will be " + diffnoon + ":00 PM at your destination\n" );
        System.out.print("*****************************\n");

    }

    public static void countryarea() {
        System.out.print("what is the size of your destination country in km^2?");
        double size = input.nextDouble();

        double sizem = size*0.386;

        System.out.println("the size of your destination country in miles^2 is equal to " + sizem );

    }


}
