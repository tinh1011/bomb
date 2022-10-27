package uet.oop.bomberman;


import uet.oop.bomberman.gui.Frame;
import uet.oop.bomberman.sound.Sound;

import javax.sound.sampled.Clip;


public class BombermanGame  {
    private static Clip clip;
    public static void main(String[] args) {
       // clip= Sound.getSound(BombermanGame.class.getResource("/sound/soundtrack"));
        Sound.play("/sound/soundtrack");
        new Frame();
    }

}
