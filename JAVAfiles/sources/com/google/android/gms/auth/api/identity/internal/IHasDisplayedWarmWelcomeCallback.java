package com.google.android.gms.auth.api.identity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IHasDisplayedWarmWelcomeCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IHasDisplayedWarmWelcomeCallback {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IHasDisplayedWarmWelcomeCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback");
            }

            @Override // com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback
            public void onResult(Status status, boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback");
        }

        public static IHasDisplayedWarmWelcomeCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IHasDisplayedWarmWelcomeCallback");
            if (queryLocalInterface instanceof IHasDisplayedWarmWelcomeCallback) {
                return (IHasDisplayedWarmWelcomeCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                boolean g = iax.g(parcel);
                enforceNoDataAvail(parcel);
                onResult(status, g);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, boolean z);
}
