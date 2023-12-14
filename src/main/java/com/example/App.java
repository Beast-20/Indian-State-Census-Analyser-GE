package com.example;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws FilenotfoundException
    {

        System.out.println("Welcome to the Indian States Census Analyser Problem!");
        String path = "StateCensus.csv";
        CSVStateCensus obj = new CSVStateCensus(path);

        StateCensusAnalyser analyser = new StateCensusAnalyser(obj);

        int exp = 37;

        if(analyser.num_records()==exp){
            System.out.println("Number of records matched");
        }
        else{
            System.out.println("Records not matched");
        }
    }
}
