
public class Lennard
{
    private int _Health = 100;

    public int get_Health() {
        return _Health;
    }
    public void set_Health(int value)
    {
        if (value <= 0){
            value= 0;
        }
        else if (value >= 100){
            value = 100;
        }


        _Health = value;

    }

    private String _name = "Lennard";
    public String get_name(){
    return _name;
}
    public void set_name(String player_name){

    }
    private String _Special = "autisme";




    public String get_Special(){
        return _Special;
    }

    public Lennard(String newName){
        _name = newName;
    }












    public String color = "purple";
    public String getColor(){
        return color;
    }
    public void Set_color(String inputcolor){
    if(inputcolor != "Red") {
        inputcolor = "red";
    }
    else if (inputcolor != "Blue"){
        inputcolor = "blue";
    }
    else if (inputcolor != "Green"){
        inputcolor = "Green";
    }
    color = inputcolor;
}
}

