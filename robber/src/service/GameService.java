package service;

import Units.Mage;
import Units.Robber;
import Units.Unit;
import Units.Warrior;

import java.util.Scanner;

public class GameService {
    private Unit[] team1, team2;
    private IOService ioService;
    private int numberUnit;

    public GameService() {
        this.ioService = new IOService();
        numberUnit = ioService.getNumberUnit();
        this.team1 = new Unit[numberUnit];
        this.team2 = new Unit[numberUnit];
        generateTeam();
    }

    public int randomDigit(int a, int b) {
        return a + (int) (Math.random() * (b - a + 1));
    }

    private void generateTeam() {
        for (int i = 0; i < numberUnit; i++) {
            team1[i] = randomUnit(i);
            team2[i] = randomUnit(i);
        }
    }

    private Unit randomUnit(int number) {
        double random = Math.random();
        if (random >= 0 && random < 0.33) {
            ioService.printMessHpRange("воина");
            int[] rangeHP = ioService.getRange();
            ioService.printMessExtraRange("воина");
            int[] rangeExtra = ioService.getRange();

            return new Warrior("Воин " + (number + 1), randomDigit(rangeHP[0], rangeHP[1]), randomDigit(rangeExtra[0], rangeExtra[1]));

        } else if (random >= 0.33 && random < 0.66) {
            ioService.printMessHpRange("мага");
            int[] rangeHP = ioService.getRange();
            ioService.printMessExtraRange("мага");
            int[] rangeExtra = ioService.getRange();

            return new Mage("Маг " + (number + 1), randomDigit(rangeHP[0], rangeHP[1]), randomDigit(rangeExtra[0], rangeExtra[1]));

        } else {
            ioService.printMessHpRange("разбойника");
            int[] rangeHP = ioService.getRange();

            return new Robber("Разбойник " + (number + 1), randomDigit(rangeHP[0], rangeHP[1]));

        }
    }

    public void startGame() {
        System.out.println("=== НАЧАЛО БОЯ ===");
        System.out.println("Команда 1 (" + team1.length + " юнитов) vs Команда 2 (" + team2.length + " юнитов)");

        int round = 1;
        int team1Alive = team1.length;
        int team2Alive = team2.length;

        while (team1Alive > 0 && team2Alive > 0) {
            System.out.println("\n--- Раунд " + round + " ---");
            printTeamStatus(1, team1);
            printTeamStatus(2, team2);

            Unit unit1 = getFirstAlive(team1);
            Unit unit2 = getFirstAlive(team2);

            System.out.println("\nБой: " + unit1.name + " vs " + unit2.name);

            unit1.attack(unit2);
            System.out.println(unit1.name + " атакует " + unit2.name);

            if (unit2.isAlive()) {
                unit2.attack(unit1);
                System.out.println(unit2.name + " контратакует");
            } else {
                System.out.println(unit2.name + " повержен!");
            }

            team1Alive = countAlive(team1);
            team2Alive = countAlive(team2);

            round++;
        }

        int winningTeam = (team1Alive > 0) ? 1 : 2;
        System.out.println("\n=== БОЙ ЗАВЕРШЕН ===");
        System.out.println("ПОБЕДИТЕЛЬ: КОМАНДА " + winningTeam);
        printFinalStats(team1, team2);
    }

    private void printTeamStatus(int teamNum, Unit[] team) {
        System.out.println("Команда " + teamNum + ":");
        for (int i = 0; i < team.length; i++) {
            String status = team[i].isAlive() ? "Жив (HP: " + team[i].getHp() + ")" : "Мёртв";
            System.out.println((i+1) + ". " + team[i].name + " - " + status);
        }
    }

    private Unit getFirstAlive(Unit[] team) {
        for (Unit unit : team) {
            if (unit.isAlive()) return unit;
        }
        return null;
    }

    private int countAlive(Unit[] team) {
        int count = 0;
        for (Unit unit : team) {
            if (unit.isAlive()) count++;
        }
        return count;
    }

    private void printFinalStats(Unit[] team1, Unit[] team2) {
        System.out.println("\nИтоговая статистика:");
        System.out.println("Команда 1 - живых: " + countAlive(team1) + "/" + team1.length);
        System.out.println("Команда 2 - живых: " + countAlive(team2) + "/" + team2.length);
    }
}
