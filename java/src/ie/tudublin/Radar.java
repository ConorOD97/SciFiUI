package ie.tudublin;

import processing.core.PApplet;

public class Radar extends PApplet{
    
    float r;

    public void settings(){
        size(500,500);
    }

    public void setup(){

    }

    public void radar(){
        
        line(250,200,250,300);
        line(200,250,300,250);
        translate(width/2,height/2);
        ellipse(0,0,20,20);
        ellipse(0,0,40,40);
        ellipse(0,0,60,60);
        ellipse(0,0,80,80);
        ellipse(0,0,100,100);
        
    }

    public void rotateLine(){
        pushMatrix();

        translate(width/2,height/2);
        rotate(radians(r));
        line(0,0,50,0);

        popMatrix();
        
        r += 0.55;
        
    }

    public void draw(){
        background(0);
        stroke(255);
        noFill();

        rotateLine();
        radar();
        
        
    }

}