package com.kylephan.autoapps.wheelfitment.model

class Wheel(var tireWidth: Int = 0,
                 var tireSidewall: Int = 0,
                 var wheelDiameter: Int = 0,
                 var wheelWidth: Float = 0f,
                 var wheelOffset: Int = 0,
                 var wheelCamber: Float = 0f) {

    override fun toString(): String {
        val sBuilder: StringBuilder = StringBuilder()
        sBuilder.append("Tire Width: $tireWidth\n")
        sBuilder.append("Tire Sidewall: $tireSidewall\n")
        sBuilder.append("Wheel Diameter: $wheelDiameter\n")
        sBuilder.append("Wheel Width: $wheelWidth\n")
        sBuilder.append("Wheel Offset: $wheelOffset\n")
        sBuilder.append("Wheel Camber: $wheelCamber\n")

        return sBuilder.toString()
    }
}