package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDups {
    public static void main(String[] args) {
        int[] nr=new int[]{1, 0, 1, 0};
        String[] str=new String[]{"John", "Taylor", "John"};
        System.out.println(Arrays.toString(removeDups(nr)));
        System.out.println(Arrays.toString(removeDups(str)));
    }

    public static int[] removeDups(int[] nums) {
        List<Integer> listWithoutDups = new ArrayList<Integer>();
        for (int n : nums) {
            if (!listWithoutDups.contains(n)) {
                listWithoutDups.add(n);
            }
        }
            int[] numsWithoutDups=new int[listWithoutDups.size()];
        for (int i = 0; i < listWithoutDups.size(); i++) {
            numsWithoutDups[i]= listWithoutDups.get(i);
        }
        return numsWithoutDups;
    }

    public static String[] removeDups(String[] str){
        List<String> arrayList=new ArrayList<String>();
        for (String s:str) {
            if(!arrayList.contains(s)){
                arrayList.add(s);
            }}
            String[] stringWithoutDups=new String[arrayList.size()];
            for (int i = 0; i <arrayList.size() ; i++) {
                stringWithoutDups[i]= arrayList.get(i);
            }
            return stringWithoutDups;
        }

    }

