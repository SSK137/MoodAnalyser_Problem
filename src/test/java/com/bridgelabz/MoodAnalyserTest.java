package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void getMessage_WhenProper_ShouldReturnSad() throws MoodAnalyser_Exception{
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
        String result= String.valueOf(moodAnalyser.AnalyseMood());
        System.out.println(result);
        Assertions.assertEquals("SAD",result);
    }

    @Test
    public void getMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyser_Exception{
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy Mood");
        String result= String.valueOf(moodAnalyser.AnalyseMood());
        System.out.println(result);
        Assertions.assertEquals("HAPPY",result);
    }

    @Test
    public void testMoodAnalysis_whenMoodNull_ShouldThrowException() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            String result=moodAnalyzer.AnalyseMood();
            Assertions.assertEquals(MoodAnalyser_Exception.ExceptionType.Null,result);
        } catch (MoodAnalyser_Exception e) {
            System.out.println("Exception  "+e);
        }
    }

    @Test
    public void testMoodAnalysis_whenMoodEmpty_ShouldThrowException(){
        MoodAnalyser moodAnalyzer = new MoodAnalyser("");
        try {
            String result=moodAnalyzer.AnalyseMood();
            Assertions.assertEquals(MoodAnalyser_Exception.ExceptionType.Empty,result);
        } catch (MoodAnalyser_Exception e) {
            System.out.println("Exception  "+e);
        }
    }
}
