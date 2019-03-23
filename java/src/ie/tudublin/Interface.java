package ie.tudublin;

import processing.core.PApplet;

public class Interface extends PApplet{

    float r;
    float x = 0;
    float y = 0; 
    float xspeed = 2;
    float yspeed = 1;
    float diameter = 100;
    float radius = diameter / 2;
    float fullArc = PI + PI/1.5f;

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
    
    translate(width/2,height/2);
    rotate(radians(r));
    arc(x, y, diameter, diameter, 0, fullArc);
    
    r += 1;
    
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

    //update();
    //speed(xspeed,yspeed);
    RotatingCircle();



}

}