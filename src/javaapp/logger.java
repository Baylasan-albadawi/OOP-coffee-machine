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
 * @author Baylasan
 */
public abstract class logger implements Log {
    
    @Override
    public void log (String message){
        try {
            FileWriter file =new FileWriter(new File(message), true);
        } catch (IOException ex) {
            Logger.getLogger(logger.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    public void saveSettings() {
        try {
            try (FileOutputStream fileOut = new FileOutputStream("coffee_machine.ser"); 
                    ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(this);
                out.close();
            }
        } catch (IOException i) {
        }
    }
}
