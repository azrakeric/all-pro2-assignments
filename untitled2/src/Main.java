public class Main {

    public static void main(String[] args)
    {

        int random = (int) Math.ceil(Math.random() * 10);

        System.out.println(random);

        switch (random)
        {
            case 3:
            System.out.println("switch 3");
            break;
            case 6:
                System.out.println("CASE 6");
                break;
            case 1: case 2:
            case 4: case 8:
                System.out.println("CASE 1 2 4 of 8");
                break;



        }

        if (random >= 8)
        {

        System.out.println("getal is 8 of hoger");

        }

        else if (random == 7)
        {

            System.out.println("het getal is 7 ");

        }

        else if (random > 3 && random < 7)
        {

            System.out.println("Het getal is meer dan 3 maar minder dan 7");

        }

        else
            {

            System.out.println("het is lager dan 8");
            }

            if (random == 1 || random == 3)
            {
                System.out.println("het getal is 1 of 3 ");
            }


        System.out.println();

        System.out.println("einde programma XD");

        }
    }

