package com.udacity.gamedev.gigagal.util;


import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.Vector3;
import com.udacity.gamedev.gigagal.entities.GigaGal;

public class ChaseCam {

    // TODO: Add a Camera member variable
    Camera camera;

    // TODO: Add a GigaGal to target
    GigaGal target;


    // TODO: Accept and initialize the camera and GigaGal instance
    public ChaseCam(Camera camera, GigaGal target) {
        this.camera = camera;
        this.target = target;
    }


    // TODO: Set the camera's position to GigaGal's position
    // Note that the camera's position is a Vector3, while GigaGal's position is a Vector2
    public void update() {

        this.camera.position.x = target.position.x;
        this.camera.position.y = target.position.y;

    }
}
