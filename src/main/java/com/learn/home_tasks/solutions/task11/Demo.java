package com.learn.home_tasks.solutions.task11;

public class Demo {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[]{new Circle("Red", 5.0), new Rectangle("Blue", 4.0, 6.0)};

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
