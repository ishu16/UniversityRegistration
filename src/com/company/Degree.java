package com.company;

public class Degree {
    public int getDegreeId() {
        return degreeId;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public Module[] getModules() {
        return modules;
    }

    private int degreeId;
    private String degreeName;
    private Module[] modules;

    private final int MAX_MODULES;
    private static int currentIndex = 0;

    public Degree(int degreeId, String degreeName,
                  int maxModules){
        MAX_MODULES = maxModules;
        this.degreeId = degreeId;
        this.degreeName = degreeName;

        modules = new Module[MAX_MODULES];
    }

    public void AddModules(Module[] modules){
        this.modules = modules;
        this.currentIndex = CountModules();
    }

    public void AddModule(Module module){
        if (currentIndex < MAX_MODULES) {
            modules[currentIndex] = module;
            currentIndex++;
        }
    }

    public int CountModules(){
        int count = 0;
        for(Module m: modules)
        {
            if(m != null)
                count++;
        }
        return count;
    }
    ////////getters and setters/////////

    public int getMAX_MODULES() {
        return MAX_MODULES;
    }

    public String getdegreeName() {
        return degreeName;
    }

    public int getdegreeId() {
        return degreeId;
    }

    public Module[] getmodules() {
        return modules;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public void setDegreeId(int degreeId) {
        this.degreeId = degreeId;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    //////////////// end ////////////////
}


