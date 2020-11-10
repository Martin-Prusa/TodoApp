package com.company;

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
            int plno2 = 0;
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
            String strV = sc.nextLine();
            String cisla = "0123456789";
            boolean p = false;
            int volba = 0;
            for (int i = 0; i < strV.length(); i++) {
                String x = "";
                x += strV.charAt(i);
                if (!cisla.contains(x)) {
                    p = true;
                }
            }
            if (!p) {
                volba = Integer.parseInt(strV);
            }

            if (volba == 1) {
                while (a) {
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Správce úkolů");
                    plno2 = 0;
                    for (int i = 0; i < ukoly.length; i++) {
                        if (ukoly[i] != null) {
                            plno2++;
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("Nyní můžete přidat 10 úkolů");
                    System.out.println("Nyní máte " + plno2 + "/" + ukoly.length + " úkolů");
                    for (int i = 0; i < ukoly.length; i++) {
                        if (ukoly[i] != null) {
                            System.out.println("#" + i + " - " + ukoly[i]);
                        }
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    System.out.println("1) Vytvořit nový úkol");
                    if (plno2 != 0) {
                        System.out.println("2) Upravit úkol");
                        System.out.println("3) Smazat úkol");
                    }
                    System.out.println("4) Vrátit se do hlavního menu");
                    p = false;
                    volba = 0;
                    strV = sc.nextLine();
                    for (int i = 0; i < strV.length(); i++) {
                        String x = "";
                        x += strV.charAt(i);
                        if (!cisla.contains(x)) {
                            p = true;
                        }
                    }
                    if (!p) {
                        volba = Integer.parseInt(strV);
                    }
                    if (volba == 1) {
                        System.out.println("Zadej název úkolu: ");
                        for (int i = 0; i < ukoly.length; i++) {
                            if (ukoly[i] == null) {
                                ukoly[i] = sc.nextLine();
                                System.out.println(ukoly[i] + " byl uložen na index " + i);
                                break;
                            }
                        }
                    } else if (volba == 2) {
                        if (plno2 != 0) {
                            boolean b = true;
                            while (b) {
                                System.out.println("Zadej index na kterém chceš upravit úkol:");
                                int index = 0;
                                p = false;
                                strV = sc.nextLine();
                                for (int i = 0; i < strV.length(); i++) {
                                    String x = "";
                                    x += strV.charAt(i);
                                    if (!cisla.contains(x)) {
                                        p = true;
                                    }
                                }
                                if (!p) {
                                    index = Integer.parseInt(strV);
                                    if (index < -1 || index > 9) {
                                        System.out.println("Neplatné číslo. Zkus to znovu.");
                                    } else if (ukoly[index] == null) {
                                        System.out.println("Úkol na indexu " + index + " je prázdný");
                                    } else {
                                        System.out.println("Zadej upravený název úkolu: ");
                                        ukoly[index] = sc.nextLine();
                                        b = false;
                                    }
                                } else{
                                    System.out.println("Neplatná možnost");
                                }

                            }
                        } else {
                            System.out.println("Neplatná možnost");
                        }

                    } else if (volba == 3) {
                        if (plno2 != 0) {
                            boolean b = true;
                            while (b) {
                                System.out.println("Zadej index na kterém chceš smazat úkol: ");
                                int index = 0;
                                p = false;
                                strV = sc.nextLine();
                                for (int i = 0; i < strV.length(); i++) {
                                    String x = "";
                                    x += strV.charAt(i);
                                    if (!cisla.contains(x)) {
                                        p = true;
                                    }
                                }
                                if (!p) {
                                    index = Integer.parseInt(strV);
                                    if (index < -1 || index > 9) {
                                        System.out.println("Neplatné číslo. Zkus to znovu.");
                                    } else if (ukoly[index] == null) {
                                        System.out.println("Úkol na indexu " + index + " již je prázdný");
                                    } else {
                                        System.out.println("Zadej upravený název úkolu: ");
                                        System.out.println("Úkol " + ukoly[index] + " na indexu " + index + " byl vymazán.");
                                        ukoly[index] = null;
                                        b = false;
                                    }
                                    String[] ukoly2 = new String[ukoly.length];
                                    int pocet = 0;
                                    for (int i = 0; i < ukoly.length; i++) {
                                        if (ukoly[i] != null) {
                                            ukoly2[pocet] = ukoly[i];
                                            pocet++;
                                        }
                                    }
                                    for (int i = 0; i < ukoly.length; i++) {
                                        ukoly[i] = ukoly2[i];
                                    }
                                    plno2--;

                                } else{
                                    System.out.println("Neplatná možnost");
                                }

                            }
                        } else {
                            System.out.println("Neplatná možnost");
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
