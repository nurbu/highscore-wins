package com.pluralsight;

import java.util.Scanner;

public class ScoreTracker {
    public static void main(String[] args) {
        // Says which team won based off score
        String teamA;
        int teamAScore;
        String teamB;
        int teamBScore;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a game score: ");
        String gameScore = scanner.nextLine();
        int firstSemiColon = gameScore.indexOf(":");
        int secondSemiColon = gameScore.indexOf(":", firstSemiColon + 1);
        int barIndex = gameScore.indexOf("|");
        teamA = gameScore.substring(0, firstSemiColon);
        teamB = gameScore.substring(firstSemiColon + 1, barIndex);
        teamAScore = Integer.parseInt(gameScore.substring(barIndex + 1, secondSemiColon));
        teamBScore = Integer.parseInt(gameScore.substring(secondSemiColon + 1));


    }
}
