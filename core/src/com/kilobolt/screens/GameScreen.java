package com.kilobolt.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.kilobolt.gameworld.GameRenderer;
import com.kilobolt.gameworld.GameWorld;
import com.kilobolt.zbHelpers.InputHandler;

/**
 * Created by Henri on 2015-10-07.
 */
public class GameScreen implements Screen{

    private GameWorld world;
    private GameRenderer renderer;
    private float runTime = 0;
    int radius = 10;

    public GameScreen(){

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight/(screenWidth/gameWidth);

        int midPointY = (int)(gameHeight/2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, midPointY, (int) gameHeight);

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
        //Gdx.app.log("FPS",(1/delta)+"");
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen","show called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen","hide called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen","pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen","resume called");
    }


    @Override
    public void dispose() {
        //leave blank
    }
}
