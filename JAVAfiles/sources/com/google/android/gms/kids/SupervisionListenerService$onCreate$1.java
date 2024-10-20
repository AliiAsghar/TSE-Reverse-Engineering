package com.google.android.gms.kids;

import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.kids.internal.ISupervisionListener;
import defpackage.abqq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SupervisionListenerService$onCreate$1 extends ISupervisionListener.Stub {
    final /* synthetic */ SupervisionListenerService this$0;

    SupervisionListenerService$onCreate$1(SupervisionListenerService supervisionListenerService) {
        this.this$0 = supervisionListenerService;
    }

    @Override // com.google.android.gms.kids.internal.ISupervisionListener
    public void onSupervisionExited() {
        this.this$0.a();
    }

    @Override // com.google.android.aidl.BaseStub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        parcel.getClass();
        if (abqq.c(this.this$0.getApplicationContext()).d(Binder.getCallingUid())) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        throw new RemoteException("Calling uid is not Google signed");
    }
}
