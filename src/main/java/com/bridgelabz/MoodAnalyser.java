package com.bridgelabz;

public class MoodAnalyser {
    public static String message;
    public MoodAnalyser(){

    }

    public MoodAnalyser(String message) {
        this.message=message;
    }

    public String AnalyseMood() throws MoodAnalyser_Exception {
        try {
            if (message.length() == 0) {
                System.out.println("Empty Exception Occured");
                throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.Empty, "");
            }else if (message.contains("Sad"))
                return "SAD";
            else if (message.contains("Happy"))
                return "HAPPY";
            else
                return null;
        } catch(NullPointerException e) {
            System.out.println("Null Pointer Exception");
            throw new MoodAnalyser_Exception(MoodAnalyser_Exception.ExceptionType.Null ,"");
        }
    }
}
