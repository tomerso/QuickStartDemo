package com.company;

import java.util.Random;

public class GlobalClass implements IGlobalClass {

    private int number = 3;
    private int test;

    public GlobalClass() {
    }

    @Override
    public void OverideMethod(String val)
    {
        for (int i = 0; i < 10; i++) {

        }

    }

    public GlobalClass(int num){
        this.number = num;
    }

    public void setTest(int test) {
        this.test = test;

        Random r = new Random();
        int x  = 3;


    }

    public int getTest() {
        return test;
    }

    public int getNumber() {
        return number;
    }

}
