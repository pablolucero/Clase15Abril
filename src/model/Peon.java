package model;

public class Peon {

    private Color color;
    public int x;
    public int y;

    public Peon(Color c){
        color = c;
        y = (c.equals(Color.BLANCO)) ? 7 : 2;
    }

    public void mover(){
        if (color.equals(Color.BLANCO)){
            y--;
        }
        else{
            y++;
        }
    }

    public Color getColor() {
        return color;
    }

}
