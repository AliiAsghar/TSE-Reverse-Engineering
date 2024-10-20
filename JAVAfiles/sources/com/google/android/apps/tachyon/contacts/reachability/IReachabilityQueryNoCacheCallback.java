package com.google.android.apps.tachyon.contacts.reachability;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import defpackage.iax;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IReachabilityQueryNoCacheCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IReachabilityQueryNoCacheCallback {
        static final int TRANSACTION_onFinished = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IReachabilityQueryNoCacheCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback
            public void onFinished(Map map) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
        }

        public static IReachabilityQueryNoCacheCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityQueryNoCacheCallback");
            if (queryLocalInterface instanceof IReachabilityQueryNoCacheCallback) {
                return (IReachabilityQueryNoCacheCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                HashMap c = iax.c(parcel);
                enforceNoDataAvail(parcel);
                onFinished(c);
                return true;
            }
            return false;
        }
    }

    void onFinished(Map map);
}
