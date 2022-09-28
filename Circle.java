public class Circle
{
  private double radius;
  private static int instance;

  public Circle(){
    this(1.0);
  }

  public Circle(double radius){
    this.setRadius(radius);
    setInstance();
  }

  public Circle(Circle copy){
    this(copy.getRadius());
  }

  public static int getInstance(){
    return instance;
  }

  private static void setInstance(){
    instance += 1;
  }
  public double getRadius()
  {
    return this.radius;
  }

  private void setRadius(double radius)
  {
    if (radius >= 0)
      this.radius = radius;
    else
      this.radius = 0;
  }

  public void resize(double newRadius)
  {
    this.setRadius(newRadius);
  }

  public Circle clone()
  {
    Circle c = new Circle(this);

    c.resize(this.getRadius());

    return c;
  }

  public boolean equals(Circle guest)
  {
    return guest.getRadius() == this.getRadius();
  }
  
  public void print()
  {
    System.out.print("The circle\'s radius is " +
    this.getRadius());
  }
}
