package com.company;

public class Lecturer extends Person {

    public Lecturer(String LecturerID, String name, String ModuleName,String ModuleID, String address) {
        super(name, address);
        this.LecturerID = LecturerID;
        this.ModuleName = ModuleName;
        this.ModuleID = ModuleID;

    }

    public String getLecturerID() {
        return LecturerID;
    }

    public void setLecturerID(String lecturerID) {
        LecturerID = lecturerID;
    }

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String moduleName) {
        ModuleName = moduleName;
    }

    public String getModuleID() {
        return ModuleID;
    }

    public void setModuleID(String moduleID) {
        ModuleID = moduleID;
    }

    private String LecturerID;
    private String ModuleName;
    private String ModuleID;


}