// Generated by Dagger (https://dagger.dev).
package com.mousavi.noteappwithcompose.di;

import android.app.Application;
import com.mousavi.noteappwithcompose.feature_note.data.data_source.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRoomDatabaseFactory implements Factory<NoteDatabase> {
  private final Provider<Application> appProvider;

  public AppModule_ProvideRoomDatabaseFactory(Provider<Application> appProvider) {
    this.appProvider = appProvider;
  }

  @Override
  public NoteDatabase get() {
    return provideRoomDatabase(appProvider.get());
  }

  public static AppModule_ProvideRoomDatabaseFactory create(Provider<Application> appProvider) {
    return new AppModule_ProvideRoomDatabaseFactory(appProvider);
  }

  public static NoteDatabase provideRoomDatabase(Application app) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRoomDatabase(app));
  }
}