package com.artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User buyer = new User("Prateek", 5000);

        Artwork art1 = new DigitalArt("Cyber Sunset", "Amit", 1500, "Standard Digital");
        
        Artwork art2 = new PrintArt("Nature Canvas", "Neha", 2500, "Print License");

        art1.purchase(buyer);
        System.out.println("Remaining Balance: " + buyer.getWalletBalance());

        System.out.println();

        art2.purchase(buyer);
        System.out.println("Remaining Balance: " + buyer.getWalletBalance());
    }
}
