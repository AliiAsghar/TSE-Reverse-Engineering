package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingTransportControlEngine extends ITransportControl.Stub implements adud<ITransportControl> {
    private ITransportControl a;
    private final Context b;

    public ForwardingTransportControlEngine(Context context) {
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
    public synchronized ITransportControl getInterface() {
        return this.a;
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (ITransportControl) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        return ((ITransportControl) getDelegate()).useTransport(transportOptions);
    }
}
