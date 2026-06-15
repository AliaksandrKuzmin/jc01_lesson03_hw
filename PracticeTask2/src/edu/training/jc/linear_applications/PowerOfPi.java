package edu.training.jc.linear_applications;

public class PowerOfPi {
    static void main() {
        double power;

        for (int i = 1; i < 5; i++) {
            power = Math.pow(Math.PI, i);
            System.out.println("PI в степени " + i + " равно: " + power);
        }
    }
}
