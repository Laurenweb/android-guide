package fr.aston.guide.models;

import java.io.Serializable;

public class Restaurant implements Serializable {
    private String name;
    private String category;
    private String email;
    private String phone;
    private String site;
    private String image;

    public Restaurant(String name, String category, String email, String phone, String site, String image) {
        this.name = name;
        this.category = category;
        this.email = email;
        this.phone = phone;
        this.site = site;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSite() {
        return site;
    }

    public String getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
