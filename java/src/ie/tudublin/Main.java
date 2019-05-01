package ie.tudublin;

public class Main
{	
	//method to lauch the startUI
	public void startUI(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new UI());
	}
	

	
	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();

	}
}