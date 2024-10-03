import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int tempC = 0;
        double tempF = 0.0;
        boolean validTemp = false;

        do {

            System.out.print("Enter a temperature in Celsius: ");
            if (in.hasNextInt()) {
                tempC = in.nextInt();
                in.nextLine();
                if (tempC == 0) {
                    tempF = 32;
                    System.out.println("The temperature you input, " + tempC +
                            ", is the freezing point of water, " +
                            "which is " + tempF + " degrees in Fahrenheit");
                    validTemp = true;
                } else if (tempC == 100) {
                    tempF = 212;
                    System.out.println("The temperature you input, " + tempC +
                            ", is the boiling point of water, " +
                            "which is " + tempF + " degrees in Fahrenheit");
                    validTemp = true;
                } else {
                    tempF = (tempC * ((double) 9 / 5)) + 32;
                    System.out.println("The temperature you input, " + tempC +
                            ", is " + tempF + " degrees in Fahrenheit");
                    validTemp = true;
                }
            } else {
                System.out.println("Please enter a valid temperature");
                in.nextLine();
            }
        } while (!validTemp);
    }
}