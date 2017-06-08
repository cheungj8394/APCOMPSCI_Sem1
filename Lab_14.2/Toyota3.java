import java.util.ArrayList;
import java.util.Arrays;
public class Toyota3 extends Car3
{
	private double xCoord;
	private double yCoord;
	
    public Toyota3(String pos) 
	{
        super();
        ArrayList<String> position = new ArrayList<>(Arrays.asList(pos.split(", ")));
        Double posX = Double.parseDouble(position.get(0));
		Double posY = Double.parseDouble(position.get(1));
        move(posX, posY);
    }
	
}