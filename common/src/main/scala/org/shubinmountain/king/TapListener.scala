package org.shubinmountain.king

import com.badlogic.gdx.{ Gdx, InputProcessor }
import com.badlogic.gdx.math._

import akka.actor.ActorRef

class TapListener(controller: ActorRef) extends InputProcessor {

    private def width: Float = Gdx.graphics.getWidth
    private def height: Float = Gdx.graphics.getHeight

    def keyDown(keycode: Int) = false

    def keyTyped(character: Char) = false

    def keyUp(keycode: Int) = false

    def mouseMoved(screenX: Int, screenY: Int) = false

    def scrolled(amount: Int) = false

    def touchDown(screenX: Int, screenY: Int, pointerN: Int, button: Int) = {
        val (x, y) = (screenX * 1f, screenY * 1f)
        controller ! Tapping(x, Gdx.graphics.getHeight - y, pointerN)
        false
    }

    def touchDragged(screenX: Int, screenY: Int, pointerN: Int) = {
        val (x, y) = (screenX * 1f, screenY * 1f)
        controller ! Tapping(x, Gdx.graphics.getHeight - y, pointerN)
        false
    }

    def touchUp(screenX: Int, screenY: Int, pointerN: Int, button: Int) = false

}

// vim: set ts=4 sw=4 et:
