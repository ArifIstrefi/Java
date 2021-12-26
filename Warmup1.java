public class Warmup1 {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){
            return true;
        }
        else {
            return false;
        }
    }
    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    // We are in trouble if they are both smiling or if neither of them is smiling.
    // Return true if we are in trouble.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile==bSmile){
            return true;
        }
        return false;
    }
    //Given two int values, return their sum.
    // Unless the two values are the same, then return double their sum.
    public int sumDouble(int a, int b) {
        if(a==b){
            return 4*a;
        }
        return a+b;
    }
    //Given an int n, return the absolute difference between n and 21,
    //except return double the absolute difference if n is over 21.
    public int diff21(int n) {
        if(n<=21){
            return 21-n;
        }
        return 2*(n-21);
    }
    //We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    // We are in trouble if the parrot is talking and the hour is before 7 or after 20.
    // Return true if we are in trouble.
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking==true &&(hour <7 || hour >20 )){
            return true;
        }
        return false;
    }
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean makes10(int a, int b) {
        return (a==10)||(b==10)||(a+b==10);
    }
    //Given an int n, return true if it is within 10 of 100 or 200.
    public boolean nearHundred(int n) {
        return (Math.abs(n-100)<11)||(Math.abs(n-200)<11);
    }
    //Given 2 int values, return true if one is negative and one is positive.
    // Except if the parameter "negative" is true, then return true only if both are negative.
    public boolean posNeg(int a, int b, boolean negative) {
        if((negative == false) && (a*b <0)){
            return true;
        }
        if(negative ==true &&( a<0 && b<0)){
            return true;
        }
        return false;
    }
    //Given a string, return a new string where "not " has been added to the front.
    // However, if the string already begins with "not", return the string unchanged.
    public String notString(String str) {
        if(str.length()>=3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not "+str;
    }
    //Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    // The value of n will be a valid index of a char in the original string
    // (i.e. n will be in the range 0..str.length()-1 inclusive).
    public String missingChar(String str, int n) {
        return str.substring(0,n)+str.substring(n+1,str.length());
    }
    //Given a string, return a new string where the first and last chars have been exchanged.
    public String frontBack(String str) {
        if(str.length() <=1){
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1)+str.charAt(0);
    }



}
