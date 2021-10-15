package com.mousavi.noteappwithcompose;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NoteApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NoteApp_GeneratedInjector {
  void injectNoteApp(NoteApp noteApp);
}
