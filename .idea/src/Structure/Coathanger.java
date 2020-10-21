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

        System.out.println("\nPlease select from menu:" + "\n1.Choose your coathanger color" + "\n2.weight measurer" + "\n3.Did my coat fall off the hanger?" + "\n4.exit" ); //select to menu

        Scanner menu_Options = new Scanner(System.in);
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


        else if(coat==50){
            System.out.println("This jacket is OK. Coat hanger is available for this weight!");


        }else{
            System.out.println("This jacket is so heavy. Coat hanger ia NOT available for this weight! ");
            System.out.println("Please change it!");
        }

    }


    public class alert{
        public void sensor(){
            int choice =1 ;

            try{


                System.out.println("Do you want to know the condition of the dress? 1/Y,2/N ");
                //User input if yes press 1  or if no press 2

                Scanner choice = new Scanner(System.in);
                int coat= choice.nextInt();

                if ( coat == 1 ){
                    System.out.println("What do you want?\n" + "1. check my dress " + "2.Play sound" + "3.exit"); //menu options

                    Scanner check = new Scanner (System.in);
                    int checkSystem = check.nextInt();
                    switch(checkSystem){

                        case 1:
                            measurer(); //determines the condition of the dress according to its weight.
                            break;
                        case 2:
                            sound();//determines the location of the dress according to its sound.
                            break;
                        case 3:
                            System.out.println(" returning to main menu... ");
                            break;
                }else {
                    System.out.println("Unsuccessful choice");
                }

                //Invalid
            }catch(Exception e){
                System.out.println("Error! Please try again.\n"+ "1.check my dress\n"+  "2.Play sound\n" + "3.Exit");}
        }
    }

