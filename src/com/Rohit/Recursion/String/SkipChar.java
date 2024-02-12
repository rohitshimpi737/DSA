package com.Rohit.Recursion.String;

public class SkipChar {
    public static void main(String[] args) {
        String st= "baccad";
        StringBuilder str= new StringBuilder();
        for (int i = 0; i <st.length() ; i++) {
            char ch= st.charAt(i);
            if(ch!='a'){
                str.append(ch);
            }
        }
//        System.out.println(str);
//        skip("",st);
//        System.out.println(skip(st));
//        System.out.println(skipString("bdgapplepq"));
        System.out.println(skipAppNotApple("appappleapp"));
         }
    public static  void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }
    public static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }

    public static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipString(up.substring(5));
        }
        else {
            return up.charAt(0) + skipString(up.substring(1));
        }
    }

    public static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
