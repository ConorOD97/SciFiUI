package ie.tudublin;

import processing.core.PApplet;

public class Interface extends PApplet{

    float x = 250;
    float y = 250; 
    float xspeed = 2;
    float yspeed = 1;
    float diameter = 100;
    float radius = diameter / 2;

public void settings(){
    size(500,500);
}

public void setup(){

}

public void speed(float xspeed,float yspeed){
    this.xspeed = xspeed;
    this.yspeed = yspeed;
}

public void RotatingCircle(){
    
    ellipse(x,y,diameter,diameter);
    
}

public void update(){
    x += xspeed;
    
    if(x > width - radius || x < 0 + radius ){
        xspeed *= -1;
    }
}


public void draw(){
    background(0);
    stroke(255);
    noFill();

    update();
    speed(xspeed,yspeed);
    RotatingCircle();



}

}