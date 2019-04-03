package ie.tudublin;

import processing.core.PApplet;

public class Radar{
    float r;
    PApplet ui;

    public Radar(float r, PApplet ui){
        this.r = r;
        this.ui = ui;
    }
    public void radar(){
        ui.pushMatrix();
        ui.line(250,200,250,300);
        ui.line(200,250,300,250);
        ui.translate(ui.width/2,ui.height/2);
        ui.ellipse(0,0,20,20);
        ui.ellipse(0,0,40,40);
        ui.ellipse(0,0,60,60);
        ui.ellipse(0,0,80,80);
        ui.ellipse(0,0,100,100);
        ui.popMatrix();
        
    }

    public void rotateLine(){
        ui.pushMatrix();

        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r));
        ui.line(0,0,50,0);

        ui.popMatrix();
        
        r -= 0.55;
        
    }

}