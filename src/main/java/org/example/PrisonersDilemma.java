package org.example;

import java.sql.Array;

public class PrisonersDilemma {
    public static void main(String[] args) {
        String[] r = {"share", "share", "share"};
        String[] g = {"steal", "share", "steal"};
        System.out.println(getCoinBalances(r, g));
    }

    public static int[] getCoinBalances(String[] r, String[] g) {
        int a = 3, b = 3;
        for (int i = 0; i < r.length; i++) {
            if (r[i].equals(g[i]) && r[i].equals("share")) {
                a += 2;
                b += 2;
            } else {
                if (r[i].equals("share")) {
                    a -= 1;
                    b += 3;
                } else {
                    if (r[i].equals("steal")) {
                        a += 3;
                        b -= 1;
                    }
                }
            }
        }
        return new int[]{a, b};
    }

}

