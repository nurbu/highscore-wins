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

        // Asks the overall score in TeamA:TeamB|TeamAScore:TeamBScore format

        System.out.print("Please enter a game score: ");
        String gameScore = scanner.nextLine();

        // Finds the indexes of different points within user input

        int firstSemiColon = gameScore.indexOf(":");
        int secondSemiColon = gameScore.indexOf(":", firstSemiColon + 1);

        // Uses indexes to split up user input to find team A, team B and their respective scores.

        int barIndex = gameScore.indexOf("|");
        teamA = gameScore.substring(0, firstSemiColon);
        teamB = gameScore.substring(firstSemiColon + 1, barIndex);
        teamAScore = Integer.parseInt(gameScore.substring(barIndex + 1, secondSemiColon));
        teamBScore = Integer.parseInt(gameScore.substring(secondSemiColon + 1));

        // Figures out the winning team based off the score

        String winningTeam;
        winningTeam = teamAScore > teamBScore ? teamA : teamB;
        System.out.println("Winner: " + winningTeam);

        scanner.close();
    }
}
