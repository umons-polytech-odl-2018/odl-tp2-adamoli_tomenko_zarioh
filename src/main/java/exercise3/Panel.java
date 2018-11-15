package exercise3;

import javax.swing.*;
import java.awt.*;
//librairie utile car c'est un programme visuel

public class Panel extends JFrame {
	SubPanel myPanel = new SubPanel();//my Panel fait partie de java awt (il l'extend), on voit aussi qu'il extend Jframe
	//qui permet de faire plein de truc sur des fenetres
	//vu le truc et ma maigre expérience sfml, çà permet de construct la fenetre sur laquelle on va draw
	private JComboBox liste;//pour faire des boites de saisie dans une fenetre, extend of javaswing
	//çà va être de l'interraction utilisateur, on va voir çà en détail au tp 3

	public Panel(Drawable[] drawables) {
		super("Panel");//constructeur de la feneètre, on passe son nom
		this.myPanel.setBackground(Color.white);//couleur de fond
		this.myPanel.draw(drawables);//on draw ce qu'on a comme paramètre, un tableau de point => 1 polygone
		this.setDefaultCloseOperation(3);//fait qqch à la fermeture
		Container contentPane = this.getContentPane();//JFrames have a content pane, which holds the components.
		// These components are sized and positioned by the layout manager when JFrame's pack() is called
		contentPane.add(this.myPanel);
		this.setSize(500, 500);//size de la fenetre
		this.setLocationRelativeTo(null);//position relative de ce qui est tracé : le drawable (polygone)
		this.setVisible(true);//visibilité
	}


}
