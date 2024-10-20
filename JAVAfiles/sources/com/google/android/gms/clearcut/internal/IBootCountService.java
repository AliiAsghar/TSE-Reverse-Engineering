package com.google.android.gms.clearcut.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.clearcut.internal.IBootCountCallbacks;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IBootCountService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IBootCountService {
        static final int TRANSACTION_getBootCount = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IBootCountService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountService");
            }

            @Override // com.google.android.gms.clearcut.internal.IBootCountService
            public void getBootCount(IBootCountCallbacks iBootCountCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBootCountCallbacks);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.clearcut.internal.IBootCountService");
        }

        public static IBootCountService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IBootCountService");
            if (queryLocalInterface instanceof IBootCountService) {
                return (IBootCountService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                IBootCountCallbacks asInterface = IBootCountCallbacks.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                getBootCount(asInterface);
                return true;
            }
            return false;
        }
    }

    void getBootCount(IBootCountCallbacks iBootCountCallbacks);
}
