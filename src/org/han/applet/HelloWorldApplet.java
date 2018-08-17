package org.han.applet;
/**
 * 写的html没有效果，没有实现功能展示
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class HelloWorldApplet extends Applet{
	public void paint(Graphics g) {
		g.setColor(new Color(255,255,0));
		g.drawString("hahahahahahahah", 25, 25);
		g.setColor(new Color(255,0,255));
		g.drawString("hahahahahahahah", 25,50);
		g.setColor(new Color(0,255,255));
		g.drawString("hahahahahahahah", 25,75);
	};
}
