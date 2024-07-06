package command

internal data object EndFormat : ZplCommand {
    override val command: String = "^XZ"
    override val parameters: Map<String, Any?> = emptyMap()
}