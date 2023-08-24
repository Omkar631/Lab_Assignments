/*Write a class with the name Perimeter using function overload that computes the perimeter of a square, a rectangle and a circle.
Formula:
Perimeter of a square = 4 * s
Perimeter of a rectangle = 2 * (l + b)
Perimeter of a circle = 2 * (22/7) * r
*/

package thurslab_24_Aug;

class Perimeter 
{
		//Object is created and functions are overloaded.
    	public static void main(String[] args) 
    	{
	        Perimeter perimeterCalculator = new Perimeter();
	
	        double squarePerimeter = perimeterCalculator.calculatePerimeter(5);
	        System.out.println("Perimeter of the square: " + squarePerimeter);
	
	        double rectanglePerimeter = perimeterCalculator.calculatePerimeter(6, 8);
	        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
	
	        double circlePerimeter = perimeterCalculator.calculatePerimeterCircle(3);
	        System.out.println("Perimeter of the circle: " + circlePerimeter);
    	}
    

    double calculatePerimeter(double side) 
    {
        return 4 * side; // Perimeter of a square
    }

    double calculatePerimeter(double length, double breadth) 
    {
        return 2 * (length + breadth); // Perimeter of a rectangle
    }

    double calculatePerimeterCircle(double radius)
    {
        return 2 * (22.0 / 7.0) * radius; // Perimeter of a circle
    }

    
}