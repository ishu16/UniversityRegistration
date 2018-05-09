package com.company;

public class Marks {
    private int ICTMarks;
    private int cwMarks;

    public  Marks(String ID,String ModuleID,int ICTMarks, int cwMarks)

    {
        this.ICTMarks = ICTMarks;
        this.cwMarks = cwMarks;
    }
    public int getICTMarks(){
        return ICTMarks;
    }
    public int getCwMarks(){
        return cwMarks;
    }
}