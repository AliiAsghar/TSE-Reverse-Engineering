package com.google.android.apps.messaging.shared.receiver.link;

import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import defpackage.albo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomTabsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (albo.ah(dataString)) {
            return;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, dataString));
    }
}
