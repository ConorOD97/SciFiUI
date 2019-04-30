package ie.tudublin;

import processing.core.PApplet;

public class Chart{

    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    PApplet ui;
    public Chart(PApplet ui){
        this.ui = ui;
    }


    void PieChart()
    {
        float cx = 275;
        float cy = 650;

        float w = ui.width * 0.1f;
        //arc(cx, cy, w, w, 0, TWO_PI, ARC);

        float total = 0;
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                total += rainFall[i];
            }

            float runningSum = 0;
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                float next = runningSum + rainFall[i];
                float start = ui.map(runningSum, 0, total, 0, ui.TWO_PI);
                float end = ui.map(next, 0, total, 0, ui.TWO_PI);
                ui.fill(ui.map(i, 0, rainFall.length, 150, 255), 0, 255);
                ui.arc(cx, cy, w, w, start, end, ui.ARC);
                runningSum = next;
            }
        
    }


}