/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package s05uimenus;

import com.almasb.fxgl.app.ApplicationMode;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.settings.GameSettings;
import com.almasb.fxgl.util.Credits;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Shows how to add extra credits.
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public class CreditsSample extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("CreditsSample");
        settings.setVersion("0.1");
        settings.setFullScreen(false);
        settings.setIntroEnabled(false);
        settings.setMenuEnabled(true);
        settings.setProfilingEnabled(true);
        settings.setApplicationMode(ApplicationMode.DEVELOPER);

        // 1. create a list of text you want to show
        List<String> list = new ArrayList<>();
        list.add("-----------------------");
        list.add("Sample: A sample credit");
        list.add("-----------------------");

        IntStream.range(0, 50).forEach(i -> list.add("Line number: " + i));

        list.add("Do not forget to split long credits");
        list.add("so that the flow integrity is");
        list.add("maintained!");

        // 2. set credits
        settings.setCredits(new Credits(list));
    }

    @Override
    protected void initInput() {}

    @Override
    protected void initAssets() {}

    @Override
    protected void initGame() {}

    @Override
    protected void initPhysics() {}

    @Override
    protected void initUI() {}

    @Override
    protected void onUpdate(double tpf) {}

    public static void main(String[] args) {
        launch(args);
    }
}
