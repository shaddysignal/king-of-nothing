package org.shubinmountain.king

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx

import akka.actor.ActorSystem
import akka.actor.Props

class KingOfNothing extends Game {

    override def create() {
      val system = ActorSystem("Master System")
      val model = system.actorOf(Props[Model], name = "model")

      Gdx.graphics setContinuousRendering false

      this.setScreen(new GameScreen(model))

      Gdx.graphics.requestRendering
    }

}
