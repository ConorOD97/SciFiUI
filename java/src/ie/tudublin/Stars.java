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
        ui.fill(255);
        ui.ellipse(x = ui.random(100,ui.width-100),y = ui.random(100,ui.height-300),10,10);
        
    }    
}
