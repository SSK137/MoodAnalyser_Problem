package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message=message;
        AnalyseMood();
    }
    public String AnalyseMood() {
        if(message.contains("sad")){
            return "SAD";
        }
/*        else if (message.contains("Happy")){
            return "HAPPY";
        }*/
        else {
            return null;
        }
    }
}
