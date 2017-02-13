package com.udacity.gamedev.gigagal.entities;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Platform {

    // TODO: Add members for the platform top, bottom, left edge, right edge, width, and height
    float top;
    float bottom;
    float left;
    float right;
    float width;
    float height;

    public Platform(float left, float top, float width, float height) {
        // TODO: Populate the member variables
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void render(ShapeRenderer renderer) {

        // TODO: Draw a box representing the platform
        this.bottom = this.top - this.height;
        renderer.rect(this.left, this.bottom, this.width, this.height);

    }

}
