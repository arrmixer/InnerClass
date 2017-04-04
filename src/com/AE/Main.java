package com.AE;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {
        // example of local class
//        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(true);
//        System.out.println(mcLaren.wheelSpped(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpped(3000));
//        mcLaren.changeGear(3);
//        System.out.println(mcLaren.wheelSpped(6000));
//        class ClickListener implements Button.OnClickListener {
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
        //example of anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked.");
            }
        });

        instructions();
        listen();
    }

    private static void listen(){
    boolean quit = false;
    while(!quit){
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 0:
                quit = true;
                break;
            case 1:
                btnPrint.onClick();
        }
    }
    }

    public static void instructions(){
        System.out.println("Instructions: \n" +
                "0: quit program\n" +
                "1: print \n" );
    }
}
