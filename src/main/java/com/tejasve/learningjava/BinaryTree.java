/**
 * 
 */
package com.tejasve.learningjava;

/**
 * 
 */
public class BinaryTree {

	private IntTreeNode root;

	public void add(int value) {

		root = add(root, value);

	}

	private IntTreeNode add(IntTreeNode root, int value) {
		if (root == null) {
			root = new IntTreeNode(value);
		} else if (root.data > value) {
			root.left = add(root.left, value);
		} else if (root.data < value) {
			root.right = add(root.right, value);
		}
		return root;
	}

	public class IntTreeNode {
		int data;
		IntTreeNode left, right;

		IntTreeNode(int data) {
			this.data = data;
			left = right = null;
		}
	}

}
