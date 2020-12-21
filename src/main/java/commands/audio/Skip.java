package commands.audio;

import Main.Music;
import com.github.kaktushose.jda.commands.annotations.Command;
import com.github.kaktushose.jda.commands.annotations.CommandController;
import com.github.kaktushose.jda.commands.entities.CommandEvent;

@CommandController
public class Skip {
    @Command("skip")
    public void onSkip(CommandEvent event){
        Music.skipTrack(event.getChannel());
    }
}
