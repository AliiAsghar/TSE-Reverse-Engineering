package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForwardingBusinessInfoBinder extends IBusinessInfo.Stub implements adud<IBusinessInfo> {
    private IBusinessInfo a;
    private final Context b;

    public ForwardingBusinessInfoBinder(Context context) {
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

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) {
        ((IBusinessInfo) getDelegate()).retrieveBusinessInfo(str);
    }

    @Override // defpackage.adud
    public synchronized void set(IBinder iBinder) {
        this.a = (IBusinessInfo) iBinder;
    }

    @Override // defpackage.adud
    public synchronized IBusinessInfo getInterface() {
        return this.a;
    }
}
