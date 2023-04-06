package com.piash;

public class StringPractice {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if(s1 == s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        System.out.println(s1.length());
        System.out.println(s2.charAt(2));
        System.out.println(s2.indexOf("Hello"));
        System.out.println(s1.contains("Hello"));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
    }
}
