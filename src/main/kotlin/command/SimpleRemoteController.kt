package command

import command.commands.Command

class SimpleRemoteController {
    lateinit var slot: Command

    fun clickButton() {
        slot.execute()
    }
}
