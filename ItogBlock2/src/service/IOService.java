package service;

import Units.Unit;

import java.util.Scanner;

public class IOService {
    private Scanner in;

    public IOService() {
        this.in = new Scanner(System.in);
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

    public void printTeamStatus(int teamNum, Unit[] team) {
        System.out.println("Команда " + teamNum + ":");
        for (int i = 0; i < team.length; i++) {
            String status = team[i].isAlive() ? "Жив (HP: " + team[i].getHp() + ")" : "Мёртв";
            System.out.println((i+1) + ". " + team[i].name + " - " + status);
        }
    }

    public Unit getFirstAlive(Unit[] team) {
        for (Unit unit : team) {
            if (unit.isAlive()) return unit;
        }
        return null;
    }

    public int countAlive(Unit[] team) {
        int count = 0;
        for (Unit unit : team) {
            if (unit.isAlive()) count++;
        }
        return count;
    }

    public void printFinalStats(Unit[] team1, Unit[] team2) {
        System.out.println("\nИтоговая статистика:");
        System.out.println("Команда 1 - живых: " + countAlive(team1) + "/" + team1.length);
        System.out.println("Команда 2 - живых: " + countAlive(team2) + "/" + team2.length);
    }
}
