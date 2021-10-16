package com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/AddEditViewModel;", "Landroidx/lifecycle/ViewModel;", "useCases", "Lcom/mousavi/noteappwithcompose/feature_note/domain/use_case/NoteUseCases;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/use_case/NoteUseCases;Landroidx/lifecycle/SavedStateHandle;)V", "_flowEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/util/AddEditNoteState;", "color", "", "Ljava/lang/Integer;", "flowEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getFlowEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "noteId", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "onEvent", "", "event", "Lcom/mousavi/noteappwithcompose/feature_note/presentation/add_edit_note/util/AddEditEvent;", "app_debug"})
public final class AddEditViewModel extends androidx.lifecycle.ViewModel {
    private final com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases useCases = null;
    private androidx.compose.runtime.MutableState<com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditNoteState> _state;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditNoteState> state = null;
    private java.lang.Integer noteId = -1;
    private java.lang.Integer color = -1;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> _flowEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> flowEvent = null;
    
    @javax.inject.Inject()
    public AddEditViewModel(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.domain.use_case.NoteUseCases useCases, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditNoteState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> getFlowEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.presentation.add_edit_note.util.AddEditEvent event) {
    }
}