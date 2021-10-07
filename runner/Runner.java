package by.epamtc.stanislavmelnikov.task02.runner;

import by.epamtc.stanislavmelnikov.task02.output.ConsoleOutput;
import by.epamtc.stanislavmelnikov.task02.input.DataScanner;
import by.epamtc.stanislavmelnikov.task02.entity.Ball;
import by.epamtc.stanislavmelnikov.task02.entity.Basket;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        DataScanner dataScanner = new DataScanner(consoleOutput);
        List<Ball> ballList = dataScanner.enterBallsInfo();
        Basket basket = new Basket();
        basket.fillBasket(ballList);
        double totalWeight = basket.countTotalWeight();
        consoleOutput.printTotalWeight(totalWeight);
        consoleOutput.printChooseColorMessage();
        String targetColorOfBall = dataScanner.enterColor();
        int amountBallsByColor = basket.countBallsAmountByColor(targetColorOfBall);
        consoleOutput.printAmountBallsByColor(targetColorOfBall, amountBallsByColor);
    }
}
