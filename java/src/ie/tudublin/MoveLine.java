package ie.tudublin;

import processing.core.PApplet;

public class MoveLine{
    
    float x = 0;
    float x2 = 0;
    float x3 = 500;
    float y = 0;
    float y2 = 500;
    float y3 = 250;
    float xspeed = 2;
    float yspeed = 2;
    PApplet ui;

    public MoveLine(float x, float x2, float x3, float y, float y2, float y3, float xspeed, float yspeed, PApplet ui){
        this.x = x;
        this.x2 = x2;
        this.x3 = x3;
        this.y = y;
        this. y2 = y2;
        this.y3 =y3;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
        this.ui = ui;
    }

    public void LineMove(){
        ui.stroke(255);
        ui.line(x2,y,x2,y2);
        ui.line(x,y3,x3,y3);
    }

    public void updateLine(){
        x2 += xspeed;

        if (x2 > ui.width - 100 || x2 < 100){
            xspeed *= -1;
        }    
    }
    public void updateLine2(){
         y3 += yspeed;

         if(y3 > ui.height - 350 || y3 < 100){
             yspeed *= -1;
         }
    }

}