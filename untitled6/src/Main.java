public class Main {

    public static void main(String[] args) {

        Lennard myPlayer = new Lennard("G?ZA");

        myPlayer.Set_color("purple");
        myPlayer.set_Health(255);
//        myPlayer.set_name = "GA DOOD";

        System.out.println(myPlayer.getColor());

        System.out.println(myPlayer.get_Health());
        System.out.println(myPlayer.get_name());

    }
}
