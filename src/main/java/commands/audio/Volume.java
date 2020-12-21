package commands.audio;

import Main.Music;
import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.entities.CommandEvent;

import java.util.concurrent.TimeUnit;

@CommandController
public class Volume {
    @Command({"volume", "vol"})
    public void onVolume(CommandEvent event, Integer vol){
        if(vol < 101){
            Music.getGuildAudioPlayer(event.getGuild()).player.setVolume(vol);
            event.reply("Die lautstärke wurde auf "+ Music.getGuildAudioPlayer(event.getGuild()).player.getVolume() + "% gestellt" , test -> {
                test.delete().queueAfter(5, TimeUnit.SECONDS);
            });
        }else{
            event.reply("Es geht nicht lauter als 100%", test -> {
                test.delete().queueAfter(5, TimeUnit.SECONDS);
            });
        }
    }
}
