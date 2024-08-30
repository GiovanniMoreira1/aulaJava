package com.mycompany.teoria04exe01;

import java.util.Scanner;

public class DemoLaser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Laser[] lasers = new Laser[10];
        
        double medida = 3;
        double alcance = 22;
        double precisao = 18;
        for (int i = 0; i < 10; i++) {
            int num = i + 1;
            String laser = "Laser " + num;
            lasers[i] = new Laser(laser, alcance, precisao, medida);
            alcance += 2;
            precisao += 1.5 * i + 1;
            medida += i*3;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(lasers[i]);
        }
    }
}
