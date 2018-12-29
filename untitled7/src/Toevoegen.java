import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
public class Toevoegen {

    public static int[]  Toevoegen(){
    DateFormat Year = new SimpleDateFormat("yyyy");
    DateFormat Month = new SimpleDateFormat("MM");
    DateFormat Day = new SimpleDateFormat("DD");
    Scanner sc = new Scanner(System.in);

    Date date = new Date();

    int afs = 0; {

        int cYear = Integer.parseInt(Year.format(date));
        System.out.println(cYear);
        int cMonth = Integer.parseInt(Month.format(date));
        int cDay = Integer.parseInt(Day.format(date));

        String event = "";
        boolean SameYear = false;
        boolean SameMonth = false;
        boolean SameDay = false;
        if (afs == 1) {
            event = "Deadline";
        }
        if (afs == 2) {
            event = "Afspraak";
        }

        System.out.println("in what year do you want to add the ");
        Scanner pip = new Scanner(System.in);
        int Yearf = sc.nextInt();
        if (Yearf >= cYear) {
            System.out.println("allright so " + Yearf + " it is ");
            System.out.println("wich month do you want ?");
            int Monthf = sc.nextInt();


            String monthString;
            switch (Monthf) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "Invalid month";
                    break;
            }
            System.out.println("allright so " + monthString + " it is ");

            if (Yearf == cYear) {
                SameYear = true;
                if (Monthf < cMonth) {
                    SameMonth = true;
                    System.out.println("WAIT A SEDCOND this issnt possible");

                }
                else{
                    System.out.println("AI");


                }


                System.out.println("What day do you want the " + event + " to happen ?");
                int Dayf = sc.nextInt();

                if (SameYear && SameMonth && Dayf < cDay) {

                    System.out.println("WAIT A SEDCOND this issnt possible");


                } else {
                    System.out.println("allright on " + Dayf + " " + Monthf + " " + Yearf + " to happen ?");
                    System.out.println("So if i have this right on " + Dayf + " " + Monthf + " " + Yearf + " You have planned a " + event + "!");
                    System.out.println("what will be the title ?");
                    String title = sc.next();
                    System.out.println("allright you are going to do" + title);
                    System.out.println("do you want to add a description ?");

                    System.out.println("########################");
                    System.out.println("1 = YES");
                    System.out.println("2 = NO");
                    System.out.println("########################");
                    int descdes = sc.nextInt();
                    switch (descdes) {
                        case 1:
                            System.out.println("You have selected YES");
                            String description = sc.next();
                            System.out.println(description);
                            break;
                        case 2:
                            System.out.println("You have selected NO");
                            break;
                        default:
                            System.out.println("You stupid, arent you ?");
                    }
                }
                int ints_event[] = new int[2];
                ints_event[0]= Dayf;
                ints_event[1] = Monthf;
                ints_event[2] = Yearf;




                return ints_event; //returning two values at once




            }

        }

        else {
            System.out.println("Reboot your brain");


            return null;
        }

        return null ;
    }

}}