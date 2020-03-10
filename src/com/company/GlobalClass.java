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
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count+=i;
        }

    }

    @Override
    public void MyNewMethod() {
        int xyz=6663;
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
