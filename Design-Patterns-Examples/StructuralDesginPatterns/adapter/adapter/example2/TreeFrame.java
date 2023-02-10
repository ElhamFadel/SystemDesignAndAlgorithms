package adapter.example2;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeFrame extends JFrame{
	private JTree tree;
	
	public TreeFrame(){
		this.setTitle("Adapter");
		
		Person p1 = new Person();
		p1.setFirstName("Ahmed");
		p1.setLastName("Ali");
		
		Person p2 = new Person();
		p2.setFirstName("Omar");
		p2.setLastName("Ali");

//		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Design Patterns");
//		DefaultMutableTreeNode creationalPatterns = new DefaultMutableTreeNode("Creational Patterns");
//		root.add(creationalPatterns);	
//		DefaultMutableTreeNode factoryPattern = new DefaultMutableTreeNode("Factory");
//		creationalPatterns.add(factoryPattern);
		
		AdapterNode root = new AdapterNode(p1);
		AdapterNode childNode = new AdapterNode(p2);
		root.add(childNode);
		
		tree = new JTree(root);
		
		tree.addTreeSelectionListener(new TreeSelectionListener(){

			@Override
			public void valueChanged(TreeSelectionEvent evt) {
			}
			
		});
		JScrollPane scrollPane = new JScrollPane(tree);
		this.getContentPane().add(scrollPane);
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		new TreeFrame();
	}
}
