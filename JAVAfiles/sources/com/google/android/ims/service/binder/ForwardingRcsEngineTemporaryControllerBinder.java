package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingRcsEngineTemporaryControllerBinder extends IRcsEngineTemporaryController.Stub implements adud<IRcsEngineTemporaryController> {
    private IRcsEngineTemporaryController a;
    private final Context b;

    public ForwardingRcsEngineTemporaryControllerBinder(Context context) {
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
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsEngineTemporaryController) iBinder;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStartRcsStack(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStopRcsStack(str);
    }

    @Override // defpackage.adud
    public synchronized IRcsEngineTemporaryController getInterface() {
        return this.a;
    }
}
