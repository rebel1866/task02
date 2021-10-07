package by.epamtc.stanislavmelnikov.task02.output;

public class ConsoleOutput {
    public void printWeightRequestMessage() {
        System.out.println("Enter weight:");
    }

    public void printColorRequestMessage() {
        System.out.println("Enter color:");
    }

    public void printExitMessage() {
        System.out.println("Enter E to exit.");
    }

    public void printWrongDataInputMessage() {
        System.out.println("You've entered wrong data. Try again.");
    }

    public void printTotalWeight(double totalWeight) {
        System.out.println("Total weight of all balls: " + totalWeight);
    }

    public void printAmountBallsByColor(String color, int amount) {
        System.out.println("Amount of " + color + " balls is: " + amount);
    }

    public void printChooseColorMessage() {
        System.out.println("Choose color of balls, that you want to count: ");
    }
}
