package com.day9.ecommerceproductinventory;

public class ProductBST {
    ProductNode root;

    ProductNode insert(ProductNode root, int sku, String name, double price) {
        if (root == null)
            return new ProductNode(sku, name, price);

        if (sku < root.sku)
            root.left = insert(root.left, sku, name, price);
        else if (sku > root.sku)
            root.right = insert(root.right, sku, name, price);

        return root;
    }

    // Search and update price
    void updatePrice(ProductNode root, int sku, double newPrice) {
        if (root == null) {
            System.out.println("Product not found");
            return;
        }

        if (sku == root.sku) {
            root.price = newPrice;
            System.out.println("Price updated successfully");
        } else if (sku < root.sku) {
            updatePrice(root.left, sku, newPrice);
        } else {
            updatePrice(root.right, sku, newPrice);
        }
    }

    // In-order traversal
    void inorder(ProductNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("SKU: " + root.sku + ", Name: " + root.name + ", Price: " + root.price);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        ProductBST tree = new ProductBST();

        tree.root = tree.insert(tree.root, 5001, "Laptop", 55000);
        tree.insert(tree.root, 5003, "Mobile", 20000);
        tree.insert(tree.root, 5002, "Headphones", 3000);

        System.out.println("Sorted Products:");
        tree.inorder(tree.root);

        tree.updatePrice(tree.root, 5003, 18000);
        System.out.println("\nAfter Price Update:");
        tree.inorder(tree.root);
    }
}
