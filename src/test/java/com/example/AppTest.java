package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void happy_test_case()
    {
        try{
            String path = "StateCensus.csv";
            CSVStateCensus obj = new CSVStateCensus(path);
            StateCensusAnalyser analyser = new StateCensusAnalyser(obj);
            assertEquals(analyser.num_records(), 37);
        }
        catch(FilenotfoundException e){
            fail("Exception was not expected here");
        }
    }
}
