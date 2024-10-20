package com.google.android.apps.messaging.shared;

import android.content.Intent;
import defpackage.lzo;
import defpackage.rjb;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NoConfirmationSmsSendService extends lzo {
    public rjb a;

    public NoConfirmationSmsSendService() {
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        this.a.a(null, intent);
    }
}
