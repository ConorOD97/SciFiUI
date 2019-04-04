package ie.tudublin;

import java.util.Random;

import processing.core.PApplet;

public class Radar{
    float r;
    PApplet ui;

    public Radar(float r, PApplet ui){
        this.r = r;
        this.ui = ui;
    }
    public void radar(){
        ui.stroke(37,255,3);
        ui.noFill();
        ui.ellipse(ui.width/2,ui.height/2,110,110);
        ui.stroke(53,128,41);
        ui.noFill();
        ui.pushMatrix();
            ui.translate(ui.width/2,ui.height/2);
            ui.line(0,-50,0,50);
            ui.line(-50,0,50,0);
            ui.ellipse(0,0,20,20);
            ui.ellipse(0,0,40,40);
            ui.ellipse(0,0,60,60);
            ui.ellipse(0,0,80,80);
            ui.ellipse(0,0,100,100);
        ui.popMatrix();
        
    }

    public void rotateLine(){
        ui.stroke(53,128,41);
        ui.pushMatrix();

        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r));
        ui.line(0,0,50,0);

        ui.popMatrix();
        
        r += 0.55;
        
    }

    public void Dot(){
        ui.noStroke();
        ui.pushMatrix();
            ui.translate(ui.width/2,ui.height/2);
            ui.fill(255,0,0);
            ui.ellipse(30,30,10,10); // x,y,width,hiehgt
        ui.popMatrix();

    }

}