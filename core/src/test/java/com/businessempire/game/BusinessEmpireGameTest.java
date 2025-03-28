package com.businessempire.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.headless.HeadlessApplication;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BusinessEmpireGameTest {
    private static Application application;

    @BeforeClass
    public static void init() {
        application = new HeadlessApplication(new BusinessEmpireGame());
    }

    @Test
    public void testGameCreation() {
        assertNotNull("Application should be created", Gdx.app);
    }
}
