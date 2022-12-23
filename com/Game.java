package com;

import com.config.GameConfiguration;
import com.ecs.System;
import com.graphics.SceneManager;
import com.graphics.elements.GameFrame;
import com.graphics.render.RenderingEngine;
import com.graphics.render.ScalingEngine;
import com.input.InputManager;

import java.util.ArrayList;
import java.util.logging.Logger;

public class Game {

    private static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static GameInformation gameInfo = new GameInformation();
    private static GameConfiguration configuration = new GameConfiguration();

    private static RenderingEngine renderingEngine = new RenderingEngine();
    private static ScalingEngine scalingEngine = new ScalingEngine();

    private static SceneManager sceneManager = new SceneManager();
    private static InputManager inputManager = new InputManager();

    private static GameFrame gameFrame = new GameFrame();
    private static GameLoop gameLoop = new GameLoop();

    public static GameFrame frame() {
        return gameFrame;
    }

    public static InputManager input() {
        return inputManager;
    }

    public static SceneManager scene() {
        return sceneManager;
    }

    public static ScalingEngine scale() {
        return scalingEngine;
    }

    public static Logger logger() {
        return logger;
    }

    public static GameConfiguration config() {
        return configuration;
    }

    public static GameInformation info() {
        return gameInfo;
    }

    public static RenderingEngine graphics() {
        return renderingEngine;
    }

    private static ArrayList<System> systemsList = new ArrayList<>();

    public static ArrayList<System> systems() {
        return systemsList;
    }

    public static void start() {
        gameLoop.setStarted();
        gameLoop.start();
    }

    public static void init() {
        // TODO: do something here
        logger.info("Game initialized successfully");
    }
}
