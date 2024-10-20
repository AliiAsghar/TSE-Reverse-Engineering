package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import defpackage.adom;
import defpackage.adud;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ForwardingSingleRegistrationVendorImsControllerBinder extends ISingleRegistrationVendorImsController.Stub implements adud<ISingleRegistrationVendorImsController> {
    private ISingleRegistrationVendorImsController a;
    private final Context b;

    public ForwardingSingleRegistrationVendorImsControllerBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.adud
    public void clear() {
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
    public synchronized ISingleRegistrationVendorImsController getInterface() {
        return this.a;
    }

    @Override // defpackage.adud
    public void set(IBinder iBinder) {
        this.a = (ISingleRegistrationVendorImsController) iBinder;
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult setupVendorIms(int i) {
        return ((ISingleRegistrationVendorImsController) getDelegate()).setupVendorIms(i);
    }

    @Override // com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController
    public SingleRegistrationVendorImsServiceResult terminateVendorIms(int i) {
        return ((ISingleRegistrationVendorImsController) getDelegate()).terminateVendorIms(i);
    }
}
