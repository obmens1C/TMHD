package model;

import javafx.scene.image.Image;

import java.util.Locale;

public class NationalLocale {
    private int id;
    private String name;
    private Locale locale;
    private Image image;

    public NationalLocale(int id, String name, Locale locale, Image image) {
        this.name = name;
        this.locale = locale;
        this.image = image;

        setId(id);
    }

    public Image getImage() {
        return image;
    }

    public Locale getLocale() {
        return locale;
    }

    private void setId(int id) {
        this.id = id;
    }
}
