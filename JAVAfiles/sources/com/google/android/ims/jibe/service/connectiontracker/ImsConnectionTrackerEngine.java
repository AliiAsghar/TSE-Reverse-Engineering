package com.google.android.ims.jibe.service.connectiontracker;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.acoh;
import defpackage.adtw;
import defpackage.armf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ImsConnectionTrackerEngine extends IImsConnectionTracker.Stub {
    private final Context a;
    private final armf b;

    public ImsConnectionTrackerEngine(Context context, armf<acoh> armfVar) {
        this.a = context;
        this.b = armfVar;
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public ImsRegistrationState getRegistrationState() {
        adtw.d(this.a, Binder.getCallingUid());
        return ((acoh) this.b.b()).getRegistrationState();
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public boolean isRegistered() {
        adtw.d(this.a, Binder.getCallingUid());
        return ((acoh) this.b.b()).isRegistered();
    }
}
