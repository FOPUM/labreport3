
package labreport3;

import java.util.Random;

public class Money {
    private int amount;
    private int money;
    private double rm;
    
    public Money(){
        Random rand = new Random();
        int low = 1000, high = 100000;
        amount = rand.nextInt(high-low+1)+low;
    }
    
    public Money(int money){
        amount = money;
    }
    
    public Money(int[]moneyArr){
        for(int i=0; i<moneyArr.length; i++){
            this.amount += moneyArr[i];
        }
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public void addMoney (Money a){
        this.amount += a.amount;
    }
    
    public int quantity(int amount, int cents){
        int quantity = amount/cents;
        this.money = amount%cents;
        return quantity;
    }

    @Override
    public String toString() {
        money = amount;
        rm = (double)amount/100;
        String str;
        str = String.format("Amount = %dcents  (RM%.2f)\n", amount, rm);
        str += String.format("%-12squantity=%4d\n","RM100",quantity(money,10000));
        str += String.format("%-12squantity=%4d\n","RM50",quantity(money,5000));
        str += String.format("%-12squantity=%4d\n","RM20",quantity(money,2000));
        str += String.format("%-12squantity=%4d\n","RM10",quantity(money,1000));
        str += String.format("%-12squantity=%4d\n","RM5",quantity(money,500));
        str += String.format("%-12squantity=%4d\n","RM1",quantity(money,100));
        str += String.format("%-12squantity=%4d\n","50cents",quantity(money,50));
        str += String.format("%-12squantity=%4d\n","20cents",quantity(money,20));
        str += String.format("%-12squantity=%4d\n","10cents",quantity(money,10));
        str += String.format("%-12squantity=%4d\n","5 cents",quantity(money,5));
        str += String.format("%-12squantity=%4d\n","1 cents",money);
        return str;
    }
    
    

    
}
