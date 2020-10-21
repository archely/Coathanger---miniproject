import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/*@author:Arda Burak Atila
Neptun code:OL1BB5
Date:19.10.2020
*/


public class Coathanger  implements Serializable{

    String hangerType;
    int hangerModel;
    int hangerPrice;
    int hangerColor;
    int hangerWeight;


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


        System.out.println("\n1, hanger\n");


        System.out.println("Hanger type: " + object1.hangerType + "\nHanger model: "  + object1.hangerModel + "\nHanger price: "
        object1.hangerPrice + "\nHanger color: " + object1.hangerColor);

        System.out.println("\n2, hanger\n");

        System.out.println("Hanger type: " + object2.hangerType + "\nHanger model: "  + object2.hangerModel + "\nHanger price: "
                object1.hangerPrice + "\nHanger color: " + object2.hangerColor);

    }



    public void isCoatHeavy() {

        // check your coat weight

        if (this.hangerWeight.yourCoatWeight() < 50) {
            System.out.println(this.Hanger.yourCoatType() + " is so light!. Coat hanger is available for this weight! ");

        } else if (this.hangerWeight.yourCoatWeight() == 50) {
            System.out.println(this.Hanger.yourCoatType() + "is OK. Coat hanger is available for this weight!.");
        }

        else {
            System.out.println(this.hangerWeight.yourCoatType() + "is so heavy. Coat hanger ia NOT available for this weight!")
        }
    }


    @Override
    public void notification(String message) {
        System.out.println(message);
    }

    @Override
    public void isCoathangerAlert(){ //Alert

        System.out.println("bib");
    }

    public static int i = 0;
    public void isSleepMode()
    {
        System.out.println("The system is shutting now..");
        System.out.println("Timer ran " + ++i);
    }

    public static void main(String[] args) //Timer.
    {

        Timer timer = new Timer();
        TimerTask process = new Helper();

        timer.schedule(process, 10, 10);

    }
}




