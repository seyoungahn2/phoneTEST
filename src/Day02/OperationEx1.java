package Day02;

public class OperationEx1 {
    public static void main(String[] args) {
        int masthScore = 94;
        int engScore = 73;

        int totalScore = masthScore + engScore;
        System.out.println(totalScore);

        double avgscore = totalScore / 2.0;
        System.out.println(avgscore);
        System.out.printf("%.3f/n",avgscore);










        int gameScore=150;

        int lastScore1=++gameScore;
        System.out.println(lastScore1); // 151

        int lastScore2=gameScore++; // 151
        int lastScor3= gameScore;
        System.out.println(lastScore2);
        System.out.println(lastScor3);
        System.out.println(gameScore);


        System.out.println(5>3&&4==7||3 !=7);


    }
}
