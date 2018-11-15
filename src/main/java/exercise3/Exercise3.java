package exercise3;

public class Exercise3 {
	public static void main(String[] args) {
		new Panel(new Drawable[]{
			new ConvexPolygon(new Point[]{
				new Point(200, 100),
				new Point(200, 200),
				new Point(100, 200),
				new Point(100, 100),
			})
		});
	}
}//on crée un panel (une fenetre donc) qui a besoin d'un drawable (qui va être dessiné dessus) et ce drawable,
//c'est un polygone convexe de 4 points
//pour lancer l'exo 3, click droit sur le fichier dans l'explorateur à gauche, puis run !
