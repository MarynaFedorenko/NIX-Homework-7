package nix;

import nix.data.impl.*;
import nix.service.PlanetReporter;

import java.awt.event.WindowFocusListener;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static double getInfo(int n){
        PlanetReporter reporter = new PlanetReporter();
        switch (n){
            case 1:
                Mercury mercury = new Mercury();
                return reporter.getAccelerationOfGravity(mercury);
            case 2:
                Venus venus = new Venus();
                return reporter.getAccelerationOfGravity(venus);
            case 3:
                Earth earth = new Earth();
                return reporter.getAccelerationOfGravity(earth);
            case 4:
                Mars mars = new Mars();
                return reporter.getAccelerationOfGravity(mars);
            case 5:
                Jupiter jupiter = new Jupiter();
                return reporter.getAccelerationOfGravity(jupiter);
            case 6:
                Saturn saturn = new Saturn();
                return reporter.getAccelerationOfGravity(saturn);
            case 7:
                Uranus uranus = new Uranus();
                return reporter.getAccelerationOfGravity(uranus);
            case 8:
                Neptune neptune = new Neptune();
                return reporter.getAccelerationOfGravity(neptune);

        }
        System.out.println("Что-то пошло не так!");
        return 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("#.##");
        boolean continueDiscovering = true;
        int answer = 0;


        do{
            System.out.println("Введите порядковый номер планеты: 1-Меркурий, 2-Венера, 3-Земля, 4-Марс, 5-Юпитер, 6-Сатурн, 7-Уран, 8-Нептун");
            answer = scanner.nextInt();
            if(answer>=1 && answer<=8){
                System.out.println(d.format(getInfo(answer)));
                System.out.println("Продолжить? 0-да, 1-нет");
                answer = scanner.nextInt();
                if(answer==1) continueDiscovering = false;
            }

        }while(continueDiscovering);

    }
}
