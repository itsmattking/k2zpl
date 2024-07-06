package command

import command.options.ZplFieldOrientation

internal data class FieldOrientation(val orientation: ZplFieldOrientation) : ZplCommand {
    override val command: String = "^FW"
    override val parameters: Map<String, Any?> = mapOf("o" to orientation.code)
}