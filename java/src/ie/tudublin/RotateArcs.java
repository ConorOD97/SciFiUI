package ie.tudublin;

import processing.core.PApplet;

public class RotateArcs{

    float r,r2;
    PApplet ui;
    float fullArc;
    
public RotateArcs(float r,float r2,PApplet ui,float fullArc){
    this.r = r;
    this.r2 = r2;
    this.fullArc = fullArc;
    this.ui = ui;
}

public void RotatingCircle(){
    
    ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r));
        ui.arc(0,0,450,450,0,fullArc);
        
    ui.popMatrix();
    r += 0.55;
}


public void RotatingCircle2(){
    
    ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r2));
        ui.arc(0,0,410, 410, 0, fullArc);
        
    ui.popMatrix();
    r2 -= 0.5;
}

}