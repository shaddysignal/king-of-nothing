package org.shubinmountain.king

import scala.language.implicitConversions
import scala.collection.mutable.{ ListBuffer, Buffer }

import akka.actor.ActorRef

object Switcher {

    object State extends Enumeration {
        val Forward, Stay, Backward = Value

        class StateValue(v: Value) {
            def next = State((v.id + 1) % maxId)
        }
    }

    implicit def value2StateValue(v: State.Value) = new State.StateValue(v)

}
/**
 * Form: simple rectangle
 * x, y - thats coordinate of left-bottom edge
 */
class Switcher(val ex: Float, val ey: Float, val width: Float, val height: Float)
    extends Control {
    import Switcher._

    private var state = State.Forward

    val listeners: Buffer[ActorRef] = ListBuffer()

    def checkAndAction(x: Float, y: Float): Boolean = {
        val contains = (x >= ex && x <= ex + width && y >= ey && y <= ey + height)
        if (contains) {
            state = state.next
            listeners.par.foreach { l => l ! Switching(state) }
        }
        contains
    }

}

// vim: set ts=4 sw=4 et:
