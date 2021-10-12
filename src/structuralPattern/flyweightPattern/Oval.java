package structuralPattern.flyweightPattern;

import java.awt.Color;
import java.awt.Graphics;

public class Oval implements Shape {
	private boolean fill;
	public Oval(boolean f){
		this.fill = f;
		System.out.println("Creating Oval obj with fill "+f);

		try {
			Thread.sleep(2000);
			// 인스턴스에 시간이 걸린 다는 것을 과장하기 위한 코드
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
		circle.setColor(color);
		circle.drawOval(x, y, width, height);
		if(fill){
			circle.fillOval(x, y, width, height);
		}
		
	}
	
}
