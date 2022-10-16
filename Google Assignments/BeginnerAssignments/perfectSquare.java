//perfect square

class Main 
{
  static void pftSqr(double x)
  {
    double sq=Math.sqrt(x);
    if((sq*sq)==x)
      System.out.println("Yes!! "+x+" is a Perfect Square");
    else
      System.out.println("No!! "+x+" is Not a perfect Square");

  }
  public static void main(String[] args) 
  {
    double x=2500;
    pftSqr(x);
  }
}