package Main;

import com.github.kaktushose.jda.commands.entities.JDACommands;
import com.github.kaktushose.jda.commands.entities.JDACommandsBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.sharding.DefaultShardManagerBuilder;
import net.dv8tion.jda.api.utils.Compression;
import net.dv8tion.jda.api.utils.cache.CacheFlag;
import org.slf4j.Logger;

import javax.security.auth.login.LoginException;

import static net.dv8tion.jda.api.requests.GatewayIntent.GUILD_MESSAGES;
import static net.dv8tion.jda.api.requests.GatewayIntent.GUILD_VOICE_STATES;

public class HelperMain {

    private Logger logger;

    public static void main(String[] args) throws Exception
    {
        DefaultShardManagerBuilder builder = DefaultShardManagerBuilder.createDefault(args[0], GUILD_MESSAGES, GUILD_VOICE_STATES);
        builder.setCompression(Compression.ZLIB);
        builder.setActivity(Activity.competing("Awaiting Order"));
        builder.setAutoReconnect(true);
        builder.disableCache(CacheFlag.EMOTE);
        new Music();
        builder.setStatus(OnlineStatus.DO_NOT_DISTURB);
        JDACommands jdaCommands = JDACommandsBuilder.start(builder.build(), "!");
        jdaCommands.getSettings().setIgnoreBots(true);
    }
}