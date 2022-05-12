package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message=message;
        GetMood();
    }
    public String GetMood() {
        if(message.contains("sad")){
            return "SAD";
        }
        else if (message.contains("Happy")){
            return "HAPPY";
        }
        else {
            return "HAPPY";
        }
    }
}
