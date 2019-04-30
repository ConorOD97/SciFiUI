package ie.tudublin;

import processing.core.*;

public class Stars{

    PApplet ui;
    float x;
    float y;

    public Stars(PApplet ui,float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    public void render(){
        ui.ellipse(x = ui.random(0,ui.width),y = ui.random(0,ui.height),ui.random(0,50),ui.random(0,50));
        
    }    
}
