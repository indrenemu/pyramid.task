package data.structure;

import java.util.List;

public class TreeRoot {

	private int rootnumber;

	private TreeRoot leftChild;

	private TreeRoot rightChild;
	
	public TreeRoot (Integer indexOfRootNumber, Integer numberOfItemsInRow, List<Integer> list) {

		if (list.size() > indexOfRootNumber) {
			
			this.rootnumber = list.get(indexOfRootNumber);
			this.leftChild = new TreeRoot(indexOfRootNumber + numberOfItemsInRow, numberOfItemsInRow + 1, list);
			this.rightChild = new TreeRoot(indexOfRootNumber + numberOfItemsInRow + 1, numberOfItemsInRow + 1, list);
			
		}
	}
	
	public TreeRoot getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeRoot leftChild) {
		this.leftChild = leftChild;
	}

	public TreeRoot getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeRoot rightChild) {
		this.rightChild = rightChild;
	}

	public int getRoot() {
		return rootnumber;
	}

	public void setRoot(int rootnumber) {
		this.rootnumber = rootnumber;
	}

}
