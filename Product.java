package com.gnirt69.sqlitefromassetexample;

import java.util.Stack;

/**
 * Created by NgocTri on 11/7/2015.
 */
public class Product {
    private int id;



    private String code;
    private String Name_Thai;
    private String Name_Eng;
    private String Nasion_Code;

    public Product(String code,String Name_Thai,String Name_Eng,String Nasion_Code) {
        this.code = code;
        this.Name_Thai = Name_Thai;
        this.Name_Eng = Name_Eng;
        this.Nasion_Code = Nasion_Code;
    }

    public String getcode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_Eng() {
        return Name_Eng;
    }

    public void setName_Eng(String Name_Eng) {
        this.Name_Eng = Name_Eng;
    }

    public String getName_Thai() {
        return Name_Thai;
    }

    public void setName_Thai(String Name_Thai) {
        this.Name_Thai = Name_Thai;
    }

    public String getNasion_Code() {
        return Nasion_Code;
    }

    public void setNasion_Code(String Nasion_Code) {
        this.Nasion_Code = Nasion_Code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {

        return id;
    }
}
