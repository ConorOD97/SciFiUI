package ie.tudublin;

import processing.core.PApplet;

public class Controls{

    PApplet ui;

    public Controls(PApplet ui){
        this.ui = ui;
    }

    public void Board(){
        ui.pushMatrix();
            ui.background(200);
            ui.stroke (3,255,230);
            ui.fill(0);
            ui.rect(50,50,700,450,15);
            ui.fill(87,89,89);
            ui.rect(50,525,700,200,10);
            ui.fill(0);
            ui.rect(95,595,110,110);
        ui.popMatrix();
    }

    public void Onbutton1(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(0,255,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
    }

    public void Onbutton2(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(0,255,0);
        ui.rect(400,650,50,50);
    }

    public void Offbuttons(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
        // ui.textAlign();
        
    }

    public void ChartContainer(){
        ui.fill(0);
        ui.rect(225,600,100,100);
    }

}