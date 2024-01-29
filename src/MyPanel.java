import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MyPanel extends JPanel{
private int xloc = 200;
private int xdirection = 1;

   private Ball myBall;
   private Ball myBall2;
    private ArrayList<Ball> balls;
    private int ydirection = 1;
private int yloc = 200;
    public MyPanel(){
        setBackground(Color.GREEN);
        balls = new ArrayList<Ball>();
//        myBall = new Ball(200,300);
//        myBall2 = new Ball(100,450);
        while(balls.size() < 100){
            balls.add(new Ball((int)(Math.random() * 500), (int)(Math.random() * 500), (int)(Math.random() * 20 + 10), (int)(Math.random() * 15 + 1), (int)(Math.random() * 15 + 1),(int)(Math.random() * 255),(int)(Math.random() * 255),(int)(Math.random() * 255)));
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.setColor(Color.RED);
//        g.fillOval(xloc, 100,20,20);
        for(Ball i: balls){
            i.draw(g);
            i.move(getWidth(),getHeight());
        }

//        if(xdirection == 1) {
//            xloc += 2;
//            if(xloc >= getWidth() - 20) {
//                xdirection = 0;
//            }
//        }
//        else{
//            xloc -= 2;
//            if(xloc <= 0){
//                xdirection = 1;
//            }
//        }

        g.setColor(Color.BLUE);
        g.drawString("Hello World", 100,100);

        try {
            Thread.sleep(10);
        }
        catch (Exception e){
            System.out.println(e);
        }
        repaint();
}


}
