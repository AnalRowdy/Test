package org.example;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank();
        tank.goForward(10);
        tank.printPosition();
        tank.turnRight();
        tank.goForward(50);
        tank.printPosition();
        tank.turnLeft();
        tank.goBackward(100);
        tank.printPosition();
        tank.printPosition();
        System.out.println(1);
    }
}