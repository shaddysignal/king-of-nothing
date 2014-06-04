package org.shubinmountain.king

import com.badlogic.gdx.{ Gdx, InputAdapter }
import com.badlogic.gdx.math._

import akka.actor.ActorRef

class TapListener(controller: ActorRef) extends InputAdapter {

    private def width = Gdx.graphics.getWidth.toFloat
    private def height = Gdx.graphics.getHeight.toFloat

    override def touchDown(screenX: Int, screenY: Int, pointerN: Int, button: Int) = {
        val (x, y) = (screenX * 1f, screenY * 1f)
        controller ! Tapping(x, Gdx.graphics.getHeight - y, pointerN)
        false
    }

    override def touchDragged(screenX: Int, screenY: Int, pointerN: Int) = {
        val (x, y) = (screenX * 1f, screenY * 1f)
        controller ! Tapping(x, Gdx.graphics.getHeight - y, pointerN)
        false
    }

    override def touchUp(screenX: Int, screenY: Int, pointerN: Int, button: Int) = false

}

// vim: set ts=4 sw=4 et:
