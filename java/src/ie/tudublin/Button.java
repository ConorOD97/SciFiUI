package ie.tudublin;

import processing.core.PApplet;
public class Button{
    
    //declaring variables
    PApplet ui;
    float x; float y;   //First Rectangle
    float x1; float y1; //Second Rectangle

    float w; float h;   //First Rectangle
    float w1; float h1; //Second Rectangle

    String txt1; String txt2;

    //constructor method
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

    //method for welcoming user onto the spacecraft
    public void Title(){
        ui.stroke(252,231,70);
        ui.textSize(25);        //sets the text size
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("WELCOME ABOARD",400,200);  //used to display the text
        ui.line(250,225,550,225);           //x,y,x1,y1
    }
    public void drawButton(){
        ui.pushMatrix();                    //used to tranlate on the button and not everything on screen
            ui.stroke(3,255,221);
            ui.translate(ui.width/2,ui.height/2);  //translates buttons a specified origin
            ui.rect(-250,100,200,75);               //x,y,width,height
            ui.rect(50,100,200,75);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.text(txt1,x + w * 0.5f, y + h * 0.5f); //text,x,y
            ui.text(txt2,x1 + w1 * 0.5f, y1 + h1 * 0.5f);
        ui.popMatrix();
    }
}



