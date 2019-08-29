package com.kylephan.autoapps.wheelfitment.model

class Wheel(var tireWidth: Int = 0,
                 var tireSidewall: Int = 0,
                 var wheelDiameter: Int = 0,
                 var wheelWidth: Float = 0f,
                 var wheelOffset: Int = 0,
                 var wheelCamber: Float = 0f) {

    override fun toString(): String {
        val sBuilder: StringBuilder = StringBuilder()
        sBuilder.append("Tire Width: $tireWidth")
        sBuilder.append("Tire Sidewall: $tireSidewall")
        sBuilder.append("Wheel Diameter: $wheelDiameter")
        sBuilder.append("Wheel Width: $wheelWidth")
        sBuilder.append("Wheel Offset: $wheelOffset")
        sBuilder.append("Wheel Camber: $wheelCamber")

        return sBuilder.toString()
    }
}