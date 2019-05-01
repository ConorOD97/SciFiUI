package ie.tudublin;

import processing.core.PApplet;

public class MoveLine{
    //declaring variables
    float x;
    float x2;
    float x3;
    float y;
    float y2;
    float y3;
    float xspeed;
    float yspeed;
    PApplet ui;
    //constructor method
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
    // dawing the two lines which will move
    public void LineMove(){
        ui.stroke(255);
        ui.line(x2,y,x2,y2);
        ui.line(x,y3,x3,y3);
    }
    //updating the first line
    public void updateLine(){
        x2 += xspeed; // increasing x by a value to make it move

        //if statement to change the direction the line is moving when it reaches a certain point
        if (x2 > ui.width - 100 || x2 < 100){
            xspeed *= -1;
        }    
    }

    //updating the second line but moving it along the y axis
    public void updateLine2(){
         y3 += yspeed;

         if(y3 > ui.height - 350 || y3 < 100){
             yspeed *= -1;
         }
    }

}