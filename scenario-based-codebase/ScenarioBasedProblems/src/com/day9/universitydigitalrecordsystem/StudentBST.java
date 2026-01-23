package com.day9.universitydigitalrecordsystem;

public class StudentBST {

    StudentNode root;

    StudentNode insert(StudentNode root, int rollNo, String name) {
        if (root == null) {
            return new StudentNode(rollNo, name);
        }

        if (rollNo < root.rollNo)
            root.left = insert(root.left, rollNo, name);
        else if (rollNo > root.rollNo)
            root.right = insert(root.right, rollNo, name);

        return root;
    }

    void search(StudentNode root, int rollNo) {
        if (root == null) {
            System.out.println("Student not found");
            return;
        }

        if (rollNo == root.rollNo) {
            System.out.println("Found: Roll No = " + root.rollNo + ", Name = " + root.name);
        } else if (rollNo < root.rollNo) {
            search(root.left, rollNo);
        } else {
            search(root.right, rollNo);
        }
    }

    // In-order traversal 
    void inorder(StudentNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll No: " + root.rollNo + ", Name: " + root.name);
            inorder(root.right);
        }
    }

    // Find minimum value node
    StudentNode minValueNode(StudentNode node) {
        StudentNode current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    // Delete student
    StudentNode delete(StudentNode root, int rollNo) {
        if (root == null) return root;

        if (rollNo < root.rollNo)
            root.left = delete(root.left, rollNo);
        else if (rollNo > root.rollNo)
            root.right = delete(root.right, rollNo);
        else {
            // Node with one or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Node with two children
            StudentNode temp = minValueNode(root.right);
            root.rollNo = temp.rollNo;
            root.name = temp.name;
            root.right = delete(root.right, temp.rollNo);
        }
        return root;
    }

    public static void main(String[] args) {
        StudentBST tree = new StudentBST();

        tree.root = tree.insert(tree.root, 101, "Aman");
        tree.insert(tree.root, 105, "Neha");
        tree.insert(tree.root, 103, "Ravi");
        tree.insert(tree.root, 102, "Pooja");

        System.out.println("Sorted Student Records:");
        tree.inorder(tree.root);

        System.out.println("\nSearch Student:");
        tree.search(tree.root, 103);

        System.out.println("\nAfter Deleting Roll No 102:");
        tree.root = tree.delete(tree.root, 102);
        tree.inorder(tree.root);
    }
}
