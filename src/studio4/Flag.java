package studio4;

import java.awt.Color;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 

		StdDraw.setPenRadius(0.25); 
		StdDraw.setPenColor(204, 0, 0); 
		StdDraw.point(0.5, 0.5); 
		StdDraw.setPenRadius(.2);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.circle(.5,.5,.15);
		StdDraw.setPenRadius(.1); 
		StdDraw.setPenColor(204, 0, 0); 
		StdDraw.circle(.5, .5, .18); 
		
		StdDraw.setPenRadius(.002); 
		StdDraw.setPenColor(StdDraw.BLACK); 
		StdDraw.rectangle(.5, .5, .5, .25);
		
	
		
		
}
}