package Input;

import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public  class Month {

  enum  month {January, Februarey, March,April, May, June,July, August,September,October,November,December}

public static void main(String[]args)
{

    int num ;
    Scanner key = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF YOUR BIRTH MONTH");

        num= key.nextInt();

        while (num<1 || num >12 )
        {

            System.out.println("ENTER THE NUMBER OF YOUR BIRTH MONTH");
            num= key.nextInt();
        }



    switch (num) {


        case 1:
            System.out.println("Your birth month is : " + month.January);
            break;

        case 2:
            System.out.println("Your birth month is : " + month.Februarey);
            break;
        case 3:
            System.out.println("Your birth month is : " + month.March);
            break;
        case 4:
            System.out.println("Your birth month is : " + month.April);
            break;
        case 5:
            System.out.println("Your birth month is : " + month.May);
            break;
        case 6:
            System.out.println("Your birth month is : " + month.June);
            break;
        case 7:
            System.out.println("Your birth month is : " + month.July);
            break;
        case 8:
            System.out.println("Your birth month is : " + month.August);
            break;
        case 9:
            System.out.println("Your birth month is : " + month.September);
            break;
        case 10:
            System.out.println("Your birth month is : " + month.October);
            break;
        case 11:
            System.out.println("Your birth month is : " + month.November);
            break;
        case 12:
            System.out.println("Your birth month is : " + month.December);
            break;


        default:
            System.out.println(" Error input");


    }

    }






}



