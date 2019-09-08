package calculation;

import data.structure.TreeRoot;

public class BestPath {

	public int calculate(TreeRoot root) {

		int sumLeft = 0;
		int sumRight = 0;
		boolean isRootEven = isEven(root.getRoot());

		if (root.getLeftChild() != null && root.getRightChild() != null) {

			boolean isLeftEven = isEven(root.getLeftChild().getRoot());
			boolean isRightEven = isEven(root.getRightChild().getRoot());

			if (isRootEven) {

				if (!isLeftEven) {
					sumLeft = calculate(root.getLeftChild());
				}
				if (!isRightEven) {
					sumRight = calculate(root.getRightChild());
				}

			} else {

				if (isLeftEven) {
					sumLeft = calculate(root.getLeftChild());
				}
				if (isRightEven) {
					sumRight = calculate(root.getRightChild());
				}
			}
		}
		
		if (sumLeft > sumRight) {
			return root.getRoot() + sumLeft;
		} else {
			return root.getRoot() + sumRight;
		}
	}

	private boolean isEven(int number) {
		return number % 2 == 0;
	}

	public int add(TreeRoot root) {
		return root.getRoot();
	}

	public boolean existsLeft(TreeRoot root) {
		root.getLeftChild().getRoot();
		return false;
	}

	public boolean existsRight(TreeRoot root) {
		return false;
	}
}
