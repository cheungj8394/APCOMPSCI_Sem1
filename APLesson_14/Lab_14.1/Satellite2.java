import java.util.ArrayList;
public class Satellite2
{
   public static void main(String[]args)
   {
       ArrayList<Location2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda2(honLoc));
       locate.add(new Toyota2("8, 9"));
       locate.add(new GMC2(3, 8));


       double[] home = {0, 0};


       String printout = "\n\n" +
               "==========================" + "\nStarting locations...";


       for (Location2 l : locate)
       {
		   double x, y;
		   x = (Math.random()*100)+1;
		   y = (Math.random()*100)+1;
		   System.out.printf("After %6d moved (%4.2f, %4.2f)\n", l.getID(), x ,y);
		   System.out.println("New Location: (" + getLocation(l.getLoc()) + ")\n");
		   ((Car)l).move(x, y);
	   }
	   
       System.out.println("\n" + "==========================" + "\nDistance from home...\n");
       for (Location2 l : locate)
       {
           System.out.printf("Distance for %6d: (%4.2f)\n", l.getID(), getDistance(l.getLoc(), home));
       }

   }


   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }


   public static String getLocation(double[] loc)
   {
       return String.format("%4.2f, %4.2f", loc[0], loc[1]);
   }
}