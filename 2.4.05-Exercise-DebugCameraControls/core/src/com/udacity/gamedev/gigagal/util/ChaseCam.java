package com.udacity.gamedev.gigagal.util;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Camera;
import com.udacity.gamedev.gigagal.entities.GigaGal;

public class ChaseCam {

    private Camera camera;
    private GigaGal target;

    // TODO: Add following flag
    public boolean followingFlag;

    public ChaseCam(Camera camera, GigaGal target) {
        this.camera = camera;
        this.target = target;

        // TODO: Initialize following flag
        followingFlag = true;
    }

    // TODO: Accept a float time delta
    public void update(float delta) {

        // TODO: Toggle the following flag when spacebar is pressed
        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            followingFlag = false;
        }

        // TODO: If following, update the camera's position to match the target
        if (followingFlag){
            camera.position.x = target.position.x;
            camera.position.y = target.position.y;
        } else {
            if (Gdx.input.isKeyPressed(Input.Keys.A)){
                camera.position.x -= delta * Constants.CAMERA_SPEED;
            } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {
                camera.position.x += delta * Constants.CAMERA_SPEED;
            } else if (Gdx.input.isKeyPressed(Input.Keys.W)) {
                camera.position.y += delta * Constants.CAMERA_SPEED;
            } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
                camera.position.y -= delta * Constants.CAMERA_SPEED;
            }
        }



        // TODO: Move the camera right if D is pressed


        // TODO: Move the camera up if W is pressed


        // TODO: Move the camera down if S is pressed


    }
}
