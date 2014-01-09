/**
 * 
 */
package interfaceGraphique;

import individu.Element;
import individu.Equipement;
import individu.Personne;

import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.ToolTipManager;

/**
 * @author Benoît Sauvère
 *
 */
public class OnMouseOverTooltipElementMouseMotionListener implements MouseMotionListener {

	private JPanel panel;
	
	private Map<VueElement, Shape> registeredMouseMotionListener = new HashMap<VueElement, Shape>();
	
	public OnMouseOverTooltipElementMouseMotionListener(JPanel panel) {
		this.panel = panel;
		ToolTipManager.sharedInstance().setInitialDelay(0);
	}
	
	public void putNewShape(VueElement e, Shape s) {
		this.registeredMouseMotionListener.put(e, s);
	}
	
	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseDragged(java.awt.event.MouseEvent)
	 */
	public void mouseDragged(MouseEvent e) {
	}

	/* (non-Javadoc)
	 * @see java.awt.event.MouseMotionListener#mouseMoved(java.awt.event.MouseEvent)
	 */
	public void mouseMoved(MouseEvent e) {
		
		boolean noTooltip = true;
		
		for(VueElement elem : registeredMouseMotionListener.keySet()) {
			Shape shape = registeredMouseMotionListener.get(elem);
			if(shape.contains(e.getPoint())) {
				noTooltip = false;
				try {
					panel.setToolTipText(generateTooltipForElement(elem.getControleur().getElement()));
				} catch (RemoteException e1) {
					panel.setToolTipText("Invalid data");
				}
			} 
		}
		
		if(noTooltip) {
			panel.setToolTipText(null);
		}
		
		ToolTipManager.sharedInstance().mouseMoved(e);
	}
		
	private String generateTooltipForElement(Element element) {
		
		if(element instanceof Equipement) {
			Equipement equip = (Equipement) element;
			return String.format(
					"<html>Bonus Vie : %d<br>" +
					"Bonus Force : %d<br>" +
					"Bonus Defense : %d<br>" +
					"Bonus Esquive : %d<br>" +
					"Bonus Inventaire : %d</html>", 
					equip.getBonusVie(), equip.getBonusForce(), equip.getBonusDefense(), 
					equip.getBonusEsquive(), equip.getBonusInventaire());
		} else if(element instanceof Personne) {
			Personne pers = (Personne) element;
			return String.format(
					"<html>Force : %d<br>" +
					"Defense : %d<br>" +
					"Esquive : %d<br>" +
					"Inventaire : %d</html>",
					pers.getForce(),
					pers.getDefense(),
					pers.getEsquive(),
					pers.getInventaire());
		} 
		
		return String.format("Vie : %d", element.getVie());
	}
}
