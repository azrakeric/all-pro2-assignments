public class Game {
//   private String map[] = { "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#",
//                            "#","#","#","#","#"};
   String[][] map = {
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",},
            {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#",}
    };

   public void spawnPlayers(int x, int y,String who){
       map[y][x] = who.replaceAll("[^\\d.]", "");
   }
    public void movePlayers(int x, int y,String who){
//        map[x][y] = who;
        map[y][x] = who.replaceAll("[^\\d.]", "");


    }
public void deletePlayer(int x,int y,String who){
       map[y][x] = "#";
}
public void checkforbattle(int x, int y, String mover){
       String setteler =null;
       if (map[y][x] != "#"){
           setteler = map[y][x];
           System.out.println("A fight has accured betwee" +mover +" and "+ setteler);
       }

}

    //   public void setPlayer(Player who){
//       map[who.y][who.x] = who.;
//   }
    public String[][] getMap(){

        return map;
    }


}
