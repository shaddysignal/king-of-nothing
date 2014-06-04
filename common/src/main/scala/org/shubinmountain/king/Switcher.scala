package org.shubinmountain.king

import scala.collection.mutable.{ ListBuffer, Buffer }

import akka.actor.ActorRef

/**
 * Form: simple rectangle
 * x, y - thats coordinate of left-bottom edge
 */
class Switcher(ex: Float, ey: Float, width: Float, height: Float)
    extends Control {

    object State extends Enumeration { val Forward, Stay, Backward = State }

    private var _state = State.Forward
    def state = _state

    val listeners: Buffer[ActorRef] = ListBuffer()

    def checkActions(x: Float, y: Float): Boolean = {
        val contains = (x >= ex && x <= ex + width && y >= ey && y <= ey + height)
        if (contains) listeners.par.foreach { l => l ! Switched(_state) }
        contains
    }

}

// vim: set ts=4 sw=4 et:
