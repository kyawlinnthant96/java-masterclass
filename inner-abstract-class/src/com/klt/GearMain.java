package com.klt;

import java.util.Scanner;

public class GearMain {
        private static Scanner scanner = new Scanner(System.in);
        private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
      /* GearBoxes mcLearn = new GearBoxes(6);
       mcLearn.addGear(1, 5.3);
       mcLearn.addGear(2, 10.6);
       mcLearn.addGear(3, 15.9);
       mcLearn.operateClutch(true);
       mcLearn.changeGear(1);
       mcLearn.operateClutch(false);
        System.out.println(mcLearn.wheelSpeed(1000));
        mcLearn.changeGear(2);
        System.out.println(mcLearn.wheelSpeed(3000));
        mcLearn.operateClutch(true);
        mcLearn.changeGear(3);
        mcLearn.operateClutch(false);
        System.out.println(mcLearn.wheelSpeed(5000));*/

        class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen() {
            boolean quit = false;
            while(!quit) {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 0:
                        quit = true;
                        break;
                    case 1:
                        btnPrint.onClick();
                }
            }
    }
}
