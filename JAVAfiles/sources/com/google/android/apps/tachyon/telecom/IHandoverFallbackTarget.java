package com.google.android.apps.tachyon.telecom;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IHandoverFallbackTarget extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IHandoverFallbackTarget {
        static final int TRANSACTION_disconnect = 1;
        static final int TRANSACTION_onSourceDisconnected = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IHandoverFallbackTarget {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget");
            }

            @Override // com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget
            public void disconnect() {
                transactOneway(1, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget
            public void onSourceDisconnected() {
                transactOneway(2, obtainAndWriteInterfaceToken());
            }
        }

        public Stub() {
            super("com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget");
        }

        public static IHandoverFallbackTarget asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.tachyon.telecom.IHandoverFallbackTarget");
            if (queryLocalInterface instanceof IHandoverFallbackTarget) {
                return (IHandoverFallbackTarget) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                onSourceDisconnected();
            } else {
                disconnect();
            }
            return true;
        }
    }

    void disconnect();

    void onSourceDisconnected();
}
