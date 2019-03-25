package ie.tudublin;

import processing.core.PApplet;

public class MoveLine extends PApplet{
    
    float x = 0;
    float x2 = 0;
    float x3 = 500;
    float y = 0;
    float y2 = 500;
    float y3 = 250;
    float xspeed = 2;
    float yspeed = 2;

    public void settings(){
        size(500,500);
    
    }

    public void setup(){

    }

    public void LineMove(){
        line(x2,y,x2,y2);
        line(x,y3,x3,y3);
    }

    public void updateLine(){
        x2 += xspeed;

        if (x2 > width || x2 < 0){
            xspeed *= -1;
        }    
    }
    public void updateLine2(){
         y3 += yspeed;

         if(y3 > height || y3 < 0){
             yspeed *= -1;
         }
    }

    public void draw(){
        background(0);
        stroke(255);

        updateLine();
        updateLine2();
        LineMove();
    }
}