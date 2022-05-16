package com.bridgelabz;

public class MoodAnalyser_Exception extends Exception{
    ExceptionType type;

    enum ExceptionType{
        Null,
        Empty;
    }
    public MoodAnalyser_Exception(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
