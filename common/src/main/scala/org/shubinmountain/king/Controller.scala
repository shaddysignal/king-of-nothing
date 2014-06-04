package org.shubinmountain.king

import akka.actor.Actor

class Controller(model: Model) extends Actor {

    def receive = {
        case Tapping(x, y, n) => {
            if (n + 1 > model.pos.length) model.pos += ((x, y))
            else model.pos(n) = (x, y)
        }
        case Switching(state) => {  }
        case ButtonClick(action) => action(model)
        case _ => println("nothing")
    }

}

// vim: set ts=4 sw=4 et:
