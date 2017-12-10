//Angela Kearns
//11/30/17

public class Circle2 extends Circle
{

public Circle2(double x, double y, double radius)
{
   super(x,y,radius); 
}

//intersects method needs to change
public boolean intersects(Circle other)
{
   double d;
   d = Math.sqrt(Math.pow(center.x - other.center.x, 2) + 
                 Math.pow(center.y - other.center.y, 2));
   if (d <= (radius+other.radius)) 
      return true;
   else
      return false;
}

}

