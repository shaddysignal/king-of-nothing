package org.shubinmountain.king

import scala.collection.mutable.{ Buffer, ListBuffer }

import akka.actor.ActorRef

/**
 * Form: rectangle
 * cx, cy - coordinate of lef-bottom corner
 */
class Button(val cx: Float, val cy: Float, val width: Float, val height: Float, action: Model => Unit)
    extends Control {

    val listeners: Buffer[ActorRef] = ListBuffer()

    def checkAndAction(x: Float, y: Float): Boolean = {
        val contains = (x >= cx && x <= cx + width && y >= cy && y <= cy + height)
        if (contains) listeners.par.foreach { l => l ! ButtonClick(action) }
        contains
    }

}

// vim: set ts=4 sw=4 et:
