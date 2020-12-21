package commands.audio;

import Main.Music;
import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.entities.CommandEvent;

@CommandController
public class Play {

    @Command("play")
    public void onPlay(CommandEvent event, String command){
        Music.loadAndPlay(event.getChannel(), command);
    }

}
