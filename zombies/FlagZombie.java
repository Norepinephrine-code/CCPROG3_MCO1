package zombies;
import tiles.Tile;

/**
 * Faster zombie variant that acts as a wave indicator.
 */
public class FlagZombie extends Zombie {
    /**
     * Creates a FlagZombie starting at the given position.
     *
     * @param pos starting tile on the board
     */
    public FlagZombie(Tile pos) {
        super(70, 3, 10, pos);
        this.speed = 3;
        this.baseSpeed = 3;
    }

}
