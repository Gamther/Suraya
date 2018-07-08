import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDAzMDQxMjc2NzM3NDg2ODQ5.DZMneQ.cV5x-pXxn6ZRAzoxtBI_GrvUf_s";
        builder.setToken(token);
        builder.addEventListener(new main());
        builder.buildAsync();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("we received a message from " +
                event.getAuthor().getName() + ": " +
                event.getMessage().getContentDisplay()
        );
        if(event.getMessage().getContentRaw().equals("!suraya")){
            event.getChannel().sendMessage("antiem is online").queue();
        }
    }
}