package org.example;

public class Challenge {
    public static void main(String[] args) {
        //System.out.println(countChar('b', "big fat bubble"));
        System.out.println(isPalindrome("racecar"));
//        String str="racecar";
//        StringBuilder stringBuilder=new StringBuilder(str);
//        System.out.println(str.equals(stringBuilder.reverse()));
        //System.out.println(missingNum(new int[]{7, 2, 3, 6, 5, 9, 1, 4, 8}));
        //System.out.println(towerHanoi(8));
        // System.out.println(duplicateCount("Indivisibilities"));
        //System.out.println(sevenBoom(new int[]{2, 55, 60, 97, 86}));
    }

    public static int countChar(char c, String text) {
        int count = 0;
        for (char ch : text.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        StringBuilder strgBuilder = new StringBuilder(str);
        strgBuilder=strgBuilder.reverse();
        return str.equals(strgBuilder.toString());
    }

    public static int missingNum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return (55 - sum);
    }

    public static int towerHanoi(int discs) {
        return (int) Math.pow(2, discs) - 1;
    }

    public static int duplicateCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String sevenBoom(int[] arr) {
        for (int i : arr) {
            String nr = String.valueOf(i);
            if (nr.contains("7")) {
                return "Boom!";
            }
        }
        return "there is no 7 in the array";
    }
}
