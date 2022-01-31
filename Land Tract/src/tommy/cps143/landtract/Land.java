package tommy.cps143.landtract;

public class Land {
	private double length;
	private double width;
	private double area;
	
	public void LandArea(double length, double width)
	{
		this.length = length;
		this.width = width;
		this.area = length * width;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public void setLength(double length)
	{
		this.length = length;
	}
	
	public void setWidth(double width)
	{
		this.width = width;
	}
	
	public void setArea(double area)
	{
		this.area = area;
	}
	
	public String toString()
	{
		return String.format("Length: %.2f\nWidth: %.2f\nArea: %.2f", length, width, area);
	}
	
	public boolean equals(Land obj)
	{
		return this.length == obj.length || this.width == obj.width || this.area == obj.area;
	}
}
