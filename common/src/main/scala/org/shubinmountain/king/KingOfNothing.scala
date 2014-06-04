package org.shubinmountain.king

import com.badlogic.gdx.{ Game, Gdx }

import akka.actor.ActorSystem
import akka.actor.Props

class KingOfNothing extends Game {

    private val system = ActorSystem("master-system")

    override def create() {
      val model = new Model
      val controller = system.actorOf(Props(classOf[Controller], model), name = "Controller")

      Gdx.input.setInputProcessor(new TapListener(controller))

      this.setScreen(new GameScreen(model))
    }

    override def dispose() {
      system.shutdown
    }

}
