package com.shakibcsekuet.mainbooklistproject;


public class DataTemp {

    private int id;
    private String name;
    private String day;
    private String writ;
    private String _dept;


    public DataTemp(String n, String d ){
        name = n;
        day = d;
       // writ=n1;
        //_dept=d1;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setwrit(String writ) {
        this.writ = writ;
    }

    public String getwrit() {
        return writ;
    }

    public void set_dept(String _dept) {
        this._dept = _dept;
    }

    public String get_dept() {
        return _dept;
    }

}
