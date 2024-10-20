package com.google.android.gms.fido.credentialstore.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.credentialstore.KeyData;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IKeyDataCallbacks extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IKeyDataCallbacks {
        static final int TRANSACTION_onResult = 1;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IKeyDataCallbacks {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
            }

            @Override // com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks
            public void onResult(Status status, KeyData keyData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                iax.d(obtainAndWriteInterfaceToken, keyData);
                transactOneway(1, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
        }

        public static IKeyDataCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.credentialstore.internal.IKeyDataCallbacks");
            if (queryLocalInterface instanceof IKeyDataCallbacks) {
                return (IKeyDataCallbacks) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                KeyData keyData = (KeyData) iax.a(parcel, KeyData.CREATOR);
                enforceNoDataAvail(parcel);
                onResult(status, keyData);
                return true;
            }
            return false;
        }
    }

    void onResult(Status status, KeyData keyData);
}
