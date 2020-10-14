import java.util.Scanner;
import java.io.*;

/*@author:Arda Burak Atila
Neptun code:OL1BB5
Date:06.09.2020
Description: assessment of the dress weight and
you will be able to learn the situation your dress remotely from application
also if you want you can change color your coathanger
*/

public class Coathanger {




      public void coathanger() {

         System.out.println("Please select from menu:" + "1.Choose your coathanger color" + "2.weight measurer" + "3.Did my coat fall off the hanger?" + "4.exit" ); //select to menu

         Scanner selectMenu = new Scanner(System.in);
         int option = menu_Options();//input

        if (option == 1 ){
          coathanger_color();
        }


         else if (option == 2){
            weightMeasurer();

         }
         else if (option == 2){
            sensor();

         }
         else if(option == 3){
            exit(System.out.println("Shutingdown"));

         }
         else{
           System.out.println("Enter valid number!")
         }

      }

      public  void coathanger_color() {

    		String[] color = new String[5]; //There are 5 colors

        Coathanger_color[0] = "red";

        Coathanger_color[1] = "orange";

        Coathanger_color[2] = "green";

        Coathanger_color[3] = "blue";

        Coathanger_color[4] ="white";

    		System.out.println("Please choose color for coathanger" + "\n1."+ Coathanger_color[0] + "\n2."+ Coathanger_color[1] + "\n3."+ Coathanger_color[2] + "\n4."+ Coathanger_color[3] + "5\n" + Coathanger_color[4]);
        Scanner scnr = new Scanner(System.in);//You can choose any color
        int color = scnr.nextInt(); //Input

        System.out.println("Great choice!"+ Coathanger_color[color-1]+ "updated");


     		}


     public  void weightMeasurer() {



    System.out.println("please write your coat weight!! "); //
    Scanner scanner = new Scanner(System.in);
    int coat= scanner.nextInt(); //Input

  //Weight limit is max50

    if(coat < 50){
       System.out.println("This jacket is so light!. Coat hanger is available for this weight! ");
    }
