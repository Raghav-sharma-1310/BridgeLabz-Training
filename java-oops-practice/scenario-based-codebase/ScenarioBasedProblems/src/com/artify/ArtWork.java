package com.artify;

abstract class Artwork implements IPurchaseable {
    private String title;
    private String artist;
    private double price;
    protected String licenseType; // protected → encapsulation of licensing

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, boolean preview) {
        this(title, artist, price, licenseType);
        if (preview) {
            System.out.println("Preview enabled for " + title);
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void purchase(User user) {
        if (user.getWalletBalance() >= price) {
            user.deductBalance(price);
            System.out.println(user.getName() + " purchased " + title);
            license();
        } 
        else {
            System.out.println("Insufficient balance!");
        }
    }
}
