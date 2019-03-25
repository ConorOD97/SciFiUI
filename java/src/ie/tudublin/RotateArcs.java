package ie.tudublin;

import processing.core.PApplet;

public class RotateArcs{

    float r,r2;
    float x = 0;
    float y = 0; 
    float xspeed = 2;
    float yspeed = 2;
    float diameter = 450;
    float diameter2 = 350;
    PApplet ui;
    float fullArc = ui.PI + ui.PI/1.5f;
    


// public void speed(float xspeed,float yspeed){
//     this.xspeed = xspeed;
//     this.yspeed = yspeed;
// }
public RotateArcs(float r,float r2,float x,float y,float xspeed,float yspeed,float diameter,float diameter2,PApplet ui,float fullArc){
    this.r = r;
    this.r2 = r2;
    this.x = x;
    this.y = y;
    this.xspeed = xspeed;
    this.yspeed = yspeed;
    this.diameter = diameter;
    this.diameter2 = diameter2;
    this.fullArc = fullArc;
    this.ui = ui;
}

public void RotatingCircle(){
    
    ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r));
        ui.arc(x, y, diameter, diameter, 0, fullArc);
        
    ui.popMatrix();
    r += 0.55;
}


public void RotatingCircle2(){
    
    ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r2));
        ui.arc(x, y, diameter2, diameter2, 0, fullArc);
        
    ui.popMatrix();
    r2 -= 0.5;
}

// public void update(){
//     x += xspeed;
    
//     if(x > width - radius || x < 0 + radius ){
//         xspeed *= -1;
//     }
//     }

}