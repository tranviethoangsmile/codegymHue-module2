package com.codegymhueJava;

public class TennisGame {

    public static final String MINUS = "-";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(String namePlayer1, String namePlayer2, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore;
        final boolean isFirstEqualSecond = scorePlayer1 == scorePlayer2;
        final boolean isScorePlayer1 = scorePlayer1 >= 4;
        final boolean isScorePlayer2 = scorePlayer2 >= 4;

        if (isFirstEqualSecond) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        } else if (isScorePlayer1 || isScorePlayer2) {

            int minusResult = scorePlayer1 - scorePlayer2;
            final boolean isMinusResultEqualOne = minusResult == 1;
            final boolean isMinusResultEqualNegativeOne = minusResult == -1;
            final boolean isMinusResultOverOrEqualTwo = minusResult >= 2;

            if (isMinusResultEqualOne) {
                score = "Advantage player1";
            } else if (isMinusResultEqualNegativeOne) {
                score = "Advantage player2";
            } else if (isMinusResultOverOrEqualTwo) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scorePlayer1;
                } else {
                    score += MINUS;
                    tempScore = scorePlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
