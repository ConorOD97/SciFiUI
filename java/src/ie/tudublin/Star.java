package ie.tudublin;

import processing.core.PApplet;

public class Star extends PApplet{
    
    public void settings(){
        size(500,500);
    }

    public void setup(){

    }

    public void stars(){
        translate(width/2,height/2);
        fill(255,225,0);
        ellipse(0,0,5,5);
        noFill();
        triangle(0,20,-20,-10,20,-10);
        triangle(0,-20,-20,10,20,10);
    }

    public void draw(){
        background(0);
        stroke(255);
        
        stars();
    }

}