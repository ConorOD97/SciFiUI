package ie.tudublin;

import processing.core.PApplet;

public class RotateArcs extends PApplet{

    float r,r2;
    float x = 0;
    float y = 0; 
    float xspeed = 2;
    float yspeed = 2;
    float diameter = 450;
    float diameter2 = 350;
    float fullArc = PI + PI/1.5f;

public void settings(){
    size(500,500);
}

public void setup(){

}

// public void speed(float xspeed,float yspeed){
//     this.xspeed = xspeed;
//     this.yspeed = yspeed;
// }

public void RotatingCircle(){
    
    pushMatrix();
        translate(width/2,height/2);
        rotate(radians(r));
        arc(x, y, diameter, diameter, 0, fullArc);
        
    popMatrix();
    r += 0.55;
}
public void RotatingCircle2(){
    
    pushMatrix();
        translate(width/2,height/2);
        rotate(radians(r2));
        arc(x, y, diameter2, diameter2, 0, fullArc);
        
    popMatrix();
    r2 -= 0.5;
}

// public void update(){
//     x += xspeed;
    
//     if(x > width - radius || x < 0 + radius ){
//         xspeed *= -1;
//     }
//     }
    



public void draw(){
    background(0);
    stroke(20,255,212);
    noFill();

    //update();
    //speed(xspeed,yspeed);
    RotatingCircle();
    RotatingCircle2();
}

}