package com.google.android.gms.fido.fido2.api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.Status;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ICredentialListCallback extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements ICredentialListCallback {
        static final int TRANSACTION_onCredentialListResult = 1;
        static final int TRANSACTION_onError = 2;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements ICredentialListCallback {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.fido.fido2.api.ICredentialListCallback");
            }

            @Override // com.google.android.gms.fido.fido2.api.ICredentialListCallback
            public void onCredentialListResult(List list) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeList(list);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.fido.fido2.api.ICredentialListCallback
            public void onError(Status status) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, status);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
        }

        public static ICredentialListCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
            if (queryLocalInterface instanceof ICredentialListCallback) {
                return (ICredentialListCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                Status status = (Status) iax.a(parcel, Status.CREATOR);
                enforceNoDataAvail(parcel);
                onError(status);
            } else {
                ArrayList b = iax.b(parcel);
                enforceNoDataAvail(parcel);
                onCredentialListResult(b);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onCredentialListResult(List list);

    void onError(Status status);
}
