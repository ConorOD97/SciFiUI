package ie.tudublin;

public class Main
{	
	// public void RotateArcs(){
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new RotateArcs());
	// }
	// public void Star(){
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new Star());
	// }
	// public void MoveLine(){
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new MoveLine());
	// }
	// public void Radar(){
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new Radar());
	// }
	public void startUI(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
	}
	

	
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.RotateArcs();
		//main.Star();
		//main.MoveLine();
		//main.Radar();
		main.startUI();		
	}
}