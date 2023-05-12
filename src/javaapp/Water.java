/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;


/**
 *
 * @author Baylasan
 */
public class Water {
    int level;

    public Water() {
    }

    public int getWaterlevel(){
        return level;
    }
    

    public void setWaterlevel(int waterlevel) {
       level =1000;
    }
    public void fillwatercontainer(){
        setWaterlevel(1000);
}

    public String getInfo() {
        return "Water{" + "level=" + level + '}';
    }

    
}
