
package Latihan;

import java.util.Scanner;

public class nyobakisi {

    public static void main(String[] args) {
        String[] userIds = {"G101", "G102", "G103", "G104"};
        String[] names = {"KING", "ADITYA", "AGNI", "SYECH"};
        int[][] missions = {
            {5, 3, 4}, 
            {2, 1, 5}, 
            {2, 1, 5}, 
            {1, 0, 0}  
        };
        int[] scoresPerAction = {10, 20, 30}; 

        printGameplayResults(userIds, names, missions, scoresPerAction);
    }

    public static void printGameplayResults(String[] userIds, String[] names, int[][] missions, int[] scoresPerAction) {
        System.out.println("Hasil Gameplay:");
        System.out.println("USER ID\tNAMA\tMISI\t\tTOTAL SKOR");

        for (int i = 0; i < userIds.length; i++) {
            int totalScore = TotalScore(missions[i], scoresPerAction);
            String missionDetails = getMissionDetails(missions[i]);

            System.out.printf("%s\t%s\t%s\t%d\n",
                    userIds[i], names[i], missionDetails, totalScore);
        }
    }

    public static int TotalScore(int[] missionActions, int[] scoresPerAction) {
        int totalScore = 0;
        for (int i = 0; i < missionActions.length; i++) {
            totalScore += missionActions[i] * scoresPerAction[i];
        }
        return totalScore;
    }

    public static String getMissionDetails(int[] missionActions) {
        StringBuilder missionDetails = new StringBuilder();
        for (int i = 0; i < missionActions.length; i++) {
            missionDetails.append(missionActions[i]);
            if (i < missionActions.length - 1) {
                missionDetails.append(",");
            }
        }
        return missionDetails.toString();
    }
}
