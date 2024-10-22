package weekFour;
import weekThree.WeekThree;

public class WeekFour {
    WeekThree weekThree = new WeekThree();

    public void run() {
        if (weekThree.inputString("would you like to run weekFour methods (y/n)? ").equals("y")) {
            switch (weekThree.inputInt("Which weekFour function would you like to run? ")) {
                case 1:
                    exerciseOne();
                    break;
                case 2:
                    exerciseTwo();
                    break;
                case 3:
                    exerciseThree();
                    break;
                case 4:
                    exerciseFour();
                    break;
                case 5:
                    exerciseFive();
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
    public void exerciseOne() {
        // display "greater" if the first integer is greater than the second  and "smaller or equal" otherwise.
        int one  = weekThree.inputInt("Please enter integer One: ");
        int two  = weekThree.inputInt("Please enter integer Two: ");
        if (one > two) {
            System.out.println("greater");
        } else {
            System.out.println("smaller or equal");
        }
    }
    public void exerciseTwo() {
        // Displays the sum of 1 + 2... + n, where n = input int
        int positiveInt;
        while (true) {
            positiveInt = weekThree.inputInt("Please enter a positive integer: ");
            if (positiveInt >= 0) {
                break;
            } else {
                System.out.println(positiveInt + " is not a integer");
            }
        }
        int sum = 0;
        for (int i = 1; i <= positiveInt; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void exerciseThree() {
        // Write a program which asks the user to enter an integer until this integer is negative.
        int integer = 0;
        while (integer >= 0) {
            integer = weekThree.inputInt("Please enter an integer: ");
        }
    }

    public void exerciseFour() {
        // enter a month and displays the corresponding number month.
        String[] Month  = {
                "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"
        };
        String inputMonth = weekThree.inputString("Please enter a month: ").toUpperCase();
        for (int i = 1; i <= Month.length; i++) {
            if (Month[i-1].equals(inputMonth)) {
                System.out.println(i);
                break;
            }
        }
    }

    public void exerciseFive() {
        // enter integer n and enter n additional int values then display the sum n1 - n2 + n3 - n4 +…
        int n = weekThree.inputInt("Please enter an integer: ");
        int[] inputs = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            inputs[i] = weekThree.inputInt("Please enter an integer: ");
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum += inputs[i];
            } else {
                sum -= inputs[i];
            }
        }
        System.out.println(sum);
    }
}
