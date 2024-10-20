package com.google.android.ims.rcsservice.chatsession.message;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConversationSuggestionResponse {
    public String displayText;
    public String postBackData;
    public ConversationSuggestionResponseType type;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public enum ConversationSuggestionResponseType {
        UNKNOWN,
        REPLY,
        ACTION
    }
}
