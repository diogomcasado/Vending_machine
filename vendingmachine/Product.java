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
public class Product {
    String nome;
    double price;
    int quantity;
    int cod;
    
    public Product(){
        this.nome = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    public Product(String nome, double price, int quantity, int cod){
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
        this.cod = cod;
    }
    
    public String viewProduct(){
        return "\nName: " + nome +
                "\nPrice: " + price +
                "\nQuantity: " + quantity;
    }
    
    public String viewQuant(){
        return "\nCode: " + cod +
                " Name: " + nome +
                " Quantity: " + quantity;
    }
    
    public String list(){
        return "\nCode: " + cod + " " + nome + " " + price;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public int getCod(){
        return cod;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }
    
    
    
    
    
}
