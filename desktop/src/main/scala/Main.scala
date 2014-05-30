package org.shubinmountain.king

import com.badlogic.gdx.backends.lwjgl._

object Main extends App {
    val cfg = new LwjglApplicationConfiguration
    cfg.title = "King of Nothing"
    cfg.height = 480
    cfg.width = 320
    cfg.useGL20 = true
    cfg.forceExit = false
    new LwjglApplication(new KingOfNothing, cfg)
}
