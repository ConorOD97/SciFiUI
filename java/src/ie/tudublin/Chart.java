package ie.tudublin;

import processing.core.PApplet;

public class Chart{

    //declaring variables and the rainfall array
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    PApplet ui;

    //constructor method
    public Chart(PApplet ui){
        this.ui = ui;
    }

    //method to draw the pie chart
    void PieChart()
    {
        float cx = 275; //x value for circle
        float cy = 650;    //y value for circle 

        float w = ui.width * 0.1f;  //width of the circle becomes 10% of the size of screen width

        float total = 0;

        //iterates through the array
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                total += rainFall[i];  //adds each rainfall value to the total
            }

            float runningSum = 0;       
            //iterates through array
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                float next = runningSum + rainFall[i];  //adds each value in the array to running sum and this is stored in next 
                float start = ui.map(runningSum, 0, total, 0, ui.TWO_PI);       // maps runningSum between points 0 and total to points 0 and TWO_PI 
                float end = ui.map(next, 0, total, 0, ui.TWO_PI);               //maps next between coords 0 and total to 0 and TWO_PI
                //generates a value for i between 0 and length of array to points 150 and 255
                ui.fill(ui.map(i, 0, rainFall.length, 150, 255), 0, 255);       //fills the circle using (rgb)
                ui.arc(cx, cy, w, w, start, end, ui.ARC); //draws an arc ... x,y, width, height, starting point, ending point of arc specified in radians
                runningSum = next;  //sets the runningSum to next
            }
        
    }


}