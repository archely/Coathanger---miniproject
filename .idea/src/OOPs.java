/*
@author: Arda burak Atila
neptun code:OL1BB5
Date:14/10/2020
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Coathanger {

    String hangerType;
    int hangerModel;
    int hangerPrice;
    int hangerColor;


    // constructor
    Coathanger(String type, int model, int price, int color){
        this.hangerType = type;
        this.hangerPrice = price;
        this.hangerColor = color;
        this.hangerModel = model;
    }

    public static void main(String args[]){
        //Creating objects

        Coathanger object1 = new Coathanger("wood" , "2020" , "free" , "red");
        Coathanger object2 = new Coathanger("iron", "2010" , "50$", "blue");

        //Accessing object data through reference

        System.out.println("\n1, hanger\n");


        System.out.println("Hanger type: " + object1.hangerType + "\nHanger model: "  + object1.hangerModel + "\nHanger price: "
        object1.hangerPrice + "\nHanger color: " + object1.hangerColor);

        System.out.println("\n2, hanger\n");

        System.out.println("Hanger type: " + object2.hangerType + "\nHanger model: "  + object2.hangerModel + "\nHanger price: "
                object1.hangerPrice + "\nHanger color: " + object2.hangerColor);

    }



    public void isCoatHeavy() {

        // checks if the dog is fat or not

        if (this.Hanger.yourCoatWeight() < 50) {
            System.out.println(this.Hanger.yourCoatType() + " is so light!. Coat hanger is available for this weight! ");

        } else if (this.Hanger.yourCoatWeight() == 50) {
            System.out.println(this.Hanger.yourCoatType() + "is OK. Coat hanger is available for this weight!.");
        }

        else {
            System.out.println(this.Hanger.yourCoatType() + "is so heavy. Coat hanger ia NOT available for this weight!")
        }
    }

    public void findMyCoathanger() {
    }
