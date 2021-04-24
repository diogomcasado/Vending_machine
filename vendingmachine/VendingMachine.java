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
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int code;

        Coins money = new Coins(0, 0, 0, 0, 0, 0, 0, 0);

        Product coca = new Product("Coca-Cola", 0.70, 0, 1);
        Product pepsi = new Product("Pepsi", 0.65, 0, 2);
        Product icetea = new Product("Ice Tea", 0.60, 0, 3);

        insertCoins(money);
        System.out.println(money.viewCoins());

        insertProducts(coca, pepsi, icetea);

        do {
           
            System.out.println(coca.list() + pepsi.list() + icetea.list());
            System.out.println("Insert a code: ");
            code = Input.lerInt();
            Menu.vending(code, money, coca, pepsi, icetea);

        } while (code != 0);

    }

    public static void insertCoins(Coins money) { //insere moedas

        int c5, c10, c20, c50, c100, c200, n5, n10;

        System.out.println("Insert number of 0.05 coins: ");

        do {
            c5 = Input.lerInt();
            if (c5 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c5 < 0);
        money.setCoin5(c5);

        System.out.println("Insert number of 0.10 coins: ");
        do {
            c10 = Input.lerInt();
            if (c10 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c10 < 0);
        money.setCoin10(c10);

        System.out.println("Insert number of 0.20 coins: ");
        do {
            c20 = Input.lerInt();
            if (c20 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c20 < 0);
        money.setCoin20(c20);

        System.out.println("Insert number of 0.50 coins: ");
        do {
            c50 = Input.lerInt();
            if (c50 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c50 < 0);
        money.setCoin50(c50);

        System.out.println("Insert number of 1e coins: ");    //1e
        do {
            c100 = Input.lerInt();
            if (c100 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c100 < 0);
        money.setCoin100(c100);

        System.out.println("Insert number of 2e coins: ");   // 2e
        do {
            c200 = Input.lerInt();
            if (c200 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (c200 < 0);
        money.setCoin200(c200);
        
        System.out.println("Insert number of 5e bills: ");   // 5e
        do {
            n5 = Input.lerInt();
            if (n5 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (n5 < 0);
        money.setNota5(n5);
        
        System.out.println("Insert number of 10e bills: ");   // 10e
        do {
            n10 = Input.lerInt();
            if (n10 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (n10 < 0);
        money.setNota10(n10);
    }

    public static void insertProducts(Product coca, Product pepsi, Product icetea) {
        int quant1, quant2, quant3;

        System.out.println("Insert number of Coca-Colas: ");
        do {
            quant1 = Input.lerInt();
            if (quant1 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (quant1 < 0);
        coca.setQuantity(quant1);

        System.out.println("Insert number of Pepsis: ");
        do {
            quant2 = Input.lerInt();
            if (quant2 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (quant2 < 0);
        pepsi.setQuantity(quant2);

        System.out.println("Insert number of Ice Teas: ");
        do {
            quant3 = Input.lerInt();
            if (quant3 < 0) {
                System.out.println("Insert a positive number: ");
            }
        } while (quant3 < 0);
        icetea.setQuantity(quant3);

    }

}
