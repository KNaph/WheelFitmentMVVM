package com.kylephan.autoapps.wheelfitment.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.kylephan.autoapps.wheelfitment.model.Fender
import com.kylephan.autoapps.wheelfitment.model.Wheel

class SpecEntryViewModel: ViewModel() {
    private val TAG = this.javaClass.simpleName

    private var wheel: Wheel = Wheel()
    private var fender: Fender? = null

    var testDefault = 17

//    fun init(wheel: Wheel, fender: Fender?) {
//        this.wheel = wheel
//        this.fender = fender
//    }

    init {

    }

    fun updateWheelSpec(tireWidth: Int,
                        tireSidewall: Int,
                        wheelDiameter: Int,
                        wheelWidth: Float,
                        wheelOffset: Int,
                        wheelCamber: Float) {

        wheel.tireWidth = tireWidth
        wheel.tireSidewall = tireSidewall
        wheel.wheelDiameter = wheelDiameter
        wheel.wheelWidth = wheelWidth
        wheel.wheelOffset = wheelOffset
        wheel.wheelCamber = wheelCamber

        Log.d(TAG, "KP## WHEEL SPEC : $wheel")

//        Log.d(TAG, "KP## TIRE W : ${wheel.tireWidth} : TIRE SIDEWALL : ${wheel.tireSidewall}\n" +
//                "WHEEL DIAM : ${wheel.wheelDiameter} : WHEEL WIDTH : ${wheel.wheelWidth}\n" +
//                "WHEEL OFFSET : ${wheel.wheelOffset} : WHEEL CAMBER : ${wheel.wheelCamber}")
    }

    fun updateFenderSpec(fenderAngle: Float,
                         fenderHeight: Float,
                         fenderOffset: Float) {
        fender?.fenderAngle = fenderAngle
        fender?.fenderHeight = fenderHeight
        fender?.fenderOffset = fenderOffset
    }
}