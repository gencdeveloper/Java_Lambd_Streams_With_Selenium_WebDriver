package com.udemy.java;

import com.udemy.java.interfacePolimorphism.Alarm;
import com.udemy.java.interfacePolimorphism.Clock;
import com.udemy.java.interfacePolimorphism.GoogleMini;
import com.udemy.java.interfacePolimorphism.Iphone;

public class MainForInterFacePolymorhism {

    public static void main(String[] args) {
        GoogleMini g = new GoogleMini();
        Iphone i = new Iphone();
        Clock c = new Clock();

        AlarmTest(c);
        AlarmTest(i);
        AlarmTest(g);

    }
    private static void AlarmTest(Alarm i) {
        i.setAlarm();
    }

}


