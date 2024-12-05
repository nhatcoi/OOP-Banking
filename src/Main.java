import oggy.Employee;
import oggy.OggyTeam;

import java.util.ArrayList;

public class Main {
    int b = 2;

    static int a = 5;


    public static void main(String[] args) {

        final float PI = 3.14F;


        // Class Oggy -- injection
        OggyTeam jack = new OggyTeam();
        OggyTeam oggy = new OggyTeam(1, "Oggy", "Hanoi");
        OggyTeam olevia = new OggyTeam(1, "Oggy", "Hanoi");
        OggyTeam bob = new OggyTeam(1, "Oggy", "Hanoi");

        oggy.muaNuoc();
        olevia.muaDoAn();



        // Employee
        Employee jackie = new Employee();
        Employee oleviaa  = new Employee();
        Employee bobo = new Employee();
        Employee oggi = new Employee();

        oleviaa.setSalary(999);
        jackie.setSalary(10000);
        bobo.setSalary(1000);
        oggi.setSalary(20000);

        final int STANDARD_SALARY = 1000;
        final int PERCENT = 10;

        Employee[] oggyteam = {jackie, oleviaa, bobo, oggi};
        for (Employee e : oggyteam) {
            if( !(e.isEligibleForBonus()) ) {
                e.increaseSalary(PERCENT);
            }
        }

        for (Employee e : oggyteam) {
            System.out.println(e);
        }




    }
}