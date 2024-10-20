package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingImsConnectionTrackerBinder extends IImsConnectionTracker.Stub implements adud<IImsConnectionTracker> {
    private IImsConnectionTracker a;
    private final Context b;

    public ForwardingImsConnectionTrackerBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // defpackage.adud
    public synchronized IImsConnectionTracker getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public ImsRegistrationState getRegistrationState() {
        return ((IImsConnectionTracker) getDelegate()).getRegistrationState();
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public boolean isRegistered() {
        return ((IImsConnectionTracker) getDelegate()).isRegistered();
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IImsConnectionTracker) iBinder;
    }
}
