package ie.tudublin;

import processing.core.PApplet;

public class Controls{

    PApplet ui;

    public Controls(PApplet ui){
        this.ui = ui;
    }

    //method to draw the control panel board
    public void Board(){

            ui.background(200);
            ui.stroke (3,255,230);
            ui.fill(0);
            ui.rect(50,50,700,450,15);
            ui.fill(87,89,89);
            ui.rect(50,525,700,200,10);
            ui.fill(0);
            ui.rect(95,595,110,110);
    }
    //method to turn on targeting system button
    public void Onbutton1(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(0,255,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }
    //method to turn on star button and turn off targeting button
    public void Onbutton2(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(0,255,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }
    //method to draw the buttons when they are turned off
    public void Offbuttons(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }
    // method to draw the exit button
    public void exitButton(){
        ui.fill(0);
        ui.rect(400,550,100,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("EXIT",460,585);
    }
    //method to draw the box which the pie chart is placed in
    public void ChartContainer(){
        ui.fill(0);
        ui.rect(225,600,100,100);
    }

}