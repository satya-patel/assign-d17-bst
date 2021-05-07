package com.BinarySearchTree;

import static org.junit.Assert.*;
import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void given3Numbers_WhenAddedToBST_ShouldReturnSize3() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int size = binaryTree.getSize();
		assertEquals(3, size);
	}
	
	@Test
	public void createBinary_TreeCheck_UsingSizeMethod() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int size = binaryTree.getSize();
		//System.out.println("Size is " + size);
		assertEquals(13, size);
	}
	
	@Test
	public void givenNumber_WhenSearched_ShouldBeFoundInBST() {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		int key = binaryTree.search(63);
		assertEquals(63, key);
	}
}
