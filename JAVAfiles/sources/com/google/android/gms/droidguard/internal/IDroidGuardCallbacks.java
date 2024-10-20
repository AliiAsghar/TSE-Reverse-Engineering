package com.google.android.gms.droidguard.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IDroidGuardCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IDroidGuardCallbacks {
        static final int TRANSACTION_onDroidGuardResults = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IDroidGuardCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            }

            @Override // com.google.android.gms.droidguard.internal.IDroidGuardCallbacks
            public void onDroidGuardResults(byte[] bArr) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeByteArray(bArr);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
        }

        public static IDroidGuardCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardCallbacks");
            if (queryLocalInterface instanceof IDroidGuardCallbacks) {
                return (IDroidGuardCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                byte[] createByteArray = parcel.createByteArray();
                enforceNoDataAvail(parcel);
                onDroidGuardResults(createByteArray);
                return true;
            }
            return false;
        }
    }

    void onDroidGuardResults(byte[] bArr);
}
