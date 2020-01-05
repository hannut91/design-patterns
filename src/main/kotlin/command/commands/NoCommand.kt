package command.commands

class NoCommand : Command {
    override fun execute() {
        println("등록되어 있지 않습니다.")
    }
}
