/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;


import javax.swing.JOptionPane;



/**
 *
 * @author Baylasan
 */
public class  Coffee {
    private int waterlevel;
    private Grinder grindlevel;
    private int beans;
    private Beans b=new Beans();
    private Water w= new Water();
    private String coffeetype;
    private int cupscounter;
    private logger logger= new logger();

    public Coffee(String coffeetype,Grinder grindlevel) {
        this.grindlevel = grindlevel;
        this.coffeetype = coffeetype;
        this.logger=new logger();
        cupscounter++;
    }

    public Coffee() {
    }


    

   
    public String getCoffeetype() {
        return coffeetype;
    }

    public void setCoffeetype(String coffeetype) {
            this.coffeetype = coffeetype;
    }

    public Beans getB() {
        return b;
    }
    private int amount=b.getAmount();
    public void setB(Beans b) {
        this.b = new Beans();
    }

  
    public int getBeans() {
        return beans;
    }

    public void setBeans(int beans) {
        this.beans = beans;
    }
   
    public int getWaterlevel() {
        return waterlevel;
    }

    public int getCupscounter() {
        return cupscounter;
    }

    public void setCupscounter(int cupscounter) {
        this.cupscounter = cupscounter;
    }
    

    public void setWaterlevel(int waterlevel) {
        if (waterlevel>=30&&waterlevel<=220) {
            this.waterlevel = waterlevel;
        }
        else 
            System.out.println("Out of bound!");
        
    }

    public Grinder getGrindlevel() {
        return grindlevel;
    }

    public void setGrindlevel(Grinder grindlevel) {
        this.grindlevel = grindlevel;
    }
    public Water getW() {
        return w;
    }
    private int level=w.getWaterlevel();
    public void setW(Water w) {
        this.w = new Water();
    }

    //To refill the containers
    public void FillContainers(){
        try {
        Beans b1=new Beans() ;
        b1.fillcoffeebeans();
        Water w1=new Water();
        w1.fillwatercontainer();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    }
    int MAX_WATER_CAPACITY=220;//ml
    int MAX_BEANS_CAPACITY=14;//gram
    public void makecoffee(String type,int shots) throws Exception{
        if(type.equalsIgnoreCase("Espresso")){
                waterlevel=30*shots;beans=7*shots;
                w.setWaterlevel(level-=30*shots);
                b.setAmount(amount-=7*shots);
                System.out.println("Making Espresso!");
        }
        else {
            if(type.equalsIgnoreCase("americano"));
                if (shots==1) {
                    waterlevel=170;beans=7;
                    w.setWaterlevel(level-=170);
                    b.setAmount(amount-=7);
                }
                else{
                    waterlevel=220;beans=14;
                    w.setWaterlevel(level-=220);
                    b.setAmount(amount-=14);
                    System.out.println("Making Americano !");
                }  
        }
    
   //for caffiene and caloreis calculation:   //for caffiene and caloreis calculation:
    private final double EspressoCaffiene = 63.6; // mg
    private final double AmericanoCaffiene = 94; // mg
    private final double EspressoCalories= 3; // kcal
    private final double AmericanoCalories = 3; // kcal
    
    public void calculateCaffeineAndCalories( String coffeeType,int shots) {
        double caffeine;
        double calories;
        
        if (coffeeType.equalsIgnoreCase("espresso")) {
            caffeine = EspressoCaffiene* shots;
            calories = EspressoCalories * shots;
        } else if (coffeeType.equalsIgnoreCase("americano")) {
            caffeine = AmericanoCaffiene* shots;
            calories = AmericanoCalories * shots;
        } else {
            System.out.println("Invalid coffee type!");
            return;
        }
        
        JOptionPane.showMessageDialog(null, "Caffeine in " + shots + " shot(s) of " + coffeeType + ": " + caffeine + " mg"
                + "\nCalories in " + shots + " shot(s) of " + coffeeType + ": " + calories + " kcal"); 
        
    }
    public void serveCoffee() {
        int cupsServed = getCupscounter();
        int CLEANING_INTERVAL=10;
    if (cupsServed == CLEANING_INTERVAL) {
        System.out.println("Please clean the water tray and waste bin.");
    }
}
    

}
