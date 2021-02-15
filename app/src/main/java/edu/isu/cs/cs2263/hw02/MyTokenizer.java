package edu.isu.cs.cs2263.hw02;

public class MyTokenizer implements PushbackTokenizer{

    //instance variables
    StringTokenizer ourString;
    boolean tokenFlag;
    String tempToken;

    //constructor
    public MyTokenizer(StringTokenizer ourString){
        this.ourString = ourString;
        this.tokenFlag = false;
        this.tempToken = '';
    }

    //this method will return the next token unless pushback has been called,
    //in which case it returns the previous token
    String nextToken(){
        if(tokenFlag == false) {
            tempToken = ourString.nextToken();
        }
        tokenFlag = false;
        return tempToken;
    }
    boolean hasMoreTokens(){
        ourString.hasMoreTokens
    }
    void pushback(){
        tokenFlag = true;
    }
}
