package net.P4NTH3R27.worm502.sound;

import net.P4NTH3R27.worm502.Worm502;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.http.impl.io.IdentityInputStream;

public class ModSounds {

    public static SoundEvent WORM502 = registerSoundEvent("worm502");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Worm502.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
