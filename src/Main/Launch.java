package Main;


/**
 * Created by AlexVR on 7/1/2018.
 */

public class Launch {

    public static void main(String[] args) {
        GameSetUp game = new GameSetUp("Snake", 600, 600); //MODDED PHASE-1 (this has to be in proportion to the GridPixelSize)
        game.start();
    }
}
