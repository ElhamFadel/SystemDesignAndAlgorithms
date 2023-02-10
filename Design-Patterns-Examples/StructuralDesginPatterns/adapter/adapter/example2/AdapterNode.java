package adapter.example2;

import javax.swing.tree.DefaultMutableTreeNode;

public class AdapterNode extends DefaultMutableTreeNode{

	Person p;
	
	public AdapterNode(Person p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return p.getFirstName()+" "+p.getLastName();
	}
}
