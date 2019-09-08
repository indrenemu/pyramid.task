package data.structure;

import java.util.List;

public class TreeRoot {

	public static List<Integer> list;

	private int rootnumber;

	private TreeRoot leftChild;

	private TreeRoot rightChild;
	
	public TreeRoot(Integer indexOfRootNumber, Integer numberOfItemsInRow) {

		if (list.size() > indexOfRootNumber) {
			
			this.rootnumber = list.get(indexOfRootNumber);
			this.leftChild = new TreeRoot(indexOfRootNumber + numberOfItemsInRow, numberOfItemsInRow + 1);
			this.rightChild = new TreeRoot(indexOfRootNumber + numberOfItemsInRow + 1, numberOfItemsInRow + 1);
			
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
