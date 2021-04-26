/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author dicasado
 */
public class Buy {

    public static int BuyProduct(double price, Coins money) {

        double saldo = 0, toRead, troco = 0, restante = 0;
        int c5 = 0, c10 = 0, c20 = 0, c50 = 0, c100 = 0, c200 = 0;
        int n5 = 0, n10 = 0;
        int bought = 0;

        do {
            restante = (price - saldo);

            //System.out.println("\nPrice: " + String.format("%.2f", price));
            System.out.println("Remaining: " + String.format("%.2f", restante));
            System.out.println("Insert coin/bill (press 999 to cancel): ");

            toRead = Input.lerDouble();
            if (toRead == 0.05) {
                c5++;
                saldo += 0.05;
            } else if (toRead == 0.10) {
                c10++;
                saldo += 0.10;
            } else if (toRead == 0.20) {
                c20++;
                saldo += 0.20;
            } else if (toRead == 0.50) {
                c50++;
                saldo += 0.50;
            } else if (toRead == 1) {
                c100++;
                saldo += 1;
            } else if (toRead == 2) {
                c200++;
                saldo += 2;
            } else if (toRead == 5) {
                n5++;
                saldo += 5;
            } else if (toRead == 10) {
                n10++;
                saldo += 10;
            } else if (toRead == 999) {            // Codigo para cancelar
                n5 = 0;
                n5 = 0;
                c200 = 0;
                c100 = 0;
                c50 = 0;
                c20 = 0;
                c10 = 0;
                c5 = 0;
                saldo = 1.00;
                price = 0;
                bought = 9;
                System.out.println("Change returned");
            } else {
                System.out.println("Invalid coin");
            }

            troco = (saldo - price);

        } while (saldo < price);

        addToCoins(money, c5, c10, c20, c50, c100, c200, n5, n10);

        if (bought == 9) {
            System.out.println("Cancelled");
            bought = 0;
        } else if (troco != 0) {
            System.out.println("Change: " + String.format("%.2f", troco));
            if (money.giveChange(troco) == 1) {
                bought = 1;
            } else {
                System.out.println("No change available");
                bought = 0;
            }

        } else {
            System.out.println("No change");

            addToCoins(money, c5, c10, c20, c50, c100, c200, n5, n10);

            bought = 1;

        }

        return bought;

    }

    private static void addToCoins(Coins money, int c5, int c10, int c20, int c50,
            int c100, int c200, int n5, int n10) {
        money.setCoin5(money.getCoin5() + c5);
        money.setCoin10(money.getCoin10() + c10);
        money.setCoin20(money.getCoin20() + c20);
        money.setCoin50(money.getCoin50() + c50);
        money.setCoin100(money.getCoin100() + c100);
        money.setCoin200(money.getCoin200() + c200);
        money.setNota5(money.getNota5() + n5);
        money.setNota10(money.getNota10() + n10);

    }
}
