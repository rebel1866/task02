package by.epamtc.stanislavmelnikov.task02.entity;

public class Ball {
    private String color;
    private double weight;

    public Ball() {
    }

    public Ball(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        int prime = 31;
        return (int) (prime * weight + ((null == color) ? 0 : color.hashCode()));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (null == obj) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Ball ball = (Ball) obj;
        if (weight != ball.weight) {
            return false;
        }
        if (null == color) {
            return color == ball.color;
        } else {
            if (!color.equals(ball.color)) {
                return false;
            }
        }
        return true;
    }
}
