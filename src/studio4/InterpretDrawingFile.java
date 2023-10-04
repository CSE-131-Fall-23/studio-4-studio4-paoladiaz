package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//What shape
		String shapeType = in.next();
		
		
		//what color
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		
		StdDraw.setPenColor(redComponent, greenComponent , blueComponent);
		
		// is the shape filled 
		boolean isFilled = in.nextBoolean();
		
	if (shapeType.equals("triangle"))	
	{
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		
		if(isFilled)
		{
			double[] x = {x1, x2, x3};
			double [] y = {y1, y2, y3};
		    StdDraw.filledPolygon(x, y);
		}else
		{
			
			StdDraw.line(x1,y1,x2,y2);
	        StdDraw.line(x2, y2, x3,y3);
	        StdDraw.line(x3, y3, x1, y1);
		}
	}
	else
	{
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
		
		if (shapeType.equals("ellipse"))
		{
			if (isFilled)
			{
				
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}else
			{
				
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
		}
		
		if (shapeType.equals("rectangle"))
		{ 
			if (isFilled)
			{
				
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}else
			{
				
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		
		}
		
	}
	}
}
