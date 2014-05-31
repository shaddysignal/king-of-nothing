package org.shubinmountain.king

import com.badlogic.gdx.input._
import com.badlogic.gdx.math._

class TapListener extends GestureDetector.GestureListener {

    def fling(velocityX: Float, velocityY: Float, button: Int) = false

    def longPress(x: Float, y: Float) = false

    def pan(x: Float, y: Float, dX: Float, dY: Float) = false

    def panStop(x: Float, y: Float, pointerN: Int, button: Int) = false

    def pinch(
        initialPosition1: Vector2,
        initialPosition2: Vector2,
        position1: Vector2,
        position2: Vector2
    ) = false

    def tap(x: Float, y: Float, pointerN: Int, button: Int) = {
        
        false
    }

    def touchDown(x: Float, y: Float, pointerN: Int, button: Int) = false

    def zoom(initialDistance: Float, distance: Float) = false

}

// vim: set ts=4 sw=4 et:
