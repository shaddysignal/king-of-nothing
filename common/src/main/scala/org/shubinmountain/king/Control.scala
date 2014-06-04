package org.shubinmountain.king

import scala.collection.mutable.Buffer

import akka.actor.ActorRef

trait Control {

    val listeners: Buffer[ActorRef]

    def contains(x: Float, y: Float): Boolean

}

// vim: set ts=4 sw=4 et:
