package org.shubinmountain.king

import scala.collection.mutable.ArrayBuffer

class Model(val pos: ArrayBuffer[(Float, Float)] = ArrayBuffer())
    extends Iterable[(Float, Float)] {

    def iterator = pos.iterator

}

// vim: set ts=4 sw=4 et:
