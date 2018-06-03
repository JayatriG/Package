package arithmetic;
class Shape
{
	int area(int l, int b)
	{
		return l*b;
	}
	int perimeter(int l, int b)
	{
		return 2*(l+b);
	}
}
public class Demo 
{
	public static void main(String args[ ])
	{
		Shape rect=new Shape();
		System.out.println(rect.area(10,6));
		System.out.println(rect.perimeter(10,6));
	}
}