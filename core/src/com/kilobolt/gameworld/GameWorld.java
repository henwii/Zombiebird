package com.kilobolt.gameworld;

import com.kilobolt.gameobjects.Bird;

/**
 * Created by Henri on 2015-10-13.
 */
public class GameWorld {
    private Bird bird;

    public GameWorld(int midPointY){
        bird = new Bird(33, midPointY-5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird(){
        return bird;
    }
}
