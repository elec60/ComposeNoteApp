package com.mousavi.noteappwithcompose.feature_note.domain.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "", "orderType", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;)V", "getOrderType", "()Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;", "copy", "Color", "Date", "Title", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Title;", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Date;", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Color;", "app_debug"})
public abstract class NoteOrder {
    @org.jetbrains.annotations.NotNull()
    private final com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType = null;
    
    private NoteOrder(com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType getOrderType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder copy(@org.jetbrains.annotations.NotNull()
    com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Title;", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "orderType", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;)V", "app_debug"})
    public static final class Title extends com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder {
        
        public Title(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Date;", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "orderType", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;)V", "app_debug"})
    public static final class Date extends com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder {
        
        public Date(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder$Color;", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/NoteOrder;", "orderType", "Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;", "(Lcom/mousavi/noteappwithcompose/feature_note/domain/util/OrderType;)V", "app_debug"})
    public static final class Color extends com.mousavi.noteappwithcompose.feature_note.domain.util.NoteOrder {
        
        public Color(@org.jetbrains.annotations.NotNull()
        com.mousavi.noteappwithcompose.feature_note.domain.util.OrderType orderType) {
            super(null);
        }
    }
}