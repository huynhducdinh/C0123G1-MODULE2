package ss8_clean_code_refactoring;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int mScore1, int mScore2) {
        String score = "";
        int tempScore = 0;
        if (mScore1 == mScore2) {
            score = hi(mScore1);
        } else if (mScore1 >= 4 || mScore2 >= 4) {
            score = checkAdvantage(mScore1, mScore2);
        } else {
            score=checkScore(mScore1,mScore2,tempScore);
        }
        return score;
    }

    public static String hi(int mScore1) {
        String score = "";
        switch (mScore1) {
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
        return score;
    }

    public static String checkAdvantage(int mScore1, int mScore2) {
        String score = "";
        int minusResult = mScore1 - mScore2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    public static String checkScore(int mScore1, int mScore2, int tempScore) {
        String score = "";
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = mScore1;
            else {
                score += "-";
                tempScore = mScore2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}



