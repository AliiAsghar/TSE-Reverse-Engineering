package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingRcsEngineControllerBinder extends IRcsEngineController.Stub implements adud<IRcsEngineController> {
    private IRcsEngineController a;
    private final Context b;

    public ForwardingRcsEngineControllerBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public synchronized void clear() {
        this.a = null;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult destroy(int i) {
        return ((IRcsEngineController) getDelegate()).destroy(i);
    }

    @Override // defpackage.adud
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return adom.v(this);
    }

    @Override // defpackage.adud
    public synchronized IRcsEngineController getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult initialize(int i, int i2) {
        return ((IRcsEngineController) getDelegate()).initialize(i, i2);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
        return ((IRcsEngineController) getDelegate()).initializeAndStartRcsTransport(initializeAndStartRcsTransportRequest);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsEngineController) iBinder;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
        return ((IRcsEngineController) getDelegate()).stopAllRcsTransportsExcept(stopAllRcsTransportsExceptRequest);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
        return ((IRcsEngineController) getDelegate()).triggerStartRcsStack(i);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
        return ((IRcsEngineController) getDelegate()).triggerStopRcsStack(i);
    }
}
