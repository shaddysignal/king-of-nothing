package org.shubinmountain.king

import com.badlogic.gdx.Gdx

import akka.actor.Actor

import scala.collection.mutable.ArrayBuffer

class Model extends Actor with Iterable {

    private var pos = ArrayBuffer((0f, 0f))

    def receive = {
        case Tapping(x, y, n) => {
            if (n - 1 > pos.length) pos += Tuple2(x, y)
            else pos(n - 1) = (x, y)

            Gdx.graphics.requestRendering
        }
    }

}

// vim: set ts=4 sw=4 et:
