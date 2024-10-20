package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.util.Log;
import defpackage.alog;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TextClassifierLibImpl extends TextClassifierLib {
    static {
        Log.isLoggable("TextClassifierLibImpl", 3);
        TimeUnit.HOURS.toMillis(1L);
        alog.x("address", "email", "phone", "url", "date", "datetime", "flight");
        alog.C("view_calendar", "view_map", "track_flight", "open_url", "send_sms", "call_phone", "send_email", "text_reply", "create_reminder", "share_location", "add_contact", "copy", new String[0]);
    }

    @Override // com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib
    public long getNativeGuardedNativeModelsPointer() {
        throw null;
    }
}
