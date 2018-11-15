package exercise3;

import javax.swing.*;
import java.awt.*;
//remarquer que subpanel extends Jpanel, pas Panel !
class SubPanel extends JPanel {
	private Drawable[] drawables;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);//en fait çà permet de redraw un element "quand nécéssaire", c'est assez particulier d'après la doc

		for (Drawable drawable : drawables) {
			drawDrawable(drawable, g);
		}
	}

	private void drawDrawable(Drawable drawable, Graphics g) {
		Point[] vertices = drawable.getVertices();
		for (int i = 1; i < vertices.length; ++i) {
			Point currentVertex = vertices[i];
			Point previousVertex = vertices[i - 1];
			drawLineBetweenVertices(previousVertex, currentVertex, g);//trace une ligne entre 2 points
		}

		Point lastVertex = vertices[vertices.length - 1];
		Point firstVertex = vertices[0];
		drawLineBetweenVertices(lastVertex, firstVertex, g);//gérer le dernier et le premier point
	}

	private void drawLineBetweenVertices(Point vertex1, Point vertex2, Graphics g) {
		g.drawLine(vertex1.getX(), vertex1.getY(), vertex2.getX(), vertex2.getY());//méthode qui trace les points
	}

	void draw(Drawable[] drawables) {
		this.drawables = drawables;
		this.repaint();//repaint pour redraw sur la fenetre
	}
}
