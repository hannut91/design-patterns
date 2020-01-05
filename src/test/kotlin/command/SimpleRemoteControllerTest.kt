package command

import command.commands.LightOffCommand
import command.commands.LightOnCommand
import command.devices.Light
import org.junit.Test

internal class SimpleRemoteControllerTest {
    @Test
    fun `Simple remote controller test`() {
        val remote = SimpleRemoteController()
        val lightOnCommand = LightOnCommand(Light())
        remote.slot = lightOnCommand

        remote.clickButton()
    }

    @Test
    fun `Remote controller test`() {
        val remote = RemoteController()

        val light = Light()
        val lightOnCommand = LightOnCommand(light)
        val lightOffCommand = LightOffCommand(light)

        // TODO: 여기에 선풍기 커맨드를 추가해야 합니다.

        remote.setCommand(0, lightOnCommand, lightOffCommand)
        remote.onButtonClick(0)
        remote.offButtonClick(0)
    }
}
