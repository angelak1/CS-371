//Angela Kearns
//11/30/17
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other) 
{
   if (Math.pow(center.x - other.center.x, 2) + Math.pow(center.y - other.center.y, 2)<=Math.pow(radius+other.radius, 2))
      return true;
   return false;
}

}

