package moe.cuteanimegirls.discorddeathnotifications;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DeathNotificationsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DeathNotificationsPlugin.class);
		RuneLite.main(args);
	}
}