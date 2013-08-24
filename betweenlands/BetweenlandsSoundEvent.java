package betweenlands;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class BetweenlandsSoundEvent
{
	public static final BetweenlandsSoundEvent INSTANCE = new BetweenlandsSoundEvent();

	public static final String[] SOUND_FILES = { "DarkDruidDie.ogg", "DarkDruidHit.ogg", "DarkDruidIdle.ogg", "DarkDruidLiving.ogg", "DarkDruidLiving1.ogg", "DarkDruidLiving2.ogg"};

	@ForgeSubscribe
	public void loadSoundEvents(SoundLoadEvent event)
	{
		for (int i = 0; i < SOUND_FILES.length; i++)
		{
			event.manager.soundPoolSounds.addSound("thebl" + ":" + SOUND_FILES[i]);
			//event.manager.soundPoolSounds.("thebl" + ":" + SOUND_FILES[i]);
			//event.manager.soundPoolSounds.addSound("thebl" + ":" + "thergsugoartaertae/raertaeyay/atwtawe.ogg");
			}
			
			
		}
	}



