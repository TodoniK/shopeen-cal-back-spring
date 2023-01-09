package tech.shopeenapi.entity

import io.swagger.v3.oas.annotations.media.Schema
import java.util.Date

@Schema(description = "Bilan of an application, dated")
data class Application(
    @field:Schema(
        description = "Question identifier, used to manage responses",
        example = "nbPC",
        type = "string",
    )
    val appName: String,

    @field:Schema(
        description = "Financial cost of the measured system, based on its energy consumption",
        example = "16.7",
        type = "int",
        minimum = "0",
        maximum = "inf"
    )
    val bilanEuro: Int,

    @field:Schema(
        description = "CO2 production of the measured system",
        example = "16.7",
        type = "int",
        minimum = "0",
        maximum = "inf"
    )
    val bilanCO2: Int,

    @field:Schema(
        description = "Energy consumption of the measured system",
        example = "16.7",
        type = "int",
        minimum = "0",
        maximum = "inf"
    )
    val bilanEnergy: Int,

)