package com.kylephan.autoapps.wheelfitment.viewmodel

import androidx.lifecycle.ViewModel
import com.kylephan.autoapps.wheelfitment.model.Fender
import com.kylephan.autoapps.wheelfitment.model.Wheel

class SpecEntryViewModel: ViewModel() {
    private val TAG = this.javaClass.simpleName

    private lateinit var wheel1: Wheel
    private var fender: Fender? = null

    fun init(wheel1: Wheel, fender: Fender?) {
        this.wheel1 = wheel1
        this.fender = fender
    }

    init {

    }

    fun updateWheelSpec(tireWidth: Int,
                        tireSidewall: Int,
                        wheelDiameter: Int,
                        wheelWidth: Float,
                        wheelOffset: Int,
                        wheelCamber: Float) {

        wheel1.tireWidth = tireWidth
        wheel1.tireSidewall = tireSidewall
        wheel1.wheelDiameter = wheelDiameter
        wheel1.wheelWidth = wheelWidth
        wheel1.wheelOffset = wheelOffset
        wheel1.wheelCamber = wheelCamber
    }

    fun updateFenderSpec(fenderAngle: Float,
                         fenderHeight: Float,
                         fenderOffset: Float) {
        fender?.fenderAngle = fenderAngle
        fender?.fenderHeight = fenderHeight
        fender?.fenderOffset = fenderOffset
    }
}