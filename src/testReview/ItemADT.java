/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testReview;

/**
 *
 * @author Sean
 */
public interface ItemADT {
    public String description();
    public double suggestedRetailPrice();
    public boolean onSale();
    public double currentPrice();
    public void change(double amount);
    public void changeSaleStatus(boolean status);
    @Override
    public String toString();
}
