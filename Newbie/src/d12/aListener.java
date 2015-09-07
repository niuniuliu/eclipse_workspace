package org.nitpro.gui2;

import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class aListener implements ItemListener {

	public void itemStateChanged(ItemEvent itemEvent) {
		int state = itemEvent.getStateChange();
        System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");
        System.out.println("Item: " + itemEvent.getItem());
        ItemSelectable is = itemEvent.getItemSelectable();
        System.out.println(", Selected: " + selectedString(is));

	}

	static private String selectedString(ItemSelectable is) {
	    Object selected[] = is.getSelectedObjects();
	    return ((selected.length == 0) ? "null" : (String) selected[0]);
	  }

}
