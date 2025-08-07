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
//        System.out.println("Информация о классе " + unit.getClass().getName());
        unit.printInfo();
        System.out.println("=========================================");
    }

    public int[] getRange() {

        int[] fromTill = new int[2];

        int a = in.nextInt();
        int b = in.nextInt();
        fromTill[0] = a;
        fromTill[1] = b;

        return fromTill;
    }

    public void printMessHpRange(String type) {
        System.out.println("Введите диапозон ХП для " + type);
        if (type.equals("воина")) {
            System.out.println("Рекомендуем от 90 до 110");
        } else if (type.equals("мага")) {
            System.out.println("Рекомендуем от 80 до 100");
        } else if (type.equals("разбойника")) {
            System.out.println("Рекомендуем от 80 до 120");
        }
    }

    public void printMessExtraRange(String type) {
        if (type.equals("воина")) {
            System.out.println("Введите диапозон брони для " + type);
            System.out.println("Рекомендуем от 5 до 10");
        } else if (type.equals("мага")) {
            System.out.println("Введите диапозон маны для " + type);
            System.out.println("Рекомендуем от 25 до 50");
        }
    }

    public int getNumberUnit() {
        System.out.println("Введите количество юнитов в каждой команде: ");
        return in.nextInt();
    }

    public void printBattleResult(Unit[] team1, Unit[] team2, int winningTeam) {
        System.out.println("\n===== РЕЗУЛЬТАТЫ БОЯ =====");

        // Вывод команды 1
        System.out.println("\nКоманда 1:");
        for (int i = 0; i < team1.length; i++) {
            Unit unit = team1[i];
            String status = unit.isAlive() ? "Жив (HP: " + unit.getHp() + ")" : "Мёртв";
            System.out.println("- " + unit.name + ": " + status);
        }

        // Вывод команды 2
        System.out.println("\nКоманда 2:");
        for (int i = 0; i < team2.length; i++) {
            Unit unit = team2[i];
            String status = unit.isAlive() ? "Жив (HP: " + unit.getHp() + ")" : "Мёртв";
            System.out.println("- " + unit.name + ": " + status);
        }

        // Победитель
        System.out.println("\n==========================");
        System.out.println("ПОБЕДИТЕЛЬ: КОМАНДА " + winningTeam);
        System.out.println("==========================");
    }

    public void win(int teamNumber) {
        System.out.println("**************************");
        System.out.println("Победила команда № " + teamNumber);
        System.out.println("**************************");
    }
}
