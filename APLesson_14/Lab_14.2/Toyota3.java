import java.util.*;
public class Toyota3 extends Car3
{
	public Toyota3(String l)
	{
		super();
		ArrayList<String> loc = new ArrayList<>(Arrays.asList(l.split(", ")));
		Double x = Double.parseDouble(loc.get(0));
		Double y = Double.parseDouble(loc.get(1));
		super.move(x, y);
	}
}