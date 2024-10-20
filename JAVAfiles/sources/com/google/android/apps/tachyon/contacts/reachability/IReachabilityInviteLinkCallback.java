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
public interface IReachabilityInviteLinkCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IReachabilityInviteLinkCallback {
        static final int TRANSACTION_onFinished = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IReachabilityInviteLinkCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback");
            }

            @Override // com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback
            public void onFinished(Map map) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeMap(map);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback");
        }

        public static IReachabilityInviteLinkCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.contacts.reachability.IReachabilityInviteLinkCallback");
            if (queryLocalInterface instanceof IReachabilityInviteLinkCallback) {
                return (IReachabilityInviteLinkCallback) queryLocalInterface;
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
