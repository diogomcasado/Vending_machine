/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import static java.lang.Math.round;

/**
 *
 * @author dicasado
 */
public class Coins {

    int coin5 = 0;
    int coin10 = 0;
    int coin20 = 0;
    int coin50 = 0;
    int coin100 = 0;
    int coin200 = 0;
    int nota5 = 0;
    int nota10 = 0;

    //  scan.validate();
    public Coins() {
        this.coin5 = 0;
        this.coin10 = 0;
        this.coin20 = 0;
        this.coin50 = 0;
        this.coin100 = 0;
        this.coin200 = 0;
        this.nota5 = 0;
        this.nota10 = 0;
    }

    public Coins(int coin5, int coin10, int coin20, int coin50, int coin100, int coin200, int nota5, int nota10) {
        this.coin5 = coin5;
        this.coin10 = coin10;
        this.coin20 = coin20;
        this.coin50 = coin50;
        this.coin100 = coin100;
        this.coin200 = coin200;
        this.nota5 = nota5;
        this.nota10 = nota10;
    }

    public String viewCoins() {
        return "Moedas de 5: " + coin5
                + "\nMoedas de 10: " + coin10
                + "\nMoedas de 20: " + coin20
                + "\nMoedas de 50: " + coin50
                + "\nMoedas de 1e: " + coin100
                + "\nMoedas de 2e: " + coin200
                + "\nNotas de 5e: " + nota5
                + "\nNotas de 10e: " + nota10;
    }

    public int giveChange(double trocoInicial) {

        int estado = 0;
        double troco = round(trocoInicial * 100);

        do {

            if (((troco - 1000) >= 0) && this.getNota10() > 0) {
                troco = troco - 1000;
                this.setNota10(this.getNota10() - 1);
                System.out.println("10e bill");
                estado = 1;
            } else if (((troco - 500) >= 0) && this.getNota5() > 0) {
                troco = troco - 500;
                this.setNota5(this.getNota5() - 1);
                System.out.println("5e bill");
                estado = 1;

            } else if (((troco - 200) >= 0) && this.getCoin200() > 0) {
                troco = troco - 200;
                this.setCoin200(this.getCoin200() - 1);
                System.out.println("2e coin");
                estado = 1;

            } else if (((troco - 100) >= 0) && this.getCoin100() > 0) {
                troco = troco - 100;
                this.setCoin100(this.getCoin100() - 1);
                System.out.println("1e coin");
                estado = 1;

            } else if (((troco - 50) >= 0) && this.getCoin50() > 0) {
                troco = troco - 50;
                this.setCoin50(this.getCoin50() - 1);
                System.out.println("0.50 coin");
                estado = 1;

            } else if (((troco - 20) >= 0) && this.getCoin20() > 0) {
                troco = troco - 20;
                this.setCoin20(this.getCoin20() - 1);
                System.out.println("0.20 coin");
                estado = 1;

            } else if (((troco - 10) >= 0) && this.getCoin10() > 0) {
                troco = troco - 10;
                this.setCoin10(this.getCoin10() - 1);
                System.out.println("0.10 coin");
                estado = 1;

            } else if (((troco - 5) >= 0) && this.getCoin5() > 0) {

                if ((this.getCoin5() * 5) >= troco) {

                    troco = troco - 5;
                    this.setCoin5(this.getCoin5() - 1);
                    System.out.println("0.05 coin");
                    estado = 1;
                } else {
                    estado = 0;
                    troco = 0;
                    return estado;
                }

            } else {
                estado = 0;
                troco = 0;
            }

        } while (troco > 0);

        return estado;
    }

//GETTER & SETTERS
    public void setCoin5(int coin5) {
        this.coin5 = coin5;
    }

    public void setCoin10(int coin10) {
        this.coin10 = coin10;
    }

    public void setCoin20(int coin20) {
        this.coin20 = coin20;
    }

    public void setCoin50(int coin50) {
        this.coin50 = coin50;
    }

    public void setCoin100(int coin100) {
        this.coin100 = coin100;
    }

    public void setCoin200(int coin200) {
        this.coin200 = coin200;
    }

    //---
    public int getCoin5() {
        return coin5;
    }

    public int getCoin10() {
        return coin10;
    }

    public int getCoin20() {
        return coin20;
    }

    public int getCoin50() {
        return coin50;
    }

    public int getCoin100() {
        return coin50;
    }

    public int getCoin200() {
        return coin50;
    }

    public int getNota5() {
        return nota5;
    }

    public int getNota10() {
        return nota10;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5;
    }

    public void setNota10(int nota10) {
        this.nota10 = nota10;
    }

}
