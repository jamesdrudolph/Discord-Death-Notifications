package moe.cuteanimegirls.discorddeathnotifications;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("discorddeathnotifications")
public interface DeathNotificationsConfig extends Config
{
	@ConfigItem(
			keyName = "webhook",
			name = "Webhook URL",
			description = "The Discord Webhook URL to send messages to.",
			position = 0
	)
	String webhook();
	@ConfigItem(
			keyName = "deathMessage",
			name = "Death message",
			description = "The message that will be included with the screenshot",
			position = 1
	)
	default String deathMessage() {
		return "died lmfao.";
	}
	@ConfigItem(
			keyName = "includeName",
			name = "Include player name",
			description = "Include player name at the start of the death notification message",
			position = 2
	)
	default boolean includeName()
	{
		return true;
	}
}
