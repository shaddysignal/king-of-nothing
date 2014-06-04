package org.shubinmountain.king

case class Tapping(x: Float, y: Float, n: Int)
case class Switching(changedState: Switcher.State.Value)
case class ButtonClick(action: Model => Unit)

// vim: set ts=4 sw=4 et:
