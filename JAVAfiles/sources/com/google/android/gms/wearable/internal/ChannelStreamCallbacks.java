package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.internal.IChannelStreamCallbacks;
import defpackage.abhg;
import defpackage.ackw;
import defpackage.actx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChannelStreamCallbacks extends IChannelStreamCallbacks.Stub {
    private final Object a = new Object();
    private ackw b;
    private actx c;

    @Override // com.google.android.gms.wearable.internal.IChannelStreamCallbacks
    public void onChannelUnexpectedlyClosed(int i, int i2) {
        ackw ackwVar;
        actx actxVar;
        synchronized (this.a) {
            ackwVar = this.b;
            actxVar = new actx();
            this.c = actxVar;
        }
        if (ackwVar != null) {
            ackwVar.a(actxVar);
        }
    }

    public void setListener(ackw ackwVar) {
        actx actxVar;
        synchronized (this.a) {
            abhg.m(ackwVar);
            this.b = ackwVar;
            actxVar = this.c;
        }
        if (actxVar != null) {
            ackwVar.a(actxVar);
        }
    }
}
