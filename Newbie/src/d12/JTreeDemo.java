package org.nitpro.gui2;


import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicTreeUI;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * @version 1.0 04/16/99
 */
public class JTreeDemo extends JFrame {
  public JTreeDemo() {
    super("OnlyTextTreeExample");
    String[] strs = { "swing", // 0
        "platf", // 1
        "basic", // 2
        "metal", // 3
        "JTree" }; // 4

    DefaultMutableTreeNode[] nodes = new DefaultMutableTreeNode[strs.length];
    for (int i = 0; i < strs.length; i++) {
      nodes[i] = new DefaultMutableTreeNode(strs[i]);
    }
    nodes[0].add(nodes[1]);
    nodes[1].add(nodes[2]);
    nodes[1].add(nodes[3]);
    nodes[0].add(nodes[4]);
    JTree tree = new JTree(nodes[0]);
    DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree
        .getCellRenderer();
    renderer.setOpenIcon(null);
    renderer.setClosedIcon(null);
    renderer.setLeafIcon(null);
    BasicTreeUI ui = (BasicTreeUI) tree.getUI();
    ui.setExpandedIcon(null);
    ui.setCollapsedIcon(null);
    JScrollPane sp = new JScrollPane(tree);
    getContentPane().add(sp, BorderLayout.CENTER);
  }

  public static void main(String args[]) {
    try {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    } catch (Exception evt) {}
  
    JTreeDemo frame = new JTreeDemo();
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    frame.setSize(300, 150);
    frame.setVisible(true);
  }
}
