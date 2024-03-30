package org.example;

public class CupSwapping {
    public static void main(String[] args) {
        String[] strings = new String[]{"AC", "CA", "CA", "AC"};
        System.out.println(cupSwapping(strings));
    }

    public static String cupSwapping(String[] moves) {
        String[] strings = new String[moves.length];
        String position = "B";
        String cupWithBall = "";
        for (int i = 0; i < moves.length; i++) {
            if (moves[i].contains(position)) {
                cupWithBall = removeSubstring(moves[i], position);
                position = cupWithBall;
            }
        }
        return position;
    }

    public static String removeSubstring(String str, String substringToRemove) {
        return str.replace(substringToRemove, "");
    }
}
