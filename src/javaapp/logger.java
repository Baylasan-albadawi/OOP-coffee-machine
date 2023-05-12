/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapp;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI
 */
public class logger {

    void logInfo(String message) {

    }
  
    {FileInputStream fileIn;
        ObjectInputStream in;
        try {
            fileIn = new FileInputStream("coffee_machine.ser");
            in = new ObjectInputStream(fileIn);
            in.close();
            fileIn.close();
            Coffee coffeeMachine = (Coffee) in.readObject();
        } catch (IOException ex) {
            Logger.getLogger(logger.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(logger.class.getName()).log(Level.SEVERE, null, ex);
        }}


    public void saveSettings() {
        try {
            try (FileOutputStream fileOut = new FileOutputStream("coffee_machine.ser")) {
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(this);
                out.close();
            }
        } catch (IOException i) {
        }
    }
}
