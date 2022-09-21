package com.manav;

import java.util.Scanner;

public class ManavKasaHesap {
    public static void main(String[] args) {

        double armut=2.14 , elma=3.67 , domates=1.11 , muz=0.95 , patlıcan=5 ;
        int kiloa,kiloe,kilod,kilom,kilop ;
        double toplamSepet ;

        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        kiloa = sc.nextInt();
        System.out.print("Elma Kaç Kilo ? ");
        kiloe = sc.nextInt();
        System.out.print("Domates Kaç Kilo ? ");
        kilod = sc.nextInt();
        System.out.print("Muz Kaç Kilo ? ");
        kilom = sc.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? ");
        kilop = sc.nextInt();


        toplamSepet = (
                        (armut*kiloa)+
                        (elma*kiloe)+
                        (domates*kilod)+
                        (muz*kilom)+
                        (patlıcan*kilop)
                );

        System.out.println("Armut Kaç Kilo ? "+kiloa + "kg");
        System.out.println("Elma Kaç Kilo ? "+ kiloe  + "kg");
        System.out.println("Domates Kaç Kilo ? " +kilod  + "kg" );
        System.out.println("Muz Kaç Kilo ? " + kilom  + "kg");
        System.out.println("patlıcan Kaç Kilo ? " + kilop  + "kg" );
        System.out.println("Sepet Tutar Toplam : " + toplamSepet);


    }
}
