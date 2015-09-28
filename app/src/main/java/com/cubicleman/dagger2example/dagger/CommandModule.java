package com.cubicleman.dagger2example.dagger;

import com.cubicleman.dagger2example.command.CommandSample;
import com.cubicleman.dagger2example.dagger.PerActivity;

import dagger.Module;
import dagger.Provides;

/**
 * @since 9/28/15.
 */
@Module
public class CommandModule {

    @Provides @PerActivity
    public CommandSample provideCommandSample()  {
        return new CommandSample();
    }
}
