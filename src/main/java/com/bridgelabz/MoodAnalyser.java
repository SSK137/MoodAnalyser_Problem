package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(String message){
        this.message=message;
        AnalyseMood();
    }
    public String AnalyseMood() {
        try{
            if(message.contains("sad")){
                return "SAD";
            }
            else {
                return null;
            }
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Occured");
            return "HAPPY";
        }
    }
}
