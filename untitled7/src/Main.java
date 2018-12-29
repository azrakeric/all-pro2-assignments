import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static final int EVENT_INDEX = 0;
    private static final int TITLE_INDEX = 1;
    private static final int DESCRIPTION_INDEX = 2;
    private static final int YEAR_INDEX = 0;
    private static final int MONTH_INDEX = 2;
    private static final int DAY_INDEX = 1;


    public static void main(String[] args) {

        boolean passed = false;
        DateFormat Year = new SimpleDateFormat("yyyy");
        DateFormat Month = new SimpleDateFormat("MM");
        DateFormat Day = new SimpleDateFormat("DD");
        int status = 1;
        int[] datums = new int[]{0};
        String[] waardes = new String[]{null};
        Scanner sc = new Scanner(System.in);


        while (status == 1) {
            Date date = new Date();
            int afs = 0;

            System.out.println(Month.format(date));
            System.out.println("MAIN MENU");


            System.out.println("########################");
            System.out.println("1 = Toevoegen");
            System.out.println("2 = Bewerken");
            System.out.println("3 = Verwijderen");
            System.out.println("4 = Turndown");

            System.out.println("########################");

            int Doel = sc.nextInt();
            switch (Doel) {
                case 1:
                    System.out.println("You have selected Toevoegen");

                    System.out.println("########################");
                    System.out.println("1 = Deadline");
                    System.out.println("2 = Afspraak");
                    System.out.println("########################");

                    int or = sc.nextInt();

                    switch (or) {
                        case 1:
                            System.out.println("Deadline");
                            afs = 1;
                            break;
                        case 2:
                            System.out.println("Afspraak");
                            afs = 2;
                            break;
                        default:
                            System.out.println("You Stupid I say Afspraak");
                            afs = 2;
                    }


                    datums = toevoegenD(passed, afs);


                    System.out.println("======================================");


                    waardes = toevoegenW(afs, sc, datums);


                    System.out.println("you have made the activity as listed below");
                    System.out.println("day: " + datums[DAY_INDEX]);
                    System.out.println("======================================");

                    System.out.println("month: " + datums[MONTH_INDEX]);
                    System.out.println("======================================");

                    System.out.println("year: " + datums[YEAR_INDEX]);
                    System.out.println("======================================");


                    System.out.println("title: " + waardes[TITLE_INDEX]);
                    System.out.println("======================================");

                    System.out.println("descripton: " + waardes[DESCRIPTION_INDEX]);
                    System.out.println("======================================");

                    System.out.println("its a " + waardes[EVENT_INDEX]);
                    System.out.println("======================================");

                    try {
                        FileWriter fw;
                        fw = new FileWriter(new File("mytextfile.XRM"));
                        fw.write(System.lineSeparator()); //new line

                        fw.write("Title : "+waardes[TITLE_INDEX]);
                        fw.write(System.lineSeparator());
                        fw.write("Description : "+waardes[DESCRIPTION_INDEX]);

                        fw.write(System.lineSeparator());
                        fw.write("Event : "+waardes[EVENT_INDEX]);

                        fw.write(System.lineSeparator());
                        fw.write("Day  : "+datums[DAY_INDEX]);

                        fw.write(System.lineSeparator());
                        fw.write("Month : "+datums[MONTH_INDEX]);

                        fw.write(System.lineSeparator());
                        fw.write("Year : "+datums[YEAR_INDEX]);
                        fw.write(System.lineSeparator());



                        fw.close();

                    }
                    catch (IOException ex){
                        System.out.println("ERROR0001");
                    }




                    break;
                case 2:
                    System.out.println("you selected Bewerken");

                    Bewerken(datums, waardes);
                    break;
                case 3:
                    System.out.println("three");
                    Verwijderen();
                    break;
                case 4:
                    System.out.println("Booting of, Goodbye");
                    status = 0;
                    break;


                default:
                    System.out.println("You Stupid");
            }
        }
    }


    public static int[] toevoegenD(boolean passed, int afs) {
        DateFormat Year = new SimpleDateFormat("yyyy");
        DateFormat Month = new SimpleDateFormat("MM");
        DateFormat Day = new SimpleDateFormat("DD");
        Scanner sc = new Scanner(System.in);

        Date date = new Date();


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
        } else if (afs == 2) {
            event = "Afspraak";
        }

        System.out.println("in what year do you want to add the ");
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
                    monthString = "Not know to hUmAnS";
                    break;
            }
            System.out.println("allright so " + monthString + " it is ");

            if (Yearf == cYear) {
                SameYear = true;
                if (Monthf < cMonth) {
                    SameMonth = true;
                    System.out.println("WAIT A SEDCOND this issnt possible but OKAY");
                }

            } else {
                System.out.println("AI");


            }


            System.out.println("What day do you want the " + event + " to happen ?");
            int Dayf = sc.nextInt();

            if (SameYear && SameMonth && Dayf < cDay) {

                System.out.println("WAIT A SEDCOND this issnt possible");


            } else {
                System.out.println("allright on " + Dayf + " " + Monthf + " " + Yearf + " to happen ?");
                System.out.println("So if i have this right on " + Dayf + " " + Monthf + " " + Yearf + " You have planned a " + event + "!");
                int[] data = new int[3];
                data[DAY_INDEX] = Dayf;
                data[MONTH_INDEX] = Monthf;
                data[YEAR_INDEX] = Yearf;

                return data;
            }
        } else {
            System.out.println("STOOPID");

            return null;
        }
        return null;
    }


    public static String[] toevoegenW(int afs, Scanner sc, int[] datums) {
        DateFormat Year = new SimpleDateFormat("yyyy");
        DateFormat Month = new SimpleDateFormat("MM");
        DateFormat Day = new SimpleDateFormat("DD");

        Date date = new Date();

        int cYear = Integer.parseInt(Year.format(date));
        System.out.println(cYear);
        int cMonth = Integer.parseInt(Month.format(date));
        int cDay = Integer.parseInt(Day.format(date));

        if (datums[YEAR_INDEX] >= cYear) {


            System.out.println("what will be the title ?");
            String title = sc.next();
            String[] values = new String[3];

            values[TITLE_INDEX] = title;
            String event = "";
            if (afs == 1) {
                event = "Deadline";
                values[EVENT_INDEX] = event;

            }
            if (afs == 2) {
                event = "Afspraak";
            }

            System.out.println("allright you are going to do " + title);
            System.out.println("do you want to add a description ?");

            System.out.println("########################");
            System.out.println("1 = YES");
            System.out.println("2 = NO");
            System.out.println("########################");
            int descdes = sc.nextInt();

            switch (descdes) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("You have selected YES");
                    System.out.println("What will the description be ?");
                    String description = scanner.nextLine();
                    values[DESCRIPTION_INDEX] = description;
                    System.out.println(description);
                    return values;
                case 2:
                    System.out.println("You have selected NO");
                    values[DESCRIPTION_INDEX] = "NO description";

                    return values;
                default:
                    System.out.println("You stupid, arent you ?");

            }
        }


        return null;
    }


    public static void Bewerken(int[] datums, String[] waardes) {
        System.out.println("welcome");

        if (datums[0] == 0){
            System.out.println("you haven't made any Afspraaken or Deadline's");
        }
        else{
            System.out.println(waardes[TITLE_INDEX]);
        }
    }

    public static void Verwijderen() {

    }


}
