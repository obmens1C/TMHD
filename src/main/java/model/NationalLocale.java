package model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Locale;

public class NationalLocale {
    private int id;
    private String name;
    private Locale locale;
    private ImageView ImageView;

    public NationalLocale(int id, String name, Locale locale, Image Image) {
        this.name = name;
        this.locale = locale;
        this.ImageView = new ImageView(Image);

        setId(id);
    }

    public ImageView getImageView() {
        return ImageView;
    }

    public Locale getLocale() {
        return locale;
    }

    private void setId(int id) {
        this.id = id;
    }
}
