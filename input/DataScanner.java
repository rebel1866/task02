package by.epamtc.stanislavmelnikov.task02.input;

import by.epamtc.stanislavmelnikov.task02.entity.Ball;
import by.epamtc.stanislavmelnikov.task02.output.ConsoleOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataScanner {
    private ConsoleOutput consoleOutput;
    private final String EXIT_COMMAND = "E";

    public DataScanner(ConsoleOutput consoleOutput) {
        this.consoleOutput = consoleOutput;
    }

    public List<Ball> enterBallsInfo() {
        List<Ball> balls = new ArrayList<>();
        consoleOutput.printExitMessage();
        for (; ; ) {
            String color = enterColor();
            if (isExitCommand(color)) break;
            String weightString = enterWeight();
            if (isExitCommand(weightString)) break;
            double weight;
            try {
                weight = Double.parseDouble(weightString);
            } catch (NumberFormatException e) {
                consoleOutput.printWrongDataInputMessage();
                continue;
            }
            balls.add(new Ball(color, weight));
        }
        return balls;
    }

    public boolean isExitCommand(String command) {
        return command.equalsIgnoreCase(EXIT_COMMAND);
    }

    public String enterColor() {
        consoleOutput.printColorRequestMessage();
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        return color;
    }

    public String enterWeight() {
        consoleOutput.printWeightRequestMessage();
        Scanner scanner = new Scanner(System.in);
        String weight = scanner.nextLine();
        return weight;
    }
}
