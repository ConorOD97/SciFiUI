package ie.tudublin;

import processing.core.PApplet;
public class Button{
    
    PApplet ui;
    float x = -250; float y = 100;   //First Rectangle
    float x1 = 50; float y1 = 100; //Second Rectangle

    float w = 200; float h = 75;   //First Rectangle
    float w1 = 200; float h1 = 75; //Second Rectangle

    String txt1; String txt2;
    public Button(PApplet ui,float x, float y, float x1, float y1, float w,
    float h, float w1, float h1,String txt1,String txt2){
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.x1 = x1;
        this.y1 = y1;
        this.w = w;
        this.h = h;
        this.w1 = w1;
        this.h1 = h1;
        this.txt1 = txt1;
        this.txt2 = txt2;
    }

    public void drawButton(){
        ui.pushMatrix();
            ui.stroke(3,255,221);
            ui.translate(ui.width/2,ui.height/2);
            ui.rect(-250,100,200,75);
            ui.rect(50,100,200,75);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.text(txt1,x + w * 0.5f, y + h * 0.5f);
            ui.text(txt2,x1 + w1 * 0.5f, y1 + h1 * 0.5f);
        ui.popMatrix();
    }
}