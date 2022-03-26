package com.example.bai52giangbai;

public class Sanpham {

    private String name;
    private String Description;
    private int image;

    public Sanpham(String name, String description, int image) {
        this.name = name;
        this.Description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
