package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String[] ukoly = new String[10];
        System.out.println("_________ _______  ______   _______    _______  _______  _______ \n" +
                "\\__   __/(  ___  )(  __  \\ (  ___  )  (  ___  )(  ____ )(  ____ )\n" +
                "   ) (   | (   ) || (  \\  )| (   ) |  | (   ) || (    )|| (    )|\n" +
                "   | |   | |   | || |   ) || |   | |  | (___) || (____)|| (____)|\n" +
                "   | |   | |   | || |   | || |   | |  |  ___  ||  _____)|  _____)\n" +
                "   | |   | |   | || |   ) || |   | |  | (   ) || (      | (      \n" +
                "   | |   | (___) || (__/  )| (___) |  | )   ( || )      | )      \n" +
                "   )_(   (_______)(______/ (_______)  |/     \\||/       |/ ");

        while (true) {
            boolean a = true;
            int plno = 0;
            for (int i = 0; i < ukoly.length; i++) {
                if (ukoly[i] != null) {
                    plno++;
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("Nyní můžete přidat 10 úkolů");
            System.out.println("Nyní máte " + plno + "/" + ukoly.length + " úkolů");
            for (int i = 0; i < ukoly.length; i++) {
                if (ukoly[i] != null) {
                    System.out.println("#" + i + " - " + ukoly[i]);
                }
            }
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.println("1) Spravovat úkoly");
            System.out.println("2) Odejít");
            int volba = sc.nextInt();
            if (volba == 1) {
                while (a) {
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Správce úkolů");
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("1) Vytvořit nový úkol");
                    System.out.println("2) Upravit úkol");
                    System.out.println("3) Smazat úkol");
                    System.out.println("4) Vrátit se do hlavního menu");
                    volba = sc.nextInt();
                    if (volba == 1) {
                        a = false;
                        System.out.println("Zadej název úkolu: ");
                        for (int i = 0; i < ukoly.length; i++) {
                            if (ukoly[i] == null) {
                                ukoly[i] = sc.nextLine();
                                ukoly[i] = sc.nextLine();
                                System.out.println(ukoly[i] + " byl uložen na index " + i);
                                break;
                            }
                        }
                    } else if (volba == 2) {
                        boolean b = true;
                        while (b) {
                            a = false;
                            System.out.println("Zadej index na kterém chceš upravit úkol:");
                            int index = sc.nextInt();
                            if (index < -1 || index > 9) {
                                System.out.println("Neplatné číslo. Zkus to znovu.");
                            } else if (ukoly[index] == null) {
                                System.out.println("Úkol na indexu " + index + " je prázdný");
                            } else {
                                System.out.println("Zadej upravený název úkolu: ");
                                ukoly[index] = sc.nextLine();
                                ukoly[index] = sc.nextLine();
                                b = false;
                            }
                        }

                    } else if (volba == 3) {
                        boolean b = true;
                        while (b) {
                            a = false;
                            System.out.println("Zadej index na kterém chceš smazat úkol: ");
                            int index = sc.nextInt();
                            if (index < -1 || index > 9) {
                                System.out.println("Neplatné číslo. Zkus to znovu.");
                            } else if (ukoly[index] == null) {
                                System.out.println("Úkol na indexu " + index + " již je prázdný");
                            } else {
                                System.out.println("Zadej upravený název úkolu: ");
                                System.out.println("Úkol "+ukoly[index]+" na indexu "+index+" byl vymazán.");
                                ukoly[index] = null;
                                b = false;
                            }
                            String[] ukoly2 = new String[ukoly.length];
                            int pocet = 0;
                            for(int i = 0; i< ukoly.length;i++){
                                if(ukoly[i]!=null){
                                    ukoly2[pocet] = ukoly[i];
                                    pocet++;
                                }
                            }
                            for(int i = 0; i< ukoly.length; i++){
                                ukoly[i] = ukoly2[i];
                            }
                            System.out.println(Arrays.toString(ukoly));
                        }
                    } else if (volba == 4) {
                        a = false;
                    } else {
                        System.out.println("Vybral jsi nesprávnou možnost. Zkus to znovu.");
                    }
                }
            } else if (volba == 2)
                System.exit(0);
            else {
                System.out.println("Vybral jsi nesprávnou možnost. Zkus to znovu.");
            }
        }
    }
}
