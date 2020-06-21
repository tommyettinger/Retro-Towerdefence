package dev.lyze.retro.game.units;

import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import dev.lyze.retro.game.Game;

public class SnakeUnit extends Unit {
    public static final String RESOURCE_PATH = "enemies/snake.png";

    private final MoveToAction moveAction = new MoveToAction();

    public SnakeUnit(Game game, boolean playerUnit) {
        super(game, game.getAssMan().get(RESOURCE_PATH), playerUnit);
    }

    @Override
    public void tick(float duration) {
        moveAction.reset();

        moveAction.setPosition(pathPoints.get(++currentPoint).getX() * game.getMap().getTileWidth(), pathPoints.get(currentPoint).getY() * game.getMap().getTileHeight());
        moveAction.setDuration(duration);

        addAction(moveAction);
    }
}