package com.bridgelabz;

public class Demo2 {
    public static void main(String[] args) {
        String string = "I am Saptarshi Biswas";
        int[] arr= new int[10];
        int count = 0;
        for (int i =0;i<string.length();i++){
            char ch =string.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                count++;
                
            }
        }
        System.out.println(count);
    }
}
