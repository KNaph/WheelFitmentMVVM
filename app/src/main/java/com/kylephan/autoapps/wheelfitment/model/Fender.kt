package com.kylephan.autoapps.wheelfitment.model

class Fender(var fenderAngle: Float = 0f,
                  var fenderHeight: Float = 0f,
                  var fenderOffset: Float = 0f) {

    override fun toString(): String {
        val sBuilder: StringBuilder = StringBuilder()
        sBuilder.append("Fender Angle: $fenderAngle")
        sBuilder.append("Fender Height: $fenderHeight")
        sBuilder.append("Fender Offset: $fenderOffset")

        return sBuilder.toString()
    }
}