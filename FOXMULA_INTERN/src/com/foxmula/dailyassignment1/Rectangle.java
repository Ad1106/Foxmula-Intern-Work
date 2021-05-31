/**
 * 
 */
package com.foxmula.dailyassignment1;

/**
 * @author Adarsh Shukla
 *
 */
public class Rectangle extends Quadrilateral	// 2nd derive class
{
	Rectangle( int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
	{
		super(x1,y1,x2,y2,x3,y3,x4,y4);		// call the base class's constructor
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2= (int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;		// calculate & return the area
	}
}