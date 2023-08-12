package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 80;
        this.extraToppingsPrice = isVeg ? 70 : 120;
        this.paperBagPrice = 20;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
        this.price = basePrice;
    }

    public int getPrice() {
        return price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
            price += extraCheesePrice;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
            price += extraToppingsPrice;
        }
    }

    public void addTakeaway() {
        if (!paperBagAdded) {
            paperBagAdded = true;
            price += paperBagPrice;
        }
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }
        if (extraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }
        if (paperBagAdded) {
            bill.append("Paperbag Added: ").append(paperBagPrice).append("\n");
        }
        bill.append("Total Price: ").append(price).append("\n");
        return bill.toString();
    }
}
