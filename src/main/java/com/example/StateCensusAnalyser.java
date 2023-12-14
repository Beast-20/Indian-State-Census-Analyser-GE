package com.example;

import java.util.List;

public class StateCensusAnalyser {
    CSVStateCensus obj;
    
    public StateCensusAnalyser(CSVStateCensus obj){
        this.obj = obj;
    }

    public int num_records() throws FilenotfoundException{
        List<String[]> temp = obj.readFile();
        if(temp.size()==0){
            return 0;
        }
        return temp.size()-1;
    }

}
