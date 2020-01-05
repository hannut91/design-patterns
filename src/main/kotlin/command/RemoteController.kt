package command

import command.commands.Command
import command.commands.NoCommand

class RemoteController {
    var commands: Array<Pair<Command, Command>> = Array(7) { Pair(NoCommand(), NoCommand()) }

    fun setCommand(slot: Int, on: Command, off: Command) {
        commands[slot] = Pair(on, off)
    }

    fun onButtonClick(slot: Int) {
        commands[slot].first.execute()
    }

    fun offButtonClick(slot: Int) {
        commands[slot].second.execute()
    }
}
