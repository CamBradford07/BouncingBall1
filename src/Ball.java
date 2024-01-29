import java.awt.*;
public class Ball {
    private int size;
    private Color color;
    private int xspeed, yspeed;
    private int x,y;

    public Ball(int x, int y, int size, int xspeed, int yspeed,int r,int g, int b){
this.x = x;
this.y = y;
this.size = size;
this.xspeed = xspeed;
this.yspeed = yspeed;
color = new Color(r, g, b);
    }

    public void draw(Graphics g2){

        g2.setColor(color);
        g2.fillOval(x, y,size,size);
    }

public void move(int width, int height){
        x += xspeed;
        if(x > width - size || x < 0){
            xspeed *= -1;
        }
       y += yspeed;
        if(y > height - size || y < 0){
            yspeed *= -1;
        }

}


}
