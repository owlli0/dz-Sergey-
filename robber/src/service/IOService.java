package service;

import Units.Unit;

import java.util.Scanner;

public class IOService {
    private Scanner in;

    public IOService() {
        this.in = new Scanner(System.in);
    }

    public void printUnitState(int teamNumber, Unit unit) {
        System.out.println("Юнит команды № " + teamNumber);
        System.out.println("Информация о классе " + unit.getClass().getName());
        unit.printInfo();
        System.out.println("=========================================");
    }

    public int getNumberUnit() {
        System.out.println("Введите количество юнитов в каждой команде: ");
        return in.nextInt();
    }

    public void win(int teamNumber) {
        System.out.println("**************************");
        System.out.println("Победила команда № " + teamNumber);
        System.out.println("**************************");
    }
}
