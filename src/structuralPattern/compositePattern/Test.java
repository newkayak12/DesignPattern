package structuralPattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

import structuralPattern.compositePattern.baseComponent.Shape;
import structuralPattern.compositePattern.compositeObjects.Drawing;
import structuralPattern.compositePattern.leafObject.Circle;
import structuralPattern.compositePattern.leafObject.Triangle;

public class Test {
	public static void main(String[] args) {
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		Shape tri2 = new Triangle();

		Drawing draw = new Drawing();
		draw.add(tri1);
		draw.add(cir);
		draw.add(tri2);


		draw.draw("red");

		// 컴포지트로 한 번에 관리


		System.out.println(" === ");

		List<Shape> shapes = new ArrayList<>();
		shapes.add(draw);
		shapes.add(new Triangle());
		shapes.add(new Circle());

		for(Shape shp : shapes){
			shp.draw("blue");
		}
	}
}
