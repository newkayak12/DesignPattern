package structuralPattern.compositePattern.compositeObjects;

import java.util.ArrayList;
import java.util.List;

import structuralPattern.compositePattern.baseComponent.Shape;

public class Drawing implements Shape{
	private List<Shape> shapes = new ArrayList<>();


	@Override
	public void draw(String fillColor) {
		for(Shape shape : shapes){
			shape.draw(fillColor);
		}
	}
	public void add(Shape s) {
		this.shapes.add(s);
	}
		
	public void remove(Shape s) {
		shapes.remove(s);
	}
		
	public void clear() {
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
