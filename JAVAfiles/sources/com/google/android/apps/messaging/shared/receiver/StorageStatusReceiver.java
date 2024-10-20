package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.akrc;
import defpackage.aksr;
import defpackage.armf;
import defpackage.wlz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StorageStatusReceiver extends wlz {
    public armf a;

    @Override // defpackage.wng
    public final akrc a() {
        return ((aksr) this.a.b()).b("StorageStatusReceiver Receive broadcast");
    }

    @Override // defpackage.wng
    public final String b() {
        return null;
    }

    @Override // defpackage.wng
    protected final int e() {
        return 11;
    }

    @Override // defpackage.wng
    public final void c(Context context, Intent intent) {
    }
}
