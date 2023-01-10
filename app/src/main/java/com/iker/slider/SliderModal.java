package com.iker.slider;

public class SliderModal {

    // string variable for storing
    // title, image url and description.
    private String title;
    private int backgroundDrawable;

    public SliderModal() {
        // empty constructor is required
        // when using firebase
    }

    // creating getter methods.
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    // constructor for our modal class
    public SliderModal(String title, int backgroundDrawable) {
        this.title = title;
        this.backgroundDrawable = backgroundDrawable;
    }

    public int getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public void setBackgroundDrawable(int backgroundDrawable) {
        this.backgroundDrawable = backgroundDrawable;
    }
}