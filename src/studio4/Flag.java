package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		StdDraw.setPenColor(141,159,190); // cute grey blue 
		
		StdDraw.filledRectangle(0.5, 0.5, .4, .3);	
		
		StdDraw.setPenColor(144,225,245);
		
		double [] x = {.3, .6, .45, .3 };
		double[] y = {.5,.5,.3, .4};
		StdDraw.filledPolygon(x,y);
		
		double [] x2 = {.4, .6, .5};
		double[] y2 = {.5,.5,.6};
		StdDraw.filledPolygon(x2,y2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}