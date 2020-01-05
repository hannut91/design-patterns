package command.commands

import command.devices.Light

class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.off()
    }
}
