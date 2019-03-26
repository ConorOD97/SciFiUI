package ie.tudublin;

public class Main
{	
	// public void Star(){
	// 	String[] a = {"MAIN"};
    //     processing.core.PApplet.runSketch( a, new Star());
	// }
	public void startUI(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
	}
	

	
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.Star();
		main.startUI();		
	}
}