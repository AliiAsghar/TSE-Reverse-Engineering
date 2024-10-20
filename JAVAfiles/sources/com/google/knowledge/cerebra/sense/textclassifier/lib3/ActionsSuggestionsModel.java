package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import defpackage.aovo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ActionsSuggestionsModel implements AutoCloseable {

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ActionSuggestion {
        public ActionSuggestion(String str, String str2, float f, NamedVariant[] namedVariantArr, byte[] bArr, RemoteActionTemplate[] remoteActionTemplateArr, Slot[] slotArr) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ActionSuggestionOptions {
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ActionSuggestions {
        public ActionSuggestions(ActionSuggestion[] actionSuggestionArr, boolean z) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class Conversation {
        public ConversationMessage[] getConversationMessages() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class ConversationMessage {
        public String getDetectedTextLanguageTags() {
            throw null;
        }

        public long getReferenceTimeMsUtc() {
            throw null;
        }

        public String getReferenceTimezone() {
            throw null;
        }

        public String getText() {
            throw null;
        }

        public int getUserId() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public static final class Slot {
        public Slot(String str, int i, int i2, int i3, float f) {
        }
    }

    static {
        aovo.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    protected final void finalize() {
        try {
            throw null;
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }
}
