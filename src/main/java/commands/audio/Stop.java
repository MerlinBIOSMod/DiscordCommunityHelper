package commands.audio;

import Main.Music;
import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.entities.CommandEvent;
@CommandController
public class Stop {
    @Command("stop")
    public void onStop(CommandEvent event){
        event.getGuild().getAudioManager().closeAudioConnection();
        Music.stopPlayer(event.getChannel());
    }
}
