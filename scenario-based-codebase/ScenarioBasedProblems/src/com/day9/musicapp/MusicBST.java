package com.day9.musicapp;

public class MusicBST {
    SongNode root;

    SongNode insert(SongNode root, int trackId, String title) {
        if (root == null)
            return new SongNode(trackId, title);

        if (trackId < root.trackId)
            root.left = insert(root.left, trackId, title);
        else
            root.right = insert(root.right, trackId, title);

        return root;
    }

    void search(SongNode root, int trackId) {
        if (root == null) {
            System.out.println("Song not found");
            return;
        }

        if (trackId == root.trackId) {
            System.out.println("Playing: " + root.title);
        } else if (trackId < root.trackId) {
            search(root.left, trackId);
        } else {
            search(root.right, trackId);
        }
    }

    // In-order traversal
    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.title);
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        MusicBST tree = new MusicBST();

        tree.root = tree.insert(tree.root, 201, "Shape of You");
        tree.insert(tree.root, 203, "Believer");
        tree.insert(tree.root, 202, "Perfect");

        System.out.println("Playlist (Sorted):");
        tree.inorder(tree.root);

        tree.search(tree.root, 203);
    }
}
