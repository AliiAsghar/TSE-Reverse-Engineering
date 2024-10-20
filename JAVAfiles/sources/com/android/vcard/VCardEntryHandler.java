package com.android.vcard;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface VCardEntryHandler {
    void onEnd();

    void onEntryCreated(VCardEntry vCardEntry);

    void onStart();
}
