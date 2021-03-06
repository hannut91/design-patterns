package command.commands

import command.devices.Light

class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.on()
    }
}
