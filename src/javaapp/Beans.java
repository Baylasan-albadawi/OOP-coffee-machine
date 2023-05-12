/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Baylasan
 */
public class Beans {
   private int amount;

    public Beans() {
    }
   
    public int getAmount() {
        return amount;
    
    }
    public void setAmount(int amount) {
        amount=1000;
    }
    public void fillcoffeebeans(){                          
        setAmount(1000);
    }
    
   
    public String getInfo() {
        return "Beans{" + "amount=" + amount +'}';
    }

            
   
}
