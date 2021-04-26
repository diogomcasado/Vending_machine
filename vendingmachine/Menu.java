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
public class Menu {

    public static int vending(int code, Coins money, Product coca, Product pepsi, Product icetea) {

        int opcao1;

        if (code == coca.getCod()) {
            if (confirm(coca) == 1) {
                if (Buy.BuyProduct(coca.getPrice(), money) == 1) {
                    System.out.println("--Bought");
                    coca.setQuantity(coca.getQuantity() - 1);
                } else {
                    System.out.println("--Not bought");
                }
            }

        } else if (code == pepsi.getCod()) {
            if (confirm(pepsi) == 1) {
                if (Buy.BuyProduct(pepsi.getPrice(), money) == 1) {
                    System.out.println("--Bought");
                    pepsi.setQuantity(pepsi.getQuantity() - 1);
                } else {
                    System.out.println("--Not bought");
                }
            }
        } else if (code == icetea.getCod()) {
            if (confirm(icetea) == 1) {
                if (Buy.BuyProduct(icetea.getPrice(), money) == 1) {
                    System.out.println("--Bought");
                    icetea.setQuantity(icetea.getQuantity() - 1);
                } else {
                    System.out.println("--Not bought");
                }

            }
        } else if (code == 8888) {               // codigo para abir o menu do tecnico
            do {
                opcao1 = menuTecnico();
                switch (opcao1) {
                    case 1:
                        vendingmachine.VendingMachine.insertCoins(money);
                        break;
                    case 2:
                        vendingmachine.VendingMachine.insertProducts(coca, pepsi, icetea);
                        break;

                    case 3:
                        System.out.println(money.viewCoins());
                        break;

                    case 0:
                        break;
                    default:
                        System.out.println("--Invalid option");

                }

            } while (opcao1 != 0);
        } else if (code == 0) {
            return code;
        } else {
            System.out.println("--Invalid option");
        }
        return code;

    }

    public static int menuTecnico() {
        int op;
        System.out.println("---------------------------------");
        System.out.println("| 1 - Alter coins                |");
        System.out.println("| 2 - Alter Stock                |");
        System.out.println("| 3 - See coins                  |");
        System.out.println("| 0 - Sair                       |");
        System.out.println("---------------------------------");

        op = Input.lerInt();
        return op;
    }

    private static int confirm(Product product) {
        int a;

        if (product.getQuantity() > 0) {
            System.out.println("Buy " + product.getNome() + "? (1-yes/2-no)");
            a = Input.lerInt();

        } else {
            a = 2;
            System.out.println("--Product unavailable");
        }
        return a;

    }
}
