package ie.tudublin;

import processing.core.PApplet;

public class Interface extends PApplet{

    float x = 250;
    float y = 250; 
    float diameter = 100;

public void settings(){
    size(500,500);
}

public void setup(){

}

public void RotatingCircle(){
    
    ellipse(x,y,diameter,diameter);
    
    
}


public void draw(){
    background(0);
    stroke(255);
    noFill();


    RotatingCircle();



}

}